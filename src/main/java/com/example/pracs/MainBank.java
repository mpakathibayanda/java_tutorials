package com.example.pracs;

public class MainBank {
    public static void main(String[] args) {
        Account account = new Account("Musa", "2134567892", 1000);
        Bank bank = new Bank();
        bank.addBankAccount(account);
        System.out.println("\n15 days later");
        bank.deposit("2134567892", 1000);
        System.out.println("\n4 days later");
        bank.withdraw("2134567892", 500);
        double balance  = account.getBalance();
        System.out.println("\nBalance: " + balance);
        
    }
}
