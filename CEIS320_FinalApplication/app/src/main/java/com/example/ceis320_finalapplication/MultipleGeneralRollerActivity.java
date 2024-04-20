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

        //Commented out code here is a previous design that used multiple buttons to go to each individual page
        /*Button btnMultiD2=(Button) findViewById(R.id.btnMultGenD2);
        btnMultiD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD2(); }
        });
        Button btnMultiD3=(Button) findViewById(R.id.btnMultGenD3);
        btnMultiD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD3(); }
        });
        Button btnMultiD4=(Button) findViewById(R.id.btnMultGenD4);
        btnMultiD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD4(); }
        });
        Button btnMultiD6=(Button) findViewById(R.id.btnMultGenD6);
        btnMultiD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD6(); }
        });
        Button btnMultiD8=(Button) findViewById(R.id.btnMultGenD8);
        btnMultiD8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD8(); }
        });
        Button btnMultiD10=(Button) findViewById(R.id.btnMultGenD10);
        btnMultiD10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD10(); }
        });
        Button btnMultiD212=(Button) findViewById(R.id.btnMultGenD12);
        btnMultiD212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD12(); }
        });
        Button btnMultiD20=(Button) findViewById(R.id.btnMultGenD20);
        btnMultiD20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD20(); }
        });
        Button btnMultiD50=(Button) findViewById(R.id.btnMultGenD50);
        btnMultiD50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD50(); }
        });
        Button btnMultiD100=(Button) findViewById(R.id.btnMultGenD100);
        btnMultiD100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollD100(); }
        });
        Button btnMultiPercentile=(Button) findViewById(R.id.btnMultGenPercentile);
        btnMultiPercentile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goMultiRollPercentile(); }
        });*/
    }

    /*private void goMultiRollD2() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, TwoSideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD3() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, ThreeSideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD4() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, FourSideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD6() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, SixSideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD8() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, EightSideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD10() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, TenSideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD12() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, TwelveSideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD20() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, TwentySideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD50() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, FiftySideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollD100() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, OneHundredSideRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }
    private void goMultiRollPercentile() {
        Intent intent = new Intent(MultipleGeneralRollerActivity.this, PercentileRollerActivity.class);
        this.startActivities(new Intent[]{intent});
    }*/
}