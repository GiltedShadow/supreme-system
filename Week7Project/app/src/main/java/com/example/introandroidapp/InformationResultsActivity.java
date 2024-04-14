package com.example.introandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InformationResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_information_results);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        String season = intent.getStringExtra("season");
        int temperature = intent.getIntExtra("temperature", 70);
        String allergies = intent.getStringExtra("allergies");

        TextView txtSeason = (TextView) findViewById(R.id.txtSeason);
        TextView txtTemperature = (TextView) findViewById(R.id.txtTemperature);
        TextView txtAllergies = (TextView) findViewById(R.id.txtAllergies);
        txtSeason.setText("Your favorite season is "+season);
        txtTemperature.setText("Your favorite temperature is "+temperature);

        //Depending on if the allergies are set to yes or no
        if(allergies.equals("Yes"))
            txtAllergies.setText("Sorry that you have allergies");
        else
            txtAllergies.setText("You don't have allergies");

        Button btnMain = (Button) findViewById(R.id.btnBackToMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMain();
            }
        });

    }

    private void goMain(){
        Intent intent = new Intent(InformationResultsActivity.this, MainMenuActivity.class);
        this.startActivity(intent);
    }
}