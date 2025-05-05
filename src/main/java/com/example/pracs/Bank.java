/*
1)  Write a Java program to create a class called "Bank" with a collection
    of accounts and methods to add and remove accounts, and to deposit and
    withdraw money. Also define a class called "Account" to maintain account
    details of a particular customer.
*/

package com.example.pracs;

import java.util.ArrayList;
import java.util.List;

public class Bank {                                          //    0         1         2        3
    private List<Account> bankAccounts = new ArrayList<>();  // [1212121, 21212992, 2273623, 3637343]
    private Account isAccountExist(String accountNumber){
        Account account = null;
        boolean accountExist = false;
        for (int i = 0; i < bankAccounts.size(); i++) {
            Account bankAccount = bankAccounts.get(i);
            String fromBankAccountNumber = bankAccount.getAccountNumber();
            accountExist = accountNumber == fromBankAccountNumber; // false
            if(accountExist){
                account = bankAccount;
                break;
            }
        }
        return account;
    }

    public void addBankAccount(Account account){
        boolean hasAccount = isAccountExist(account.getAccountNumber()) != null;
        if (hasAccount) {
            System.out.println("Account already exist.");
            return;
        }
        this.bankAccounts.add(account);
        System.out.println("Account added");
    }

    public void removeBankAccount(String accountNumber){
        Account account = isAccountExist(accountNumber);
        if (account == null) {
            System.out.println("Account does not exist.");
            return;
        }
        this.bankAccounts.remove(account);
        System.out.println("Account removed");
    }

    public void deposit(String accountNumber, double amount){
        Account account = isAccountExist(accountNumber);
        if (account == null) {
            System.out.println("Account does not exist.");
            return;
        }
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount){
        Account account = isAccountExist(accountNumber);
        if (account == null) {
            System.out.println("Account does not exist.");
            return;
        }
        account.withdraw(amount);
        System.out.println("Withdraw successful");
    }
}


