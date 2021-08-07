package com.bridgelabz;

public class SnakeLadder
{

    public static final int NO_PLAY=0,LADDER=1,SNAKE=2;
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Snake and Ladder Game");
        //variables
        int playerPosition=0;
        System.out.println("Player starts at Position: "+playerPosition);

        int rollDice= ((int) (Math.floor(Math.random() * 10)) % 6) + 1;
        System.out.println("Player rolled dice value : "+rollDice);

        int Option= (int) (Math.floor(Math.random() * 10) % 3);
        switch (Option) {
            case NO_PLAY:
                System.out.println("No Play");
                playerPosition += 0;
                break;
            case LADDER:
                System.out.println("Ladder");
                playerPosition += rollDice;
                break;
            case SNAKE:
                System.out.println("Snake");
                playerPosition -= rollDice;
                break;
            default:
                System.out.println("Nothing");
                break;

        }
        System.out.println("The Player Position Is : "+playerPosition);

    }
}
