package com.example.alinemokfa.rockpaperscissors.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alinemokfa.rockpaperscissors.R;
import com.example.alinemokfa.rockpaperscissors.models.Game;

public class MainActivity extends AppCompatActivity {
    TextView selectChoices;
    Button rock_button;
    Button paper_button;
    Button scissors_button;
    Game game;
    String playerChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectChoices = (TextView)findViewById(R.id.select_choices);
        rock_button = findViewById(R.id.rock_button);
        paper_button = findViewById(R.id.paper_button);
        scissors_button = findViewById(R.id.scissors_button);



    }

    public void onRockButtonClick(View view) {
        Intent intent = new Intent(this, GameActivity.class);

        game = new Game("Rock");

        game.setComputerChoice();

        intent.putExtra("computerchoice", game.computerChoice());

        String winner = game.getWinner();

        intent.putExtra("winner", winner);


        startActivity(intent);
    }




}
