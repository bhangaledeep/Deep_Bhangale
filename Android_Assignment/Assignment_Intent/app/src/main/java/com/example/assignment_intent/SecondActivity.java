package com.example.assignment_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
;
    ImageView firstImage,secondImage,thirdImage,fourthImage;

    int img1,img2,img3,img4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        firstImage = findViewById(R.id.firstImage);
        secondImage = findViewById(R.id.secondImage);
        thirdImage = findViewById(R.id.thirdImage);
        fourthImage = findViewById(R.id.fourthImage);

        String car = getIntent().getStringExtra("car");

        if(car.equals("lambo"))
        {
            img1 = R.drawable.lambo_1;
            img2 = R.drawable.lambo_2;
            img3 = R.drawable.lambo_3;
            img4 = R.drawable.lambo_4;
        }
        else if(car.equals("ferrari"))
        {
            img1 = R.drawable.ferrari_1;
            img2 = R.drawable.ferrari_2;
            img3 = R.drawable.ferrari_3;
            img4 = R.drawable.ferrari_4;
        }
        else if(car.equals("bmw"))
        {
            img1 = R.drawable.bmw_1;
            img2 = R.drawable.bmw_2;
            img3 = R.drawable.bmw_3;
            img4 = R.drawable.bmw_4;
        }
        else if(car.equals("rolls"))
        {
            img1 = R.drawable.rolls_1;
            img2 = R.drawable.rolls_2;
            img3 = R.drawable.rolls_3;
            img4 = R.drawable.rolls_4;
        }
        firstImage.setImageResource(img1);
        secondImage.setImageResource(img2);
        thirdImage.setImageResource(img3);
        fourthImage.setImageResource(img4);


        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendImage(img1);
            }
        });

        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendImage(img2);
            }
        });

        thirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendImage(img3);
            }
        });

        fourthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendImage(img4);
            }
        });
    }
    public void sendImage(int imageId)
    {
        Intent intent = new Intent();

        intent.putExtra("image", imageId);

        setResult(RESULT_OK, intent);

        finish();
    }
}
