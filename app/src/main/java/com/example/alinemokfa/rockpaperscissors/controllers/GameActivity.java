package com.example.alinemokfa.rockpaperscissors.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alinemokfa.rockpaperscissors.R;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        TextView gameResult = findViewById(R.id.game_result);

        String computerchoice = extras.getString("computerchoice");
        String winner = extras.getString("winner");

        String result = "Computer played: \n \n " + computerchoice + "\n \n \n \n Result: \n \n " + winner;

        gameResult.setText(result);


    }


}
