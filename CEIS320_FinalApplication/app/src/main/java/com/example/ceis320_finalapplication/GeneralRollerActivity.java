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

        btnD4 = (Button) findViewById(R.id.btnDnD4);
        btnD4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}