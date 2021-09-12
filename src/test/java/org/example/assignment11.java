/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment11 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many Euros are you exchanging?");

        double euros = scan.nextDouble();

        System.out.println("What is the Exchange Rate?");

        double exchangeRate = scan.nextDouble();

        double dollars = Convert(euros, exchangeRate);
        String str1 = String.format("%.2f", dollars);

        System.out.println(euros + " Euros at an Exchange rate of " + exchangeRate + " is ");
        System.out.println(str1 + " U.S Dollars ");

        scan.close();
    }

    private static double Convert(double euros, double exchangeRate) {
        return euros * exchangeRate;
    }
}