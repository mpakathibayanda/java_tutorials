package com.example.practice1;

import java.util.Scanner;

public class InteractiveDistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        double miles = scanner.nextDouble();
        DisplayConversion display = new DisplayConversion();
        display.displayMiles(miles);        
    }
}