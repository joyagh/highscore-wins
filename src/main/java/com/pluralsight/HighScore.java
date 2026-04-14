package com.pluralsight;


import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter scores: ");
        String highScore = input.next();

        String[] score = highScore.split(Pattern.quote("|"));
        String[] team = score[0].split(":");
        String[] totalScores = score[1].split(":");






    }
}
