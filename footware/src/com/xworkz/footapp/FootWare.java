package com.xworkz.footapp;

public class FootWare {


    private int id;
    private String brandName;
    private int size;
    private String type;
    private double price;
    private String materialType;




    public FootWare(){
        System.out.println("no arg cons----");
    }
    public FootWare(int id,String brandName,int size,String type,double price,String materialType){

        this.id=id;
        this.brandName=brandName;
        this.size=size;
        this.type=type;
        this.price=price;
        this.materialType=materialType;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialType() {
        return materialType;
    }
}
