package com.pluralsight;


import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter scores: ");
        String highScore = input.next().toUpperCase();

        String[] score = highScore.split(Pattern.quote("|").trim());
        String[] team = score[0].split(":");
        String[] totalScores = score[1].split(":");

        String home = team[0];
        String visitors = team[1];

        int scoreHome = Integer.parseInt(totalScores[0]);
        int visitorScore = Integer.parseInt(totalScores[1]);


        if (scoreHome > visitorScore){
            System.out.println("The winner is: " + home);
        } else if (visitorScore > scoreHome) {
            System.out.println("The winner is: " + visitors );
        }







    }
}
