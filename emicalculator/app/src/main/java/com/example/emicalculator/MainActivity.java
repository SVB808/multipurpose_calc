package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText onroad, down,intrate, tenure,loan;
    TextView emiresult;
    Button carloan,emires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emicalc);

        onroad=(EditText)findViewById(R.id.carprice);
        down=(EditText)findViewById(R.id.dp);
        loan=(EditText)findViewById(R.id.loanamt);

        carloan=(Button) findViewById(R.id.calloan);
        emires=(Button) findViewById(R.id.calemi);

        intrate=(EditText)findViewById(R.id.rateofint);
        tenure=(EditText)findViewById(R.id.months);
        emiresult=(TextView) findViewById(R.id.emi);

        carloan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkroad=onroad.getText().toString();
                String checkdown=down.getText().toString();
                if(checkroad.matches(""))
                {
                    Toast.makeText( MainActivity.this, "Please enter a valid on road price of car",Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    if(checkdown.matches("")){
                    Toast.makeText( MainActivity.this, "Please enter a valid down payment price of car",Toast.LENGTH_SHORT).show();
                    return;
                }
                    else{
                        double carprice=Double.parseDouble(onroad.getText().toString());
                        double downpayment=Double.parseDouble(down.getText().toString());

                        String loanamt=String.valueOf(carprice=downpayment);
                        loan.setText(loanamt);
                }
                }
            }
        });

        emires.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String finalloan=loan.getText().toString();
                String interest =intrate.getText().toString();
                String month=tenure.getText().toString();
                if(finalloan.matches("")&&interest.matches("")&&month.matches("")){
                    Toast.makeText(MainActivity.this,"All the fields are required", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    double principal=Double.parseDouble(loan.getText().toString());
                    double irate=Double.parseDouble(intrate.getText().toString());
                    double time=Double.parseDouble(tenure.getText().toString());
                    double rate=irate/1200;
                    String finaemi=String.valueOf(((principal*rate*Math.pow(1+rate,time)/Math.pow(1+rate,time)-1)));
                    emiresult.setText(finaemi);
                }
            }
        });
        }
}