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

import java.util.Random;

//import Java.util.Random;

public class FifthEditionActivity extends AppCompatActivity  implements View.OnClickListener {
    private TextView lblOutputD4, lblOutputD6, lblOutputD8, lblOutputD10, lblOutputD12, lblOutputD20, lblOutputDadv20, lblOutputAdv20;
    private Button btnD4, btnD6, btnD8, btnD10, btnD12, btnD20, btnDadv20, btnAdv20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fifth_edition);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnD4 = (Button) findViewById(R.id.btnDnD4);
        btnD4.setOnClickListener(this);
        btnD6 = (Button) findViewById(R.id.btnDnD6);
        btnD6.setOnClickListener(this);
        btnD8 = (Button) findViewById(R.id.btnDnD8);
        btnD8.setOnClickListener(this);
        btnD10 = (Button) findViewById(R.id.btnDnD10);
        btnD10.setOnClickListener(this);
        btnD12 = (Button) findViewById(R.id.btnDnD12);
        btnD12.setOnClickListener(this);
        btnD20 = (Button) findViewById(R.id.btnDnD20);
        btnD20.setOnClickListener(this);
        btnDadv20 = (Button) findViewById(R.id.btnDnDdav);
        btnDadv20.setOnClickListener(this);
        btnAdv20 = (Button) findViewById(R.id.btnDnDadv);
        btnAdv20.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        lblOutputD4 = (TextView) findViewById(R.id.txtDnD4);
        lblOutputD6 = (TextView) findViewById(R.id.txtDnD6);
        lblOutputD8 = (TextView) findViewById(R.id.txtDnD8);
        lblOutputD10 = (TextView) findViewById(R.id.txtDnD10);
        lblOutputD12 = (TextView) findViewById(R.id.txtDnD12);
        lblOutputD20 = (TextView) findViewById(R.id.txtDnD20);
        lblOutputAdv20 = (TextView) findViewById(R.id.txtDnDadv);
        lblOutputDadv20 = (TextView) findViewById(R.id.txtDnDdav);
        //can this be made into a case statement?
        if(btnD4.isPressed()){
            lblOutputD4.setText(MainMenuActivity.getRandomNumber(4));
        }
        else if(btnD6.isPressed()){
            lblOutputD6.setText((MainMenuActivity.getRandomNumber(6)));
        }
        else if(btnD8.isPressed()){
            lblOutputD8.setText((MainMenuActivity.getRandomNumber(8)));
        }
        else if(btnD10.isPressed()){
            lblOutputD10.setText((MainMenuActivity.getRandomNumber(10)));
        }
        else if(btnD12.isPressed()){
            lblOutputD12.setText((MainMenuActivity.getRandomNumber(12)));
        }
        else if(btnD20.isPressed()){
            lblOutputD20.setText((MainMenuActivity.getRandomNumber(20)));
        }
        else if(btnAdv20.isPressed()){
            String x = MainMenuActivity.getRandomNumber(20);
            String y = MainMenuActivity.getRandomNumber(20);
            if(Integer.parseInt(x)>Integer.parseInt(y)){
                lblOutputAdv20.setText(x);
            }
            else{
                lblOutputAdv20.setText(y);
            }
        }
        else if(btnDadv20.isPressed()){
            String x = MainMenuActivity.getRandomNumber(20);
            String y = MainMenuActivity.getRandomNumber(20);
            if(Integer.parseInt(x)<Integer.parseInt(y)){
                lblOutputDadv20.setText(x);
            }
            else{
                lblOutputDadv20.setText(y);
            }
        }
    }


}