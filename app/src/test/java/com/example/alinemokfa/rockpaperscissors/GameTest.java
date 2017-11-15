package com.example.alinemokfa.rockpaperscissors;

import com.example.alinemokfa.rockpaperscissors.models.Game;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


/**
 * Created by alinemokfa on 15/11/2017.
 */

public class GameTest {

    private Game game;
    private Game mockGame;

    @Before
    public void before() {
        game = new Game("Rock");
        mockGame = Mockito.spy(game);
        Mockito.when(mockGame.getRandomComputerChoice()).thenReturn("Scissors");
        mockGame.setComputerChoice();
    }

    @Test
    public void canGetPlayerChoice(){
        assertEquals("Rock", mockGame.playerChoice());
    }

    @Test
    public void canGetComputerChoice(){
        assertEquals("Scissors", mockGame.computerChoice());
    }

    @Test
    public void getRandomComputerChoice(){
        assertEquals("Scissors", mockGame.getRandomComputerChoice());
    }

    @Test
    public void getScissorsBeatsPaper() {
        Game game = new Game("Scissors");

        mockGame = Mockito.spy(game);

        Mockito.when(mockGame.getRandomComputerChoice()).thenReturn("Paper");

        mockGame.setComputerChoice();

        assertEquals("Scissors wins!", mockGame.getWinner());
    }

    @Test
    public void getRockBeatsScissors() {
        Game game = new Game("Rock");

        mockGame = Mockito.spy(game);

        Mockito.when(mockGame.getRandomComputerChoice()).thenReturn("Scissors");

        mockGame.setComputerChoice();

        assertEquals("Rock wins!", mockGame.getWinner());
    }

    @Test
    public void getPaperBeatsRock() {

        Game game = new Game("Paper");

        mockGame = Mockito.spy(game);

        Mockito.when(mockGame.getRandomComputerChoice()).thenReturn("Rock");

        mockGame.setComputerChoice();

        assertEquals("Paper wins!", mockGame.getWinner());
    }

    @Test
    public void canBeADraw() {

        Game game = new Game("Rock");

        mockGame = Mockito.spy(game);

        Mockito.when(mockGame.getRandomComputerChoice()).thenReturn("Rock");

        mockGame.setComputerChoice();

        assertEquals("It's a draw! Try again. Or don't. I don't care.", mockGame.getWinner());
    }

    @Test
    public void canRecogniseInvalidChoice(){

        Game game = new Game("Rok");

        mockGame = Mockito.spy(game);

        Mockito.when(mockGame.getRandomComputerChoice()).thenReturn("Scissors");

        mockGame.setComputerChoice();

        assertEquals("No *GrumpyCatImage*", mockGame.getWinner());
    }

}
