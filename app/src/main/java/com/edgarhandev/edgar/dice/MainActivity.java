package com.edgarhandev.edgar.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private List<TextView> textViews;
    private List<Dice> dices;
    private Button roll;
    private int numOfDices;
    private AdView mAdView;

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

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        String YOUR_ADMOB_APP_ID = "ca-app-pub-5445092696369420~5615527026";
        MobileAds.initialize(this, YOUR_ADMOB_APP_ID);

        mAdView = (AdView)findViewById(R.id.adView);
        //AdView mAdView = new AdView(this);
        //mAdView.setAdSize(AdSize.BANNER);
        //mAdView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        // TODO: Add adView to your view hierarchy.
        //linearLayout.addView(mAdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void rollDice() {
        for (int i = 0; i < numOfDices; i++) {
            textViews.get(i).setText("Dice " + (i+1) + " rolled a " + dices.get(i).roll());
        }
    }
}