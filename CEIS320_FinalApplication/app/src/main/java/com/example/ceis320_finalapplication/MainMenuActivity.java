package com.example.ceis320_finalapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainMenuActivity extends AppCompatActivity {
/*
TODO
Selection pages -  Dnd 5e, Pathfinder?, general
Dice pages - Percentile, 100, 50, 20, 12, 8, 6, 4, 3, 2
Find good color combos, use different combos in order to get the user in a different feel for each page

 */
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

        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });

        Button btnGeneralRoll=(Button) findViewById(R.id.btnGeneralRoll);
        btnGeneralRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goGeneralRoll();
            }
        });

        Button btnPathF=(Button) findViewById(R.id.btnPathFinder);
        btnPathF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPathFinder();
            }
        });

        Button btnMultGenRoll=(Button) findViewById(R.id.btnMultipleGeneralRoll);
        btnMultGenRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMultipleGeneral();
            }
        });
    }

    public static String getRandomNumber(int max){
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(max)+1;
        return String.format("%d", randomNumber);
    }

    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }

    private void goGeneralRoll() {
        Intent intent = new Intent(MainMenuActivity.this, GeneralRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }

    private void goPathFinder() {
        Intent intent = new Intent(MainMenuActivity.this, PathfinderActivity.class);
        this.startActivities(new Intent[]{intent});
    }

    private void goMultipleGeneral() {
        Intent intent = new Intent(MainMenuActivity.this, MultipleGeneralRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
}
