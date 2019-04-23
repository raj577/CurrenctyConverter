package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
Button euro, pound, dollar, rubel, btc, aus, can, dinar, yen;
TextView textview;
EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        dollar = findViewById(R.id.dollar);
        pound = findViewById(R.id.pound);
        yen = findViewById(R.id.yen);
        rubel = findViewById(R.id.rubel);
        aus = findViewById(R.id.ausdollar);
        can = findViewById(R.id.candollar);
        textview = findViewById(R.id.textView);
        edittext = findViewById(R.id.editText);

euro.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
String z =edittext.getText().toString();
if(TextUtils.isEmpty(z)){

    edittext.setError("Oye koi number daal");
}
else{
double n,k;
n=Double.parseDouble(z);
textview.setText(null);
Formatter formatter = new Formatter();
k=n*0.012;
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    textview.setText(""+ numberFormat.format(k));



}
    }
});

pound.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String z = edittext.getText().toString();
        if(TextUtils.isEmpty(z)){
            edittext.setError("Empty User Input");
        }
        else{
            double n,k;
            n=Double.parseDouble(z);
            Formatter formatter =new Formatter();
            k=n*5;
            DecimalFormat numberFormat = new DecimalFormat("#.00000");
            textview.setText(""+ numberFormat.format(k));
        }
    }
});

    }
}
