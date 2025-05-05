package com.example.demo;

public class SyntaxCode {    
    public static void main(String[] args) {
        
        //***************Static*********************
        // The static method sum(int, int) of MathOparations must be accessed in static way.
        int sum = MathOparations.sumOfTwoNumbers(10, 20); // 30
        System.out.println(sum); // 30
        //***************Static *********************

        MathOparations oparations = new MathOparations();
        int difference = oparations.substract(30, 20); // 10
        System.out.println(difference); // 10
        int product = oparations.mutiply(10, 20); // 200
        System.out.println(product); // 200
    }
}

class MathOparations{

    public static int sumOfTwoNumbers(int a, int b){
        int sum = a+b; // 30
        return sum; // 30
    }
    
    public int mutiply(int a, int b){
        return a*b;
    }


    public double divide(int a, int b){
        double qouta = a/b;
        return qouta;
    }
    
    public int substract(int a, int b){
        return a-b;
    }
    
    static void allOparations(){
        System.out.println("Static method on All Oparation");
    }
}