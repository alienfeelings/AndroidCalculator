package com.example.my2ndapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText n1;
    EditText n2;
    TextView result;

    //instance of a class
    Calculations calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.number1);
        n2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);
    }

    public void Calculated(View v){
        double num1 = Double.parseDouble(n1.getText().toString()); //parsing to double, converting android text to java text
        double num2 = Double.parseDouble(n2.getText().toString());
        calc = new Calculations(num1, num2); // new instance of a class
        calc.Addition(); // calling addition method on the instance
        double r = calc.getResult(); // assigning getResult method to variable r
        result.setText("The result is --> " + r); //r is a number; you're trying to set text (error) --> implicit conversion --> .setText(""+r)
    }
}