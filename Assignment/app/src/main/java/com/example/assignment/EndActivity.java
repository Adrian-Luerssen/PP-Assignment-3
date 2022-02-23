package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class EndActivity extends AppCompatActivity {

    private TextView player1Result;
    private TextView player2Result;
    private TextView WinnerBanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Intent intent = getIntent();
        player1Result = (TextView) findViewById(R.id.player1Banner);
        player2Result = (TextView) findViewById(R.id.player2Banner);
        String player1Name = intent.getStringExtra("PlayerOneName");
        String player1Score = intent.getStringExtra("PlayerOneScore");

        String player2Name = intent.getStringExtra("PlayerTwoName");
        String player2Score = intent.getStringExtra("PlayerTwoScore");
        player1Result.setText(String.format(Locale.ENGLISH,getString(R.string.PlayerScoreBanner),player1Name,player1Score));
        player1Result.setText(String.format(Locale.ENGLISH,getString(R.string.PlayerScoreBanner),player2Name,player2Score));

    }
}