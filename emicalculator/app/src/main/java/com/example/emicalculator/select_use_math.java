package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_use_math extends AppCompatActivity {
    Button simb,qdb,pwb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_use_math);
        simb = (Button) findViewById(R.id.simpb);
        qdb = (Button) findViewById(R.id.quadb);
        pwb = (Button) findViewById(R.id.pb);
    }
    public void simpcalc (View v)
    {
        Intent jsimp = new Intent(select_use_math.this,simplecalc.class);
        startActivity(jsimp);
    }
    public void pcalc (View v)
    {
        Intent jpwr = new Intent(select_use_math.this,pwrcalc.class);
        startActivity(jpwr);
    }
    public void qcalc (View v)
    {
        Intent jquad = new Intent(select_use_math.this, quadcalc.class);
        startActivity(jquad);
    }
}