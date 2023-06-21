package com.xworkz.hospiapp.patient.applohosp;

import com.xworkz.hospiapp.patient.Patient;
import com.xworkz.hospiapp.patient.hospital.Hospital;

public class ApploHospitalPatient implements Hospital {
  
  Patient patient[] = new Patient[8];
  
  
  int index;
  
  @Override
  public boolean addPatient(Patient patient) {
    System.out.println("invoked addPatient");
    boolean isAdded = false;
    if (patient != null) {
      System.out.println("patient check is completed...processed to add the patient");
      if (patient.getPatientName() != null && !patient.getPatientName().isEmpty()) {
        this.patient[index] = patient;
        index++;
        isAdded = true;
        System.out.println("patient data added Successfully");
      } else {
        System.out.println("Patient name is empty...");
      }
    } else {
      System.out.println("Patient name should not be null...");
    }
    return isAdded;
  }
  
  @Override
  public void getAllPatients() {
    System.out.println("invoked getAllPatients");
    System.out.println("list parents are :");
    for (Patient pat : this.patient) {
      System.out.println(pat);
    }
  }
}

