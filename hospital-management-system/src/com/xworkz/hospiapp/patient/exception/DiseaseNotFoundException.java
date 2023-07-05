package com.xworkz.hospiapp.patient.exception;

public class DiseaseNotFoundException extends RuntimeException{
  
  public DiseaseNotFoundException(String diseaseName){
    System.out.println("no disease found"+diseaseName);
    
  }
}
