package com.bridgelabz;

public class SnakeLadder {
    public static final int NO_PLAY = 0, LADDER = 1, SNAKE = 2;
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game");
        //variables
        int playerPosition = 0;
        while  (playerPosition < WINNING_POSITION)
        {
            int rollDice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Player rolled dice value : " + rollDice);

            int Option = (int) (Math.floor(Math.random() * 10) % 3);
            switch (Option) {
                case NO_PLAY:
                    System.out.println("No Play");
                    break;
                case LADDER:
                    System.out.println("Ladder");
                    if((WINNING_POSITION-rollDice)>=playerPosition)
                    playerPosition += rollDice;
                    else
                        System.out.println("Exact dice value required to win a game");
                    break;
                case SNAKE:
                    System.out.println("Snake");
                    if(playerPosition > rollDice)
                        playerPosition -= rollDice;
                    else
                        playerPosition=0;
                    break;
            }
            System.out.println("The Player Position Is : " + playerPosition);
        }
        System.out.println( "Player  Wins  The  Game" );

    }
}
