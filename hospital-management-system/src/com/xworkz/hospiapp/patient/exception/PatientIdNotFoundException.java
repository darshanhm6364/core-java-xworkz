package com.xworkz.hospiapp.patient.exception;

public class PatientIdNotFoundException extends  RuntimeException{
  
  
  public PatientIdNotFoundException(int id){
    
    System.out.println("please enter disease"+id);
    
  }
}
