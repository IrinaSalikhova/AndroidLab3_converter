package com.cst3104.androidlab3_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView euroAmount = findViewById(R.id.euroAmount);
        Button converter = findViewById(R.id.convertButton);
        EditText dollarAmount = findViewById(R.id.editDollarAmount);


        converter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    double dollarAmountDouble = Double.parseDouble(dollarAmount.getText().toString());
                    double euroAmountDouble = Math.floor(dollarAmountDouble * 85+0.5)/100;
                    String euroAmountString = new Double(euroAmountDouble).toString() + getString(R.string.euro) ;
                    euroAmount.setText(euroAmountString);

                } catch (Exception ex) {
                    Toast.makeText(MainActivity.this, getString(R.string.toast_message), Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}