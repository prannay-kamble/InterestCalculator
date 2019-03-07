package com.gl.calculater;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.gl.calculater.service.IntersetCalculaterImpl;
import com.gl.calculater.service.iservice.IIntersetCalculater;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Button buttonSimpleInterest, buttonCompoundInterest;
    EditText editTextAmount, editTextYear, editTextRateInterest, calculateInterest;
    double amount, year, interest;

    //for validationj

    //for calculation
    IIntersetCalculater calculater = new IntersetCalculaterImpl();

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inilizeValue();
        convertValue();
        buttonSimpleInterest.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {

                        //for validation
                        boolean check = Validation.isChack(editTextAmount.getText().toString().trim(), editTextRateInterest.getText().toString().trim(), editTextYear.getText().toString().trim(), getApplicationContext());
                        if (check) {

                            amount = Double.parseDouble(editTextAmount.getText().toString());
                            year = Double.parseDouble(editTextYear.getText().toString());
                            interest = Double.parseDouble(editTextYear.getText().toString());

                            Double simpleInterest = calculater.simpleAmountCalculater(amount, interest, year);
                            calculateInterest.setText(simpleInterest.toString());
                        }
                    }
                });

        buttonCompoundInterest.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        //for validation
                        boolean chack = Validation.isChack(editTextAmount.getText().toString().trim(), editTextRateInterest.getText().toString().trim(), editTextYear.getText().toString().trim(), getApplicationContext());
                        if (chack) {

                            amount = Double.parseDouble(editTextAmount.getText().toString());
                            year = Double.parseDouble(editTextYear.getText().toString());
                            interest = Double.parseDouble(editTextYear.getText().toString());

                            Double compoundInterest = calculater.compountIntersetCalculater(amount, interest, year);
                            calculateInterest.setText(compoundInterest.toString());
                        }
                    }
                });
    }

    private void inilizeValue() {
        buttonSimpleInterest = (Button) findViewById(R.id.buttonSI);
        editTextAmount = (EditText) findViewById(R.id.editTextAmount);
        editTextYear = (EditText) findViewById(R.id.editTextYears);
        editTextRateInterest = (EditText) findViewById(R.id.editTextRateOfInterest);
        calculateInterest = (EditText) findViewById(R.id.editText4);
        buttonCompoundInterest = (Button) findViewById(R.id.buttonCompoundInterest);

    }

    private void convertValue() {

    }

}
