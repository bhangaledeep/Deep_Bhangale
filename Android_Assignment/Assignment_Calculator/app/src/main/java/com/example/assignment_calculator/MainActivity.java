package com.example.assignment_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    double firstNumber,secondNumber;
    String operator = "";
    EditText edtEditText;

    Button clearButton,perButton,cutButton,
            divideButton,sevenButton,eightButton,nineButton,multiButton,
            fiveButton,fourButton,sixButton,subButton,oneButton,twoButton,
            threeButton,addButton,twoZeroButton,zeroButton,dotButton,equalToButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setUpNumListeners();
        setUpOperatorListener();
        setClearListener();
        setCutListener();
        setEqualToListener();
    }

    public void initView() {
        edtEditText = findViewById(R.id.edtEditText);

        oneButton = findViewById(R.id.oneButton);
        twoButton = findViewById(R.id.twoButton);
        threeButton = findViewById(R.id.threeButton);
        fourButton = findViewById(R.id.fourButton);
        fiveButton = findViewById(R.id.fiveButton);
        sixButton = findViewById(R.id.sixButton);
        sevenButton = findViewById(R.id.sevenButton);
        eightButton = findViewById(R.id.eightButton);
        nineButton = findViewById(R.id.nineButton);
        zeroButton = findViewById(R.id.zeroButton);

        divideButton = findViewById(R.id.divideButton);
        multiButton = findViewById(R.id.multiButton);
        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        perButton = findViewById(R.id.perButton);

        clearButton = findViewById(R.id.clearButton);
        cutButton = findViewById(R.id.cutButton);

        twoZeroButton = findViewById(R.id.twoZeroButton);
        equalToButton = findViewById(R.id.equalToButton);
        dotButton = findViewById(R.id.dotButton);

    }

    public void setUpNumListeners() {

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("1");
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("2");
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("3");
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("4");
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("5");
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("6");
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("7");
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("8");
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("9");
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("0");
            }
        });

        twoZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.append("00");
            }
        });

        dotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = edtEditText.getText().toString();

                if (!text.contains(".")) {
                    edtEditText.append(".");
                }
            }
        });
    }

    public void setUpOperatorListener(){

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtEditText.getText().toString().isEmpty()) {
                    return;
                }

                firstNumber = Double.parseDouble(
                        edtEditText.getText().toString());

                operator = "+";
                edtEditText.setText("");
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtEditText.getText().toString().isEmpty()) {
                    return;
                }

                firstNumber = Double.parseDouble(
                        edtEditText.getText().toString());

                operator = "-";
                edtEditText.setText("");
            }
        });

        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtEditText.getText().toString().isEmpty()) {
                    return;
                }

                firstNumber = Double.parseDouble(
                        edtEditText.getText().toString());

                operator = "*";
                edtEditText.setText("");
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtEditText.getText().toString().isEmpty()) {
                    return;
                }

                firstNumber = Double.parseDouble(
                        edtEditText.getText().toString());

                operator = "/";
                edtEditText.setText("");
            }
        });

        perButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtEditText.getText().toString().isEmpty()) {
                    return;
                }

                firstNumber = Double.parseDouble(
                        edtEditText.getText().toString());

                operator = "%";
                edtEditText.setText("");
            }
        });
    }

    public void setClearListener(){

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtEditText.setText("");
                firstNumber = 0;
                secondNumber = 0;
                operator = "";
            }
        });
    }

    public void setCutListener(){

        cutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edtEditText.getText().toString();

                if(!text.isEmpty()){
                    text = text.substring(0,text.length()-1);
                    edtEditText.setText(text);
                    edtEditText.setSelection(text.length());
                }
            }
        });
    }

    public void setEqualToListener(){

        equalToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtEditText.getText().toString().isEmpty()){
                    return;
                }

                try {
                    secondNumber = Double.parseDouble(
                            edtEditText.getText().toString());
                }
                catch (Exception e) {
                    edtEditText.setText("Error");
                    return;
                }

                double result = 0;

                switch (operator) {

                    case "+":
                        result = firstNumber + secondNumber;
                        break;

                    case "-":
                        result = firstNumber - secondNumber;
                        break;

                    case "*":
                        result = firstNumber * secondNumber;
                        break;

                    case "/":
                        if (secondNumber == 0) {
                            edtEditText.setText("Error");
                            return;
                        }
                        result = firstNumber / secondNumber;
                        break;

                    case "%":
                        result = firstNumber % secondNumber;
                        break;
                }

                edtEditText.setText(String.valueOf(result));
                operator = "";
            }
        });
    }

}