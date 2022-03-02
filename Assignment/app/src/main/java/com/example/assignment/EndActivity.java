package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class EndActivity extends AppCompatActivity {

    private TextView player1Result;
    private TextView player2Result;
    private TextView winnerBanner;


    private void initVars(){
        player1Result = (TextView) findViewById(R.id.player1Banner);
        player2Result = (TextView) findViewById(R.id.player2Banner);
        winnerBanner = (TextView) findViewById(R.id.WinnerBanner);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        initVars();

        Intent intent = getIntent();
        String winnerName = intent.getStringExtra(getString(R.string.winnerNameExtra));
        String winnerScore = intent.getStringExtra(getString(R.string.winnerScoreExtra));

        String loserName = intent.getStringExtra(getString(R.string.loserNameExtra));
        String loserScore = intent.getStringExtra(getString(R.string.loserScoreExtra));
        player1Result.setText(String.format(Locale.ENGLISH,getString(R.string.PlayerScoreBanner),winnerName,winnerScore));
        player2Result.setText(String.format(Locale.ENGLISH,getString(R.string.PlayerScoreBanner),loserName,loserScore));

        winnerBanner.setText(String.format(Locale.ENGLISH,getString(R.string.WinnerBanner),winnerName));

    }
}