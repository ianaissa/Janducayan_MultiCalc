package com.example.janducayan_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v) {
        EditText noOne = (EditText) findViewById(R.id.editTextNumber);
        EditText noTwo = (EditText) findViewById(R.id.editTextNumber2);
        EditText noThree = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(noOne.getText().toString());
        int n2 = Integer.parseInt(noTwo.getText().toString());
        int result = n1 + n2;

        noThree.setText("Total value " + result);

    }

    public void Subtract(View v) {
        EditText noOne = (EditText) findViewById(R.id.editTextNumber);
        EditText noTwo = (EditText) findViewById(R.id.editTextNumber2);
        EditText noThree = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(noOne.getText().toString());
        int n2 = Integer.parseInt(noTwo.getText().toString());
        int result = n1 - n2;

        noThree.setText("Subtract value " + result);
    }
    public void Multiply(View v) {
        EditText noOne = (EditText) findViewById(R.id.editTextNumber);
        EditText noTwo = (EditText) findViewById(R.id.editTextNumber2);
        EditText noThree = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(noOne.getText().toString());
        int n2 = Integer.parseInt(noTwo.getText().toString());
        int result = n1*n2;

        noThree.setText("Multiply value " + result);
    }
    public void Divide(View v) {
        EditText noOne = (EditText) findViewById(R.id.editTextNumber);
        EditText noTwo = (EditText) findViewById(R.id.editTextNumber2);
        EditText noThree = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(noOne.getText().toString());
        int n2 = Integer.parseInt(noTwo.getText().toString());
        int result = n1/n2;

        noThree.setText("Divide value " + result);
    }
}