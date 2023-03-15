package com.olio_murtomaa.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private TextView numberInput1, numberInput2;
    private Button buttonSum, buttonSubtract, buttonMultiply, buttonDivide;
    private TextView numberOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput1 = findViewById(R.id.editNumber1);
        numberInput2 = findViewById(R.id.editNumber2);
        buttonSum = findViewById(R.id.buttonSum);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        numberOutput = findViewById(R.id.numberOutput);
    }

    public void sumNumbers(View view) {
        String number1Text = numberInput1.getText().toString();
        String number2Text = numberInput2.getText().toString();
        if (number1Text.isEmpty() || number2Text.isEmpty()) {
            Toast.makeText(this, "Virhe: Anna molemmat numerot!", Toast.LENGTH_LONG).show();
            return;
        }

        int number1 = Integer.parseInt(numberInput1.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        int sum = number1 + number2;

        numberOutput.setText(number1 + " + " + number2 + " = " + sum);
    }

    public void subtractNumbers(View view) {
        String number1Text = numberInput1.getText().toString();
        String number2Text = numberInput2.getText().toString();
        if (number1Text.isEmpty() || number2Text.isEmpty()) {
            Toast.makeText(this, "Virhe: Anna molemmat numerot!", Toast.LENGTH_LONG).show();
            return;
        }

        int number1 = Integer.parseInt(numberInput1.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        int subtract = number1 - number2;

        numberOutput.setText(number1 + " - " + number2 + " = " + subtract);
    }

    public void multiplyNumbers(View view) {
        String number1Text = numberInput1.getText().toString();
        String number2Text = numberInput2.getText().toString();
        if (number1Text.isEmpty() || number2Text.isEmpty()) {
            Toast.makeText(this, "Virhe: Anna molemmat numerot!", Toast.LENGTH_SHORT).show();
            return;
        }

        int number1 = Integer.parseInt(numberInput1.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        int multiply = number1 * number2;

        numberOutput.setText(number1 + " * " + number2 + " = " + multiply);
    }

    public void divideNumbers(View view) {
        String number1Text = numberInput1.getText().toString();
        String number2Text = numberInput2.getText().toString();
        if (number1Text.isEmpty() || number2Text.isEmpty()) {
            Toast.makeText(this, "Virhe: Anna molemmat numerot!", Toast.LENGTH_LONG).show();
            return;
        }

        int number1 = Integer.parseInt(numberInput1.getText().toString());
        int number2 = Integer.parseInt(numberInput2.getText().toString());
        if (number2 != 0)   {
            int divide = number1 / number2;
            numberOutput.setText(number1 + " / " + number2 + " = " + divide);
        }   else {
            numberOutput.setText("Nollalla ei voi jakaa!");
        }
    }
}
