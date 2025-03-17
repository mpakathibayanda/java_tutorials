package com.example.demo;

import java.util.Scanner;

public class DemoApplication {
  /*
   * public static void main(String[] args) {
   * ///INPUT
   * Scanner scanner = new Scanner(System.in);
   * final double DOZEN_PRICE = 59.99;
   * final double INDIVIDUAL_PRICE = 8.50;
   * System.out.println("Enter a number of eggs: ");
   * final int numberOfEggs = scanner.nextInt();
   * 
   * /// PROCESSING/ CALCULATION
   * final int numberOfIndividual = numberOfEggs%12; // Number of eggs that are
   * not in a dozen
   * final int numberOfDozens = numberOfEggs/12; // Number of dozens,
   * final double dozensAmount = numberOfDozens * DOZEN_PRICE; // Amount of dozens
   * final double individualsAmount = numberOfIndividual *INDIVIDUAL_PRICE; //
   * Amount of individuals
   * final double totalAmount = dozensAmount + individualsAmount; // Total amount
   * 
   * /// OUTPUT
   * final String outStatement = "You ordered " + numberOfEggs + " eggs. That's "
   * + numberOfDozens + " dozen at R59.99 per dozen and " + numberOfIndividual +
   * " loose eggs at R8.50 each for a total of R" + totalAmount;
   * System.out.println(outStatement);
   * }
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the current year: ");
    int currentYear = scanner.nextInt();
    System.out.print("Enter your birth year: ");
    int birthYear = scanner.nextInt();

    int age = currentYear - birthYear;
    int premium = calculatePremium(age);

    System.out.println("Your annual premium is: R" + premium);
  }

  public static int calculatePremium(int age) {
    int decade = age / 10;
    return (decade + 15) * 20;
  }
}
