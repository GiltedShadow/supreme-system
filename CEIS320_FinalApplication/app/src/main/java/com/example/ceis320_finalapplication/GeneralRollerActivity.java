package com.example.ceis320_finalapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GeneralRollerActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView lblOutputD2, lblOutputD3, lblOutputD4, lblOutputD6, lblOutputD8, lblOutputD10,
            lblOutputD12, lblOutputD20, lblOutputD50, lblOutputD100, lblOutputPercentile;

    private Button btnD2, btnD3, btnD4, btnD6, btnD8, btnD10, btnD12, btnD20, btnD50, btnD100, btnPercentile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_general_roller);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnD2 = (Button) findViewById(R.id.btnGenD2);
        btnD2.setOnClickListener(this);
        btnD3 = (Button) findViewById(R.id.btnGenD3);
        btnD3.setOnClickListener(this);
        btnD4 = (Button) findViewById(R.id.btnGenD4);
        btnD4.setOnClickListener(this);
        btnD6 = (Button) findViewById(R.id.btnGenD6);
        btnD6.setOnClickListener(this);
        btnD8 = (Button) findViewById(R.id.btnGenD8);
        btnD8.setOnClickListener(this);
        btnD10 = (Button) findViewById(R.id.btnGenD10);
        btnD10.setOnClickListener(this);
        btnD12 = (Button) findViewById(R.id.btnGenD12);
        btnD12.setOnClickListener(this);
        btnD20 = (Button) findViewById(R.id.btnGenD20);
        btnD20.setOnClickListener(this);
        btnD50 = (Button) findViewById(R.id.btnGenD50);
        btnD50.setOnClickListener(this);
        btnD100 = (Button) findViewById(R.id.btnGenD100);
        btnD100.setOnClickListener(this);
        btnPercentile = (Button) findViewById(R.id.btnGenPercentile);
        btnPercentile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String percentString = "";
        lblOutputD2 = (TextView) findViewById(R.id.txtGenD2);
        lblOutputD3 = (TextView) findViewById(R.id.txtGenD3);
        lblOutputD4 = (TextView) findViewById(R.id.txtGenD4);
        lblOutputD6 = (TextView) findViewById(R.id.txtGenD6);
        lblOutputD8 = (TextView) findViewById(R.id.txtGenD8);
        lblOutputD10 = (TextView) findViewById(R.id.txtGenD10);
        lblOutputD12 = (TextView) findViewById(R.id.txtGenD12);
        lblOutputD20 = (TextView) findViewById(R.id.txtGenD20);
        lblOutputD50 = (TextView) findViewById(R.id.txtGenD50);
        lblOutputD100 = (TextView) findViewById(R.id.txtGenD100);
        lblOutputPercentile = (TextView) findViewById(R.id.txtGenPercentile);

        if(btnD2.isPressed()){
            lblOutputD2.setText(MainMenuActivity.getRandomNumber(2));
        }
        if(btnD3.isPressed()){
            lblOutputD3.setText(MainMenuActivity.getRandomNumber(3));
        }
        if(btnD4.isPressed()){
            lblOutputD4.setText(MainMenuActivity.getRandomNumber(4));
        }
        if(btnD6.isPressed()){
            lblOutputD6.setText(MainMenuActivity.getRandomNumber(6));
        }
        if(btnD8.isPressed()){
            lblOutputD8.setText(MainMenuActivity.getRandomNumber(8));
        }
        if(btnD10.isPressed()){
            lblOutputD10.setText(MainMenuActivity.getRandomNumber(10));
        }
        if(btnD12.isPressed()){
            lblOutputD12.setText(MainMenuActivity.getRandomNumber(12));
        }
        if(btnD20.isPressed()){
            lblOutputD20.setText(MainMenuActivity.getRandomNumber(20));
        }
        if(btnD50.isPressed()){
            lblOutputD50.setText(MainMenuActivity.getRandomNumber(50));
        }
        if(btnD100.isPressed()){
            lblOutputD100.setText(MainMenuActivity.getRandomNumber(100));
        }
        if(btnPercentile.isPressed()){
            percentString = MainMenuActivity.getRandomNumber(100)+"%";
            lblOutputPercentile.setText(percentString);
        }

    }
}