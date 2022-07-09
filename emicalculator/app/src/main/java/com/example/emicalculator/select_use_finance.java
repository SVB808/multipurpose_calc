package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_use_finance extends AppCompatActivity {
    Button eminstb,sinb,cinb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_use_finance);
        eminstb=(Button) findViewById(R.id.eb);
        sinb=(Button) findViewById(R.id.sib);
        cinb=(Button) findViewById(R.id.cib);
    }
    public void emcalc (View v)
    {
        Intent jemi = new Intent(select_use_finance.this,emicalc.class);
        startActivity(jemi);
    }
    public void sintcalc (View v)
    {
        Intent jsin = new Intent(select_use_finance.this,sicalc.class);
        startActivity(jsin);
    }
    public void cintcalc (View v)
    {
        Intent jcin = new Intent(select_use_finance.this,cicalc.class);
        startActivity(jcin);
    }
}