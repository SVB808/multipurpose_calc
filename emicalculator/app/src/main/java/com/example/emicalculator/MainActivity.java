package com.example.emicalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    ImageButton hlth,fina,mths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        hlth = (ImageButton) findViewById(R.id.health);
        fina = (ImageButton) findViewById(R.id.finance);
        mths = (ImageButton) findViewById(R.id.maths);
    }
    public void movepageh(View v)
    {
        Intent jumph = new Intent(MainActivity.this,select_use_health.class);
        startActivity(jumph);
    }
    public void movepagef(View v)
    {
        Intent jumpf = new Intent(MainActivity.this,select_use_finance.class);
        startActivity(jumpf);
    }
    public void movepagem(View v)
    {
        Intent jumpm = new Intent(MainActivity.this,select_use_math.class);
        startActivity(jumpm);
    }
}
