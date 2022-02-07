package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button butplus, butminus, butumnozh, butdelit, butudalit;
    private TextView operator, result;
    private EditText number1, number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butplus = findViewById(R.id.button3);
        butminus = findViewById(R.id.button4);
        butumnozh = findViewById(R.id.button5);
        butdelit = findViewById(R.id.button6);

        butudalit = findViewById(R.id.button8);
        operator = findViewById(R.id.textView6);
        number1 = findViewById(R.id.editTextPhone);
        number2 = findViewById(R.id.editTextPhone2);
        result = findViewById(R.id.textView8);
        butplus.setOnClickListener(this);
        butudalit.setOnClickListener(this);
        butdelit.setOnClickListener(this);
        butumnozh.setOnClickListener(this);
        butminus.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        float num1 = 0;
        float num2 = 0;
        float res = 0;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        switch (view.getId()) {
            case R.id.button3:
                operator.setText("+");
                res = num1 + num2;
                break;
            case R.id.button4:
                operator.setText("-");
                res = num1 - num2;
                break;
            case R.id.button5:
                operator.setText("*");
                res = num1 * num2;
                break;
            case R.id.button6:
                operator.setText("/");
                res = num1 / num2;
                break;

            case R.id.button8:
                number1.setText("");
                operator.setText("");
                number2.setText("");
                result.setText("");
                break;
            default:
                break;
        }
        result.setText(res+"");
    }
}