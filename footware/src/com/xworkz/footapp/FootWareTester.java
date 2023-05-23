package com.xworkz.footapp;



import java.util.Scanner;

public class FootWareTester {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("--footware id is--");
        int id=sc.nextInt();

        System.out.println("--footware brand name-");
        String brandName=sc.next();

        System.out.println("--footware size is----");
        int size=sc.nextInt();

        System.out.println("---footware type is ----");
        String type=sc.next();

        System.out.println("foot price is ---");
        double price=sc.nextDouble();

        System.out.println("footware material is");
        String materialType=sc.next();


        FootWare footWare= new FootWare();

        footWare.setId(id);
        footWare.setBrandName(brandName);
        footWare.setSize(size);
        footWare.setType(type);
        footWare.setPrice(price);
        footWare.setMaterialType(materialType);

        System.out.println("" +footWare.getId() +"\n"+footWare.getBrandName() +"\n"+footWare.getSize()+"\n"+footWare.getType()+"\n"+footWare.getPrice()+"\n" +footWare.getMaterialType());

    }
}
