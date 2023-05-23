package com.xworkz.cakeapp;

public class Cake {


    private int cakeid;
    private String colur;
    private String shape;
    private String flaver;
    private double price;

    public  Cake(){

    }


    public Cake(int cakeid, String colur, String shape, String flaver, double price) {
        this.cakeid = cakeid;
        this.colur = colur;
        this.shape = shape;
        this.flaver = flaver;
        this.price = price;


    }

    public void setCakeid(int cakeid) {
        this.cakeid = cakeid;
    }

    public int getCakeid() {
        return cakeid;
    }

    public void setColur(String colur) {
        this.colur = colur;


    }

    public String getColur() {
        return colur;
    }

    public void setShape(String shape) {
        this.shape = shape;

    }


    public String getShape() {
        return shape;
    }

    public void setFlaver(String flaver){
        this.flaver=flaver;

    }
    public String getFlaver(){
        return  flaver;
    }
    public  void setPrice(double price){
        this.price=price;

    }
    public  double getPrice(){
        return price;

    }

}
