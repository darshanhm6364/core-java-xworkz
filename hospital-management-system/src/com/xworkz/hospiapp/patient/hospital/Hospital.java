package com.xworkz.hospiapp.patient.hospital;

import com.xworkz.hospiapp.patient.Patient;

public interface Hospital {
  
  //has a realtionship
  
  boolean addPatient(Patient patient);
  void getAllPatients();
}
