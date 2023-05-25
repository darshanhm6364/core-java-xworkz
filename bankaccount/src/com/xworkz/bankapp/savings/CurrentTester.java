package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class CurrentTester {

    public static void main(String[] args) {

        SavingsAccount youraccount = new SavingsAccount();
        youraccount.credit(201000.00);
        System.out.println("current balnce account is :" + youraccount.getBalance());

        SavingsAccount friendsaccount = new SavingsAccount();
        youraccount.transper(friendsaccount, 2000);
        System.out.println("current balnce in friends" + friendsaccount.getBalance());
        System.out.println("Current balance in your account" + youraccount.getBalance());

        SavingsAccount prathap=new SavingsAccount();
        youraccount.transper(prathap,12000);
        System.out.println("current balnce in friends"+prathap.getBalance());
        System.out.println("Current balance in your account"+youraccount.getBalance());

        SavingsAccount yashas=new SavingsAccount();
        youraccount.transper(yashas,20000);
        System.out.println("current balnce in friends"+yashas.getBalance());
        System.out.println("Current balance in your account"+youraccount.getBalance());

        SavingsAccount pavan=new SavingsAccount();
        youraccount.transper(pavan,25000);
        System.out.println("current balnce in friends"+pavan.getBalance());
        System.out.println("Current balance in your account"+youraccount.getBalance());

        SavingsAccount varun=new SavingsAccount();
        youraccount.transper(varun,50000);
        System.out.println("current balnce in friends"+varun.getBalance());
        System.out.println("Current balance in your account"+youraccount.getBalance());

        SavingsAccount manjunath=new SavingsAccount();
        youraccount.transper(manjunath,80000);
        System.out.println("current balnce in friends"+manjunath.getBalance());
        System.out.println("current balnce in friends"+youraccount.getBalance());
    }

}
