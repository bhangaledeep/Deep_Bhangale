package com.example.a08_06_2026_dialog_demo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {

    TextView txtViewDialog;
    Button btnAlertDialog,btnDatePickerDialog,btnTimePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewDialog = findViewById(R.id.txtViewDialog);
        btnAlertDialog = findViewById(R.id.btnAlertDialog);
        btnTimePickerDialog = findViewById(R.id.btnTimePickerDialog);
        btnDatePickerDialog = findViewById(R.id.btnDatePickerDialog);

        btnAlertDialog.setOnClickListener(new BtnAlertDialogClickListener());
    }

    public class BtnAlertDialogClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            AlertDialog.Builder alertDialogBuilder =
                    new AlertDialog.Builder(MainActivity.this);

            alertDialogBuilder.setIcon(R.drawable.ic_launcher_background);
            alertDialogBuilder.setTitle("Exam Submission");
            alertDialogBuilder.setMessage("Do you really want to submit the exam");
            alertDialogBuilder.setPositiveButton("Yes",new DialogPositiveButtonCLicked());
            alertDialogBuilder.setNegativeButton("No",new DialogNegativeButtonCLicked());
            alertDialogBuilder.setNeutralButton("Cancel",new DialogNeutralButtonCLicked());

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    public class DialogPositiveButtonCLicked implements DialogInterface.OnClickListener{

        @Override
        public void onClick(DialogInterface dialog, int i) {
            Toast.makeText(MainActivity.this,"Yes Button Clicked :"+i,Toast.LENGTH_LONG).show();
        }
    }

    public class DialogNegativeButtonCLicked implements DialogInterface.OnClickListener{

        @Override
        public void onClick(DialogInterface dialog, int i) {
            Toast.makeText(MainActivity.this,"No Button Clicked :"+i,Toast.LENGTH_LONG).show();
        }
    }

    public class DialogNeutralButtonCLicked implements DialogInterface.OnClickListener{

        @Override
        public void onClick(DialogInterface dialog, int i) {
            Toast.makeText(MainActivity.this,"Neutral Button Clicked :"+i,Toast.LENGTH_LONG).show();
        }
    }

}