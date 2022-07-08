package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_use_health extends AppCompatActivity {
    Button bmib,bfatb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_use_health);
        bmib = (Button) findViewById(R.id.bmi);
        bfatb = (Button) findViewById(R.id.bfat);
    }
    public void bmicalc (View v)
    {
        Intent jbmi = new Intent(select_use_health.this,bmicalc.class);
        startActivity(jbmi);
    }
    public void bfatcalc (View v)
    {
        Intent jbfat = new Intent(select_use_health.this,bfatcalc.class);
        startActivity(jbfat);
    }
}