/*
 Also define a class called "Account" to maintain account details of a 
 particular customer.
 */

package com.example.pracs;

public class Account {
    private String customerName;
    private String accountNumber;
    private double balance;

    public Account(String customerName, String accountNumber, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
           System.out.println("Invalid deposit amount."); 
           return;
        }
        this.balance = this.balance + amount;
        System.out.println("Deposit successful");
        return;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough balance.");
            return;
        }
        this.balance = this.balance - amount;
        System.out.println("withdrawal was successfully");
    }
}
