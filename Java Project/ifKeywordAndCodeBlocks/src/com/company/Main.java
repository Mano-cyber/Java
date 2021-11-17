package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

/*        if (score == 5000 && score >1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }else if(score < 1000){
            System.out.println("This was executed");
        }else{
            System.out.println("Got here");
        }*/

        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean isGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(isGameOver == true) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
