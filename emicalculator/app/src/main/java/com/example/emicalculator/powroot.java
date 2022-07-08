package com.example.powwroot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class powroot extends AppCompatActivity {
    EditText a,b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.powroot);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        t=findViewById(R.id.textView1);

    }
    public void  b1(View v){
        float a1,b1,r;
        a1=Float.parseFloat(a.getText().toString());
        b1=Float.parseFloat(b.getText().toString());

        r= (float) Math.pow(a1,1/b1);
        String re;
        re = String.format("%.2f",r);
        t.setText("The ans is: \n"+re);

    }
    public void b2(View v){
        float a2,b2,r2;
        a2=Float.parseFloat(a.getText().toString());
        b2=Float.parseFloat(b.getText().toString());

        r2= (float) Math.pow(a2,b2);
        String re2;
        re2 = String.format("%.2f",r2);
        t.setText("The ans is: \n"+re2);
    }
}