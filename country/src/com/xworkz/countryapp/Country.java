package com.xworkz.countryapp;

public class Country {

    private int id;
    private int countryCode;
    private String countryName;
    private int noOfStates;
    private double population;
    private String currency;
    private String capital;
    private float economy;

    public Country(){
        System.out.println("no arg con----");
    }
    public Country(int id,int countryCode,String countryName,int noOfStates,double population,String currency,String capital,float economy){
       this.id=id;
       this.countryCode=countryCode;
       this.countryName=countryName;
       this.noOfStates=noOfStates;
       this.population=population;
       this.currency=currency;
       this.capital=capital;
       this.economy=economy;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryName(){
        return countryName;
    }

    public void setNoOfStates(int noOfStates) {
        this.noOfStates = noOfStates;
    }

    public int getNoOfStates() {
        return noOfStates;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getPopulation() {
        return population;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency(){
        return  currency;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getCapital(){
        return capital;
    }

    public void setEconomy(float economy) {
        this.economy = economy;
    }
    public float getEconomy(){
        return economy;
    }
}
