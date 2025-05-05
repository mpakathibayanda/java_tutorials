package com.example.interfaces;

public interface Animal {
    public void sound();
    public int numberOfLegs();
}

class Chicken implements Animal{
    public void sound(){
        System.out.println("Cluck cluck");
    }
    public int numberOfLegs(){
        return '2';
    }

    public String loction(){
        return "Mandiliva";
    }
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Woof woof");
    }
    public int numberOfLegs(){
        return 4;
    }
}
