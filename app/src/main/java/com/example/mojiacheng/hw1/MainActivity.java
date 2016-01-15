package com.example.mojiacheng.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fifteenPressed(View view) {
        EditText total = (EditText) findViewById(R.id.editText);
        double numTotal = Double.parseDouble(total.getText().toString());
        double tip = numTotal * 0.15;
        TextView tipAmount = (TextView) findViewById(R.id.tipAmount);
        tipAmount.setText(String.valueOf(tip));
    }

    public void eighteenPressed(View view) {
        EditText total = (EditText) findViewById(R.id.editText);
        double numTotal = Double.parseDouble(total.getText().toString());
        double tip = numTotal * 0.18;
        TextView tipAmount = (TextView) findViewById(R.id.tipAmount);
        tipAmount.setText(String.valueOf(tip));
    }

    public void twentyPressed(View view) {
        EditText total = (EditText) findViewById(R.id.editText);
        double numTotal = Double.parseDouble(total.getText().toString());
        double tip = numTotal * 0.2;
        TextView tipAmount = (TextView) findViewById(R.id.tipAmount);
        tipAmount.setText(String.valueOf(tip));
    }
}
