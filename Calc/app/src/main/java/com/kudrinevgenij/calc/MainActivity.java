package com.kudrinevgenij.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }

    public void clickNumber(View view) {
        String number = editText.getText().toString();
        switch (view.getId()) {
            case R.id.btn1: number = number + "1";
            break;
            case R.id.btn2: number = number + "2";
            break;
            case R.id.btn3: number = number + "3";
            break;
            case R.id.btn4: number = number + "4";
            break;
            case R.id.btn5: number = number + "5";
            break;
            case R.id.btn6: number = number + "6";
            break;
            case R.id.btn7: number = number + "7";
            break;
            case R.id.btn8: number = number + "8";
            break;
            case R.id.btn9: number = number + "9";
            break;
            case R.id.btn0: number = number + "0";
            break;
        }
        editText.setText(number);
    }
}