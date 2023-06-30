package com.xworkz.hospiapp.patient.hospital;

import com.xworkz.hospiapp.patient.patient.Patient;

public interface Hospital {
  //has a realtionship
  boolean addPatient(Patient patient);
  void getAllPatients();
  Patient getPatientByAddress(String address);
  String getPatientNameByWardNo(String wardNo);
  String[] getPatientNameByDiseaseName(String dieaseName);
  boolean updatePatientDiseaseByPatientName(String existingPatienseName, String updateDiseaseName);
  boolean updatePatientWardNoByPatientId(int existingId, String updateWardNo);
  boolean updatePatientsAgeByPatientId(int existingId, int updateAge);
  Patient getPatientById(int patientId);
  String getPatientAttenderNameByPatientId(int patientId);
  String getPatientStreetNameByPatientId(int patientId);
} 
