package org.code_crew.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Define variables to use for input and calculations
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonDivide;
    Button buttonMultiply;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonEquals;
    EditText result;
    EditText newNumber;
    View.OnClickListener onClick = null;
    int value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button0 = findViewById(R.id.button0);
         button1 = findViewById(R.id.button1);
         button2 = findViewById(R.id.button2);
         button3 = findViewById(R.id.button3);
         button4 = findViewById(R.id.button4);
         button5 = findViewById(R.id.button5);
         button6 = findViewById(R.id.button6);
         button7 = findViewById(R.id.button7);
         button8 = findViewById(R.id.button8);
         button9 = findViewById(R.id.button9);

         newNumber = findViewById(R.id.newNumber);

        // Add any variables to handle the input
    }



    public void valueZero(View view) {
        value = 0;
        String newValue = "" + value;
        newNumber.append(newValue);

    }

    public void valueOne(View view) {
        value = 1;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    public void valueTwo(View view) {
        value = 2;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    public void valueThree(View view) {
        value = 3;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    public void valueFour(View view) {
        value = 4;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    public void valueFive(View view) {
        value = 5;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    public void valueSix(View view) {
        value = 6;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    public void valueSeven(View view) {
        value = 7;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    public void valueEight(View view) {
        value = 8;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    public void valueNine(View view) {
        value = 9;
        String newValue = "" + value;
        newNumber.append(newValue);
    }

    // Add method to handler operators



    // Add method(s) to handle performing the operations

    // Add method(s) to handle numbers

    // Add method(s) to Handle Clear function
}
