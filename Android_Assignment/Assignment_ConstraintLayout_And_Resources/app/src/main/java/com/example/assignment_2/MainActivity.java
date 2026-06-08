package com.example.assignment_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageBitcodeLogo;
    TextView phoneTextView,emailIdTxtView,passingTextView,welcomeTextView,enquiryTextView,nameTextView,addressTextView,collegeTextView,techTextView;
    EditText phoneEditText,emailIdEditText,passingEditText,nameEditText,addressEditText,collegeEditText,techEditText;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageBitcodeLogo = findViewById(R.id.imageBitcodeLogo);
        welcomeTextView = findViewById(R.id.welcomeTextView);
        enquiryTextView = findViewById(R.id.enquiryTextView);
        nameTextView = findViewById(R.id.nameTextView);
        nameEditText = findViewById(R.id.nameEditText);
        addressTextView = findViewById(R.id.addressTextView);
        addressEditText = findViewById(R.id.addressEditText);
        collegeTextView = findViewById(R.id.collegeTextView);
        collegeEditText = findViewById(R.id.collegeEditText);
        techTextView = findViewById(R.id.techTextView);
        techEditText = findViewById(R.id.techEditText);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailIdTxtView = findViewById(R.id.emailIdTxtView);
        passingTextView = findViewById(R.id.passingTextView);
        phoneEditText = findViewById(R.id.phoneEditText);
        emailIdEditText = findViewById(R.id.emailIdEditText);
        passingEditText = findViewById(R.id.passingEditText);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameEditText.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(MainActivity.this,
                            "Enter valid name",
                            Toast.LENGTH_LONG).show();
                }
                else if(addressEditText.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(MainActivity.this,
                            "Enter valid address",
                            Toast.LENGTH_LONG).show();
                }
                else if(collegeEditText.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(MainActivity.this,
                            "Enter valid college name",
                            Toast.LENGTH_LONG).show();
                }
                else if(techEditText.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(MainActivity.this,
                            "Enter valid technology",
                            Toast.LENGTH_LONG).show();
                }
                else if(phoneEditText.length() != 10)
                {
                    Toast.makeText(MainActivity.this,
                            "Enter valid phone number",
                            Toast.LENGTH_LONG).show();
                }
                else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(emailIdEditText.getText().toString()).matches())
                {
                    Toast.makeText(MainActivity.this,
                            "Enter valid email",
                            Toast.LENGTH_LONG).show();
                }
                else if(passingEditText.length() != 4)
                {
                    Toast.makeText(MainActivity.this,
                            "Enter valid passing year",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,
                            "Form Submitted Successfully",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
