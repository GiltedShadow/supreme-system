package com.example.introandroidapp;


import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RadioGroup tempGroup = (RadioGroup) findViewById(R.id.tempGroup);
        tempGroup.setOnCheckedChangeListener(this);

    }
    /*
    There was an issue here using a radio button in a switch case, solve by adding
    android.nonFinalResIds=false
    to the gradle.properties file to build properly

    https://stackoverflow.com/questions/76430646/constant-expression-required-when-trying-to-create-a-switch-case-block
     */

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId){
        TextView lblOutput = (TextView) findViewById(R.id.lblOutput);
        switch (checkedId) {
            case R.id.btnDegFah:
                lblOutput.setText("You chose Fahrenheight");
                break;
            case R.id.btnDegCel:
                lblOutput.setText("You chose Celsius");
                break;
            case R.id.btnDegKel:
                lblOutput.setText("You chose Kelvin");
                break;
            default:
                break;
        }
    }
}