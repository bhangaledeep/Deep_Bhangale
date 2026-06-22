package com.example.assignment_contact_custom_dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AddContactDialog.OnContactAddedListener {

    Button addContactButton;
    TextView contactTextView,txtNoContactAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addContactButton = findViewById(R.id.addContactButton);
        contactTextView = findViewById(R.id.contactTextView);
        txtNoContactAdded = findViewById(R.id.txtNoContactAdded);

        addContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddContactDialog dialog = new AddContactDialog(MainActivity.this,
                        MainActivity.this);

                dialog.show();
            }
        });
    }

    @Override
    public void onContactAdded(String name, String phone) {

        String existingContacts = txtNoContactAdded.getText().toString();

        if(existingContacts.equals("No Contacts Added")){
            txtNoContactAdded.setText(
                    "\nName: " + name +
                    "\nPhone: " + phone + "\n"
            );
        }
        else{
            txtNoContactAdded.append(
                    "\nName: " + name +
                    "\nPhone: " + phone + "\n"
            );
        }
    }
}