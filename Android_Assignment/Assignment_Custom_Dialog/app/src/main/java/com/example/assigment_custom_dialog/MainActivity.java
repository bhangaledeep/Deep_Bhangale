package com.example.assigment_custom_dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;

    TextView nameTextView;
    Button customDialogButton;

    RadioButton radioLower,radioUpper;

    CheckBox checkboxReverse;

    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        customDialogButton = findViewById(R.id.customDialogButton);

        customDialogButton.setOnClickListener(new MyBtnCustomDialog());
    }

    public class MyBtnCustomDialog implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            dialog = new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.name_dialog);
            nameTextView = dialog.findViewById(R.id.nameTextView);
            radioLower = dialog.findViewById(R.id.radioLower);
            radioUpper = dialog.findViewById(R.id.radioUpper);
            checkboxReverse = dialog.findViewById(R.id.checkboxReverse);

            String text = nameEditText.getText().toString();

            if(text.isEmpty())
            {
                nameEditText.setError("Enter name");
                return;
            }
            nameTextView.setText(text);

            dialog.show();

            radioLower.setOnClickListener(new MyLowerRadioButton());
            radioUpper.setOnClickListener(new MyUpperRadioButton());
            checkboxReverse.setOnClickListener(new MyReverseCheckBox());
        }
    }

    public class MyLowerRadioButton implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String name = nameEditText.getText().toString();

            if(radioLower.isChecked()){
                nameTextView.setText(name.toLowerCase());
            }
        }
    }

    public class MyUpperRadioButton implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String name = nameEditText.getText().toString();

            if(radioUpper.isChecked()){
                nameTextView.setText(name.toUpperCase());
            }
        }
    }

    public class MyReverseCheckBox implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String name = nameTextView.getText().toString();

            if(checkboxReverse.isChecked()){
                nameTextView.setText(new StringBuilder(name).reverse().toString());
            }
        }
    }


}