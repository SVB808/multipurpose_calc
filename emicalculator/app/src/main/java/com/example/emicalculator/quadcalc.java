package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class quadcalc extends AppCompatActivity {
    EditText a,b,c;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadcalc);
        a=findViewById(R.id.editText1);
        b=findViewById(R.id.editText2);
        c=findViewById(R.id.editText3);
        t=findViewById(R.id.textView1);

    }
    public void  button1(View v){
        float a1,b1,c1,r1,r2;
        a1=Float.parseFloat(a.getText().toString());
        b1=Float.parseFloat(b.getText().toString());
        c1=Float.parseFloat(c.getText().toString());

        r1= (float) (-b1+(Math.sqrt((b1*b1)-(4*a1*c1))))/(2*a1);
        r2= (float) (-b1-(Math.sqrt((b1*b1)-(4*a1*c1))))/(2*a1);
        String re1,re2;
        re1 = String.format("%.2f",r1);
        re2 = String.format("%.2f",r2);
        t.setText("The roots are: \n"+re1+","+re2);

    }
}