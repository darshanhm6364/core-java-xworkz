package com.xworkz.cakeapp;

import java.util.Scanner;

public class CakeTester {


    public  static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("-----cake id is---------");
        int cakeId=sc.nextInt();

        System.out.println("----cake colour is----");
        String colour=sc.next();

        System.out.println("-------cake shape is---");
        String shape=sc.next();

        System.out.println("---cake falaver is----");
        String flaver=sc.next();

        System.out.println("-----cake price is-------");
        double price=sc.nextDouble();

     Cake cake=new Cake();
     cake.setCakeid(123);
     cake.setColur("blue");
     cake.setShape("round");
     cake.setFlaver("pinApple");
     cake.setPrice(300.00 );

        System.out.println("" +cake.getCakeid() +"\n" +cake.getColur() +"\n" +cake.getShape() +"\n" +cake.getFlaver() +"\n" +cake.getPrice());



    }
}
