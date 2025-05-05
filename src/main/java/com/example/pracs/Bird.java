package com.example.pracs;

public abstract class Bird {
    // Abstract methods to be implemented by subclasses
    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high with broad wings.");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle screeches sharply.");
    }
}

class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("Hawk glides swiftly in search of prey.");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk emits a high-pitched whistle.");
    }
}

class BirdDemo {
    public static void main(String[] args) {
        Bird[] birds = { new Eagle(), new Hawk() };
        for (Bird b : birds) {
            b.fly();
            b.makeSound();
            System.out.println();
        }
    }
}