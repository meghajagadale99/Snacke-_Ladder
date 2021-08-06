package com.bridgelabz;

public class SnakeLadder
{
    public static void main(String[] args)
    {
        //variables
         int playerPosition=0;
        System.out.println("Welcome to the Snake and Ladder Game");
        int rollDice= ((int) (Math.floor(Math.random() * 10)) % 6) + 1;
        System.out.println("Player rolled dice value : "+rollDice);
    }
}
