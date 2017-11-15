package com.example.alinemokfa.rockpaperscissors.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by alinemokfa on 15/11/2017.
 */

public class Game {

    private String playerChoice;
    private String computerChoice;
    private ArrayList<String> choices;

    public Game(String playerChoice) {
        this.playerChoice = playerChoice;
    }


    public String playerChoice() {
        return playerChoice;
    }

    public String computerChoice() {
        return computerChoice;
    }

    public void setComputerChoice() {
        this.computerChoice = this.getRandomComputerChoice();
    }

    public String getRandomComputerChoice() {
        Random rand = new Random();
        ArrayList<String> choices = new ArrayList<>(Arrays.asList("Rock", "Paper", "Scissors"));
        int num = rand.nextInt(3);
        String choice = (choices.get(num));
        return choice;
    }


    public String getWinner() {

        if (playerChoice == computerChoice) {
            return "It's a draw! Try again. Or don't. I don't care.";
        } else if (playerChoice == "Rock" && computerChoice == "Scissors") {
            return "Rock wins!";
        } else if (playerChoice == "Rock" && computerChoice == "Paper") {
            return "Paper wins !";
        } else if (playerChoice == "Paper" && computerChoice == "Scissors") {
            return "Scissors wins!";
        } else if (playerChoice == "Paper" && computerChoice == "Rock") {
            return "Paper wins!";
        } else if (playerChoice == "Scissors" && computerChoice == "Paper") {
            return "Scissors wins!";
        } else if (playerChoice == "Scissors" && computerChoice == "Rock") {
            return "Rock wins!";
        } else {
            return "No *GrumpyCatImage*";
        }

    }
}