package com.example.edgar.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private List<TextView> textViews;
    private List<Dice> dices;
    private Button roll;
    private int numOfDices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOfDices = 5;
        linearLayout = (LinearLayout)findViewById(R.id.linearlayout);
        textViews = new ArrayList<TextView>();
        for (int i = 0; i < numOfDices; i++) {
            textViews.add(new TextView(this));
            textViews.get(i).setText("this is " + i + ".");
            linearLayout.addView(textViews.get(i));
        }
        dices = new ArrayList<Dice>();
        for (int i = 0; i < numOfDices; i++) {
            dices.add(new Dice());
        }
        roll = (Button)findViewById(R.id.roll);
        roll.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    public void rollDice() {
        for (int i = 0; i < numOfDices; i++) {
            textViews.get(i).setText("Dice " + (i+1) + " rolled a " + dices.get(i).roll());
        }
    }
}
