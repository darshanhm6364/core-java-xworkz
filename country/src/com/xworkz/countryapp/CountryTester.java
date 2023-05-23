package com.xworkz.countryapp;

import java.util.Scanner;

public class CountryTester {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);


        System.out.println("country id is");
        int id=sc.nextInt();

        System.out.println("country code--");
        int countryCode=sc.nextInt();

        System.out.println("country name");
        String countryName=sc.next();

        System.out.println("no of status");
        int noOfStates=sc.nextInt();

        System.out.println("no of papulation");
        double population=sc.nextDouble();

        System.out.println("currency---");
        String currency=sc.next();

        System.out.println("capital--");
        String capital=sc.next();

        System.out.println("no of economy");
        float economy=sc.nextFloat();

        Country country=new Country();
        country.setId(id);
        country.setCountryCode(countryCode);
        country.setCountryName(countryName);
        country.setNoOfStates(noOfStates);
        country.setPopulation(population);
        country.setCurrency(currency);
        country.setCapital(capital);
        country.setEconomy(economy);

        System.out.println(""+country.getId()+"\n"+country.getCountryCode()+"\n"+country.getCountryName()+"\n"+country.getNoOfStates()+"\n"+country.getPopulation()+"\n"+country.getCurrency()+"\n"+country.getCapital()+"\n"+country.getEconomy());
    }
}
