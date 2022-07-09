package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sicalc extends AppCompatActivity {
    EditText spri,stim,srat;
    TextView simres;
    Button calcusi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sicalc);
        srat=findViewById(R.id.sroi);
        spri=findViewById(R.id.sprinc);
        stim=findViewById(R.id.stime);
        simres=findViewById(R.id.siresult);
        calcusi=(Button) findViewById(R.id.calculatesi);
    }
    public void valsi(View v)
    {
        float simpleint,p,t,r;
        p=Float.parseFloat(spri.getText().toString());
        t=Float.parseFloat(stim.getText().toString());
        r=Float.parseFloat(srat.getText().toString());
        simpleint=((p*t*r)/100);
        simres.setText(""+String.format("%.2f",simpleint));
    }
}