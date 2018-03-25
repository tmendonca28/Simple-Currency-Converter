package com.tmendonca.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    // public static final double CONVERSION_FROM_USD_TO_POUNDS_FACTOR = 0.71;
    public static final double CONVERSION_FROM_POUNDS_TO_KSH_FACTOR = 142.66;

    public void convertCurrency (View view) {
        EditText editTextAmount = findViewById(R.id.editTextAmount);

        double amount = Double.parseDouble(editTextAmount.getText().toString());

        double amount_in_ksh = amount*CONVERSION_FROM_POUNDS_TO_KSH_FACTOR;
        DecimalFormat df = new DecimalFormat("#.##");
        amount_in_ksh = Double.valueOf(df.format(amount_in_ksh));

        Toasty.info(this, "Ksh " + Double.toString(amount_in_ksh), Toast.LENGTH_SHORT, false).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
