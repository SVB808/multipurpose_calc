package com.example.cinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t,roi,p;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cicalc);
        p=findViewById(R.id.princ);
        roi=findViewById(R.id.roi);
        t=findViewById(R.id.time);
        res=findViewById(R.id.res);
    }
    public void calc(View v){
        float a,b,c;
        a = Float.parseFloat(p.getText().toString());
        b = Float.parseFloat(roi.getText().toString());
        c = Float.parseFloat(t.getText().toString());
        float y = c/12;
        float r = (float) (a*(Math.pow((1 + b / 100),y)));
        float ra = r-a;
        String rr;
        rr = String.format("%.2f",ra);
        res.setText(rr);


    }
}