package com.xworkz.bankapp;

import java.util.Scanner;

public class BankTester {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("--bank id is--");
        int id=sc.nextInt();

        System.out.println("--bank account number is--");
        long accountNo=sc.nextLong();

        System.out.println("--bank branch no is--");
        int branchNo=sc.nextInt();

        System.out.println("--bank accout type is----");
        String accountType=sc.next();

        System.out.println("--bank ifse code is---");
        String ifscCode=sc.next();

        System.out.println("---bank location is");
        String location=sc.next();


        Bank bank =new Bank();

        bank.setId(id);
        bank.setAccountNo(accountNo);
        bank.setBranchNo(branchNo);
        bank.setAccountType(accountType);
        bank.setIfscCode(ifscCode);
        bank.setLocation(location);

        System.out.println(""+bank.getId()+"\n"+bank.getAccountNo()+"\n" +bank.getBranchNo() +"\n" +bank.getAccountType()+"\n"+bank.getIfscCode()+"\n" +bank.getLocation());
    }
}
