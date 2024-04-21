package com.example.ceis320_finalapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MultipleGeneralRollerActivity extends AppCompatActivity implements View.OnClickListener/*, AdapterView.OnItemClickListener*/ {
    Spinner spnDice, spnNumber;
    Button btnRoll;
    TextView lblHighOutput, lblLowOutput, lblAvgOutput, lblTotalOutput, lblResultOutput, lblMultGenCustNum;
    ArrayList<String> resultOfRolls = new ArrayList<>();
    EditText txtCustomInput;

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

        spnDice = (Spinner) findViewById(R.id.spnMultGenTypeOfDice);
        spnNumber = (Spinner) findViewById(R.id.spnMultGenAmountOfDice);
        btnRoll = (Button) findViewById(R.id.btnMultGenRollDie);
        txtCustomInput = (EditText) findViewById(R.id.txtMultGenCustomInput);
        lblHighOutput = (TextView) findViewById(R.id.lblMultGenHigh);
        lblLowOutput = (TextView) findViewById(R.id.lblMultGenLow);
        lblAvgOutput = (TextView) findViewById(R.id.lblMultGenAvg);
        lblTotalOutput = (TextView) findViewById(R.id.lblMultGenTotal);
        lblResultOutput = (TextView) findViewById(R.id.lblMultGenResult);
        lblMultGenCustNum = (TextView) findViewById(R.id.lblMultGenCustNum);
        lblResultOutput.setText("");
        /*//Currently unable to do this, app crashes immediately
        txtCustomInput.setVisibility(View.INVISIBLE);
        lblMultGenCustNum.setVisibility(View.INVISIBLE);*/

        btnRoll.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        String resultToOutput = "";
        int lowestRolled = 100;
        int highestRolled = 0;
        int numberRolled;
        int totalRolled = 0;
        int numberToRoll = 0;
        int dieSidesNeeded = 1;
        System.out.println(spnDice.getSelectedItem());
        switch (spnDice.getSelectedItemPosition()){
            case 0:
                dieSidesNeeded = 2;
                break;
            case 1:
                dieSidesNeeded = 3;
                break;
            case 2:
                dieSidesNeeded = 4;
                break;
            case 3:
                dieSidesNeeded = 6;
                break;
            case 4:
                dieSidesNeeded = 8;
                break;
            case 5:
                dieSidesNeeded = 10;
                break;
            case 6:
                dieSidesNeeded = 12;
                break;
            case 7:
                dieSidesNeeded = 20;
                break;
            case 8:
                dieSidesNeeded = 50;
                break;
            case 9:
                dieSidesNeeded = 100;
                break;
            case 10:
                dieSidesNeeded = 100;
                break;
            default:
                dieSidesNeeded = 1;
                break;
        }
        System.out.print("Die sides needed = ");
        System.out.println(dieSidesNeeded);
        ///Currently unable to do this, app crashes immediately
        /*if (spnNumber.getSelectedItem().equals("Custom")) {
            txtCustomInput.setVisibility(View.VISIBLE);
            lblMultGenCustNum.setVisibility(View.VISIBLE);
        } else {
            txtCustomInput.setVisibility(View.INVISIBLE);
            lblMultGenCustNum.setVisibility(View.INVISIBLE);
        }*/

        if (spnNumber.getSelectedItem().equals("Custom")) {
            try {
                numberToRoll = Integer.parseInt(txtCustomInput.getText().toString());
                //System.out.println(numberToRoll);
            } catch (Exception e) {
                System.out.println(e);
                Toast.makeText(MultipleGeneralRollerActivity.this, "Please enter a real number", Toast.LENGTH_SHORT).show();
            }
        } else {
            try {
                numberToRoll = Integer.parseInt(spnNumber.getSelectedItem().toString());
                System.out.println(numberToRoll);
            } catch (Exception e) {
                System.out.println(e);
                Toast.makeText(MultipleGeneralRollerActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        }
        for(int x=0;x<numberToRoll;x++){
            numberRolled = Integer.parseInt(MainMenuActivity.getRandomNumber(dieSidesNeeded));
            if(resultToOutput.equals("")){resultToOutput = String.valueOf(numberRolled);}
            else{resultToOutput = String.format("%s, %s", resultToOutput, String.valueOf(numberRolled));}
            resultOfRolls.add(String.valueOf(numberRolled));
            totalRolled += numberRolled;
            if(numberRolled>highestRolled){highestRolled=numberRolled;}
            if(lowestRolled>numberRolled){lowestRolled=numberRolled;}
            System.out.println(x);
        }
        System.out.println("success");
        lblTotalOutput.setText(String.valueOf(totalRolled));
        lblAvgOutput.setText(String.valueOf(totalRolled/numberToRoll));
        lblHighOutput.setText(String.valueOf(highestRolled));
        lblLowOutput.setText(String.valueOf(lowestRolled));
        lblResultOutput.setText(resultToOutput);
        System.out.println(totalRolled);
        System.out.println(String.valueOf(totalRolled/numberToRoll));
        System.out.println(String.valueOf(highestRolled));
        System.out.println(String.valueOf(lowestRolled));
        System.out.println(resultToOutput);

    /*@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }*/
    }
}