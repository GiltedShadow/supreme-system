package com.example.introandroidapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class WeatherActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, OnClickListener {

    //Declare variables
    private RadioButton btnFah;
    private RadioButton btnCel;
    private RadioButton btnKel;
    private EditText txtInputTemp;
    private TextView lblOutputDegF;
    private TextView lblOutputDegC;
    private TextView lblOutputDegK;
    private Button btnConvert;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RadioGroup tempGroup = (RadioGroup) findViewById(R.id.tempGroup);
        tempGroup.setOnCheckedChangeListener(this);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(this);
    }

    private void displayToast( double temperature) {
        if(temperature>50)
            Toast.makeText(this, "Wow, it's hot outside!", Toast.LENGTH_LONG).show();
        else if(temperature>20)
            Toast.makeText(this, "Nice weather we are having!", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Brrr - it's cold out!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /* Handle action bar item clicks here. The action bar will automatically
        handle clicks on the Home/Up button, so long as you specify a parent
        activity in AndroidManifest.xml
         */
        switch(item.getItemId()){
            case R.id.mnuMain:
                startActivity(new Intent(getApplicationContext(), MainMenuActivity.class));
                return true;
            case R.id.mnuExit:
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
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
                lblOutput.setText("You chose Fahrenheit");
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

    @Override
    public void onClick(View v) {
        //Get Resources for radio buttons, text boxes, and labels
        btnFah = (RadioButton) findViewById(R.id.btnDegFah);
        btnCel = (RadioButton) findViewById(R.id.btnDegCel);
        btnKel = (RadioButton) findViewById(R.id.btnDegKel);
        txtInputTemp = (EditText) findViewById(R.id.txtInputTemp);
        lblOutputDegF = (TextView) findViewById(R.id.lblOutputFah);
        lblOutputDegC = (TextView) findViewById(R.id.lblOutputCel);
        lblOutputDegK = (TextView) findViewById(R.id.lblOutputKel);
        //Convert temperature to double
        double temp = Double.parseDouble(String.valueOf(txtInputTemp.getText()));
        double answer = 0;

        //If the user chose Fahrenheit, convert to Celsius and Kelvin to display in those text boxes
        if(btnFah.isChecked()) {
            lblOutputDegF.setText(temp+" degrees F");
            lblOutputDegC.setText((Math.round((temp-32)*5/9*100)/100)+" degrees C");
            lblOutputDegK.setText((Math.round((temp+459.67)*5/9*100.0)/100.0)+" degrees K");
        }

        //If the user chose Celsius, convert to Fahrenheit and Kelvin to display in those text boxes
        if(btnCel.isChecked()) {
            lblOutputDegF.setText((Math.round(((temp*9)/5+32)*100)/100)+" degrees F");
            lblOutputDegC.setText(temp+" degrees C");
            lblOutputDegK.setText((Math.round((temp+273.15)*100)/100)+" degrees K");
        }

        //If the user chose Kelvin, convert to Celsius and Fahrenheit to display in those text boxes
        if(btnKel.isChecked()) {
            lblOutputDegF.setText((Math.round((temp*9/5-459.67)*100)/100)+" degrees F");
            lblOutputDegC.setText((Math.round((temp-273.15)*100)/100)+" degrees C");
            lblOutputDegK.setText(temp+" degrees K");
        }
    }
}