package com.xworkz.bankapp;
import com.xworkz.bankapp.bankaccount.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Current balance before credit the balance" + bankAccount.getBalance());
        bankAccount.credit(5000.90);
        System.out.println("Credited: " + bankAccount.getBalance());

        bankAccount.debit(1000);
        System.out.println("Debited: " + bankAccount.getBalance());

        // child class//base class//derived class
        SavingsAccount savingaccount=new SavingsAccount();
        System.out.println("current balance before after the balnce " +savingaccount.getBalance());
        savingaccount.credit(4000.67);
        System.out.println("credited" +savingaccount.getBalance());

        savingaccount.debit(2000);
        System.out.println("debited" +savingaccount.getBalance());


           //child class//base class //derived class
        CurrentAccount currentaccount=new CurrentAccount();
        System.out.println("current balance before after the balnce" +currentaccount.getBalance());
        currentaccount.credit(7000.00);
        System.out.println("credited" +currentaccount.getBalance());

        currentaccount.debit(2000);
        System.out.println("debited"+currentaccount.getBalance());

    }


}
