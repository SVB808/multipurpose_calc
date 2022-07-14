package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Locale;

public class bfatcalc extends AppCompatActivity {
    Button bfval;
    EditText bfw,bfh,bfa,gr;
    TextView bfres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfatcalc);
        bfw=findViewById(R.id.bfweight);
        bfh=findViewById(R.id.bfheight);
        bfa=findViewById(R.id.bfage);
        bfres=findViewById(R.id.bfatres);
        bfval=(Button) findViewById(R.id.bfatval);
        gr=findViewById(R.id.genderr);
    }
    public void calculatebfat(View v) {
        int a;
        float rb, w, h, bfp;
        String g;
        a = Integer.parseInt(bfa.getText().toString());
        w = Float.parseFloat(bfw.getText().toString());
        h = Float.parseFloat(bfh.getText().toString());
        g = gr.getText().toString().toUpperCase();
            if (a < 18 & g == "M") {
                bfp = (float) ((1.51 * (w / ((h / 100) * (h / 100)))) - (1.70 * a) - 2.2);
            } else if (a < 18 & g == "F") {
                bfp = (float) ((1.51 * (w / ((h / 100) * (h / 100)))) - (1.70 * a) + 1.4);
            } else if (a >= 18 & g == "M") {
                bfp = (float) ((1.20 * (w / ((h / 100) * (h / 100)))) - (0.23 * a) - 16.2);
            } else{
                bfp = (float) ((1.20 * (w / ((h / 100) * (h / 100)))) - (0.23 * a) - 5.4);
            }
            bfres.setText("" + String.format("%.2f", bfp));
    }
}