
package com.xworkz.bankapp.bankaccount;

//base class //super class//parent class
public class BankAccount {
    private double balance;

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void transper(BankAccount friendsaccount,double amount){
        this.debit(amount);
        friendsaccount.credit(amount);


    }

}