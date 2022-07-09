package com.example.emicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class cicalc extends AppCompatActivity {
    EditText t,roi,p;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cicalc);
        p=findViewById(R.id.princ);
        roi=findViewById(R.id.roi);
        t=findViewById(R.id.ctime);
        res=findViewById(R.id.ciresult);
    }
    public void valci(View v){
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