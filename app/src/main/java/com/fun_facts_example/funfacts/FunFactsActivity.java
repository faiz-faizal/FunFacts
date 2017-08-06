package com.fun_facts_example.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    TextView factLabel;
    Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our view variables ad assign the views from the layout file

        factLabel = (TextView)findViewById(R.id.textView2);
        showFactButton = (Button)findViewById(R.id.button);
    }

    public void clickButton(View v){
        String fact;

        //randomly select the fact
        Random randomRobot = new Random(); //contruct a new random robot
        int randomNumber = randomRobot.nextInt(3);


        //fact = Integer.toString(randomNumber); //convert integer to string

        //0 = "Kucing tak suka air, tapi kucing pandai berenang";
        //1 = "Ayam tak boleh terbang walaupun mempunyai sayap";
        //2 = "Otak burung unta lebih kecil dari matanys";
        if( randomNumber == 0)
        {
            fact = "Kucing tak suka air, tapi kucing pandai berenang";
        }

        else if( randomNumber == 1)
        {
            fact = "Ayam tak boleh terbang walaupun mempunyai sayap";
        }

        else if ( randomNumber == 2)
        {
            fact = "Otak burung unta lebih kecil dari matanys";
        }
        else
        {
            fact = "There was an error";
        }


        //update a label with our dynamic fact
        factLabel.setText(fact);
    }
}
