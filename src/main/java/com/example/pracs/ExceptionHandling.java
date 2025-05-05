package com.example.pracs;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthYear = 0;
        int age = 0;        
          while (true) {            
            System.out.println("Enter your birth year: ");
            try {
                birthYear = scanner.nextInt();
                if(birthYear > 2025){
                    throw new Exception("Invalid year");
                }
                age = 2025 - birthYear;
                System.out.println("Your age is " + age + " years\n =====\n");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\nPlease enter a valid year.\n ===== \n");
                scanner.nextLine();
                continue;
            }              
          }
    }

}
