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

public class MultipleGeneralRollerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiple_general_roller);
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
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
        Button btnDnD5e=(Button) findViewById(R.id.btnDND5);
        btnDnD5e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goDND5(); }
        });
    }

    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goDND5() {
        Intent intent = new Intent(MainMenuActivity.this, FifthEditionActivity.class);
        this.startActivities(new Intent[]{intent});
    }
}