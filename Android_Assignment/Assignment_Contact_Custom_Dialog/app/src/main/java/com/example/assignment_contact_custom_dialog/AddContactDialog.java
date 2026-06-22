package com.example.assignment_contact_custom_dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

public class AddContactDialog extends Dialog {

    EditText edtName,edtPhoneNumber;
    Button saveButton,cancelButton;

    OnContactAddedListener listener;

    public interface OnContactAddedListener
    {
        void onContactAdded(String name, String phone);
    }

    public AddContactDialog(@NonNull Context context,OnContactAddedListener listener){
        super(context);
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add_contact_dialog);

        edtName = findViewById(R.id.edtName);
        edtPhoneNumber = findViewById(R.id.edtPhoneNumber);

        saveButton = findViewById(R.id.saveButton);
        cancelButton = findViewById(R.id.cancelButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtName.getText().toString().trim();
                String phone = edtPhoneNumber.getText().toString().trim();

                if(listener!=null){
                    listener.onContactAdded(name,phone);
                }
                dismiss();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dismiss();
            }
        });
    }
}
