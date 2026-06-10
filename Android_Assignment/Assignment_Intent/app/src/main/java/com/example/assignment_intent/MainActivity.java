package com.example.assignment_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView defaultImage;
    Button lamborghiniButton,ferrariButton,bmwButton,rollsButton;

    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        attachListeners();

    }

    public void initViews()
    {
        defaultImage = findViewById(R.id.defaultImage);
        lamborghiniButton = findViewById(R.id.lamborghiniButton);
        ferrariButton = findViewById(R.id.ferrariButton);
        bmwButton = findViewById(R.id.bmwButton);
        rollsButton = findViewById(R.id.rollsButton);
    }

    public void attachListeners()
    {
        lamborghiniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("car","lambo");
                startActivityForResult(intent,1);
            }
        });

        ferrariButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("car","ferrari");
                startActivityForResult(intent,2);
            }
        });

        bmwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("car","bmw");
                startActivityForResult(intent,3);
            }
        });

        rollsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("car","rolls");
                startActivityForResult(intent,4);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK && data != null)
        {
            int imageId = data.getIntExtra("image", 0);

            defaultImage.setImageResource(imageId);
        }

    }
}
