package com.xworkz.hospiapp.patient.exception;

public class WardNotFoundException extends RuntimeException{
  
  
  
  public WardNotFoundException(String wardNo){
    System.out.println("no ward found for"+wardNo);
    
    
    
  }
}
