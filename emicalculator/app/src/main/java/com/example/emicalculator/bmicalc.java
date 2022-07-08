package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bmicalc extends AppCompatActivity {
    EditText bmw,bmh,bma;
    TextView bmres,bmcat;
    Button bmval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);
        bmw=findViewById(R.id.bmiweight);
        bmh=findViewById(R.id.bmiheight);
        bma=findViewById(R.id.bmiage);
        bmres=findViewById(R.id.bmires);
        bmcat=findViewById(R.id.bmicat);
        bmval=(Button) findViewById(R.id.bmival);
    }
    public void calculatebmi(View v)
    {
        int a;
        float rb,w,h;
        a= Integer.parseInt(bma.getText().toString());
        w= Float.parseFloat(bmw.getText().toString());
        h= Float.parseFloat(bmh.getText().toString());
        rb=(w/((h/100)*(h/100)));
        bmres.setText(""+rb);
        if(rb<16)
        {
            bmcat.setText("Severe Thinness");
        }
        else if(rb>=16 & rb<=17)
        {
            bmcat.setText("Moderate Thinness");
        }
        else if(rb>17 & rb<=18.5)
        {
            bmcat.setText("Mild Thinness");
        }
        else if(rb>18.5 & rb<=25)
        {
            bmcat.setText("Normal");
        }
        else if(rb>25 & rb<=30)
        {
            bmcat.setText("Overweight");
        }
        else
        {
            bmcat.setText("Obese");
        }
    }
}