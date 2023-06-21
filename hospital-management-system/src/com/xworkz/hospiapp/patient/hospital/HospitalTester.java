package com.xworkz.hospiapp.patient.hospital;

import com.xworkz.hospiapp.patient.Patient;
import com.xworkz.hospiapp.patient.applohosp.ApploHospitalPatient;
import com.xworkz.hospiapp.patient.gender.Gender;
import com.xworkz.hospiapp.patient.idproof.IdProof;

public class HospitalTester {
  public static void main(String[] args) {
    
    //abstractian
    Hospital hos=new ApploHospitalPatient();
    Patient patient=new Patient();
    patient.setPatientName("jayanth");
    patient.setGender(Gender.MALE);
    patient.setIdProof(IdProof.AADHAR);
    patient.setIdProof(IdProof.DN);
    patient.setIdProof(IdProof.PAN);
    patient.setIdProof(IdProof.DRIVING_LICENSE);
    patient.setRelatinship(CommitedRelatinship.SINGLE);
    hos.addPatient(patient);
    hos.getAllPatients();
    
    Patient patient1=new Patient();
    patient1.setPatientName("pavan");
    patient1.setGender(Gender.MALE);
    patient1.setIdProof(IdProof.PAN);
    patient1.setIdProof(IdProof.DN);
    patient1.setIdProof(IdProof.AADHAR);
    patient1.setIdProof(IdProof.DRIVING_LICENSE);
    patient1.setRelatinship(CommitedRelatinship.MARRIED);
    hos.addPatient(patient1);
    hos.getAllPatients();
    
    
    Patient patient2=new Patient();
    patient2.setPatientName("nayana");
    patient2.setGender(Gender.FEMALE);
    patient2.setIdProof(IdProof.PAN);
    patient2.setIdProof(IdProof.DN);
    patient2.setIdProof(IdProof.AADHAR);
    patient2.setIdProof(IdProof.DRIVING_LICENSE);
    patient2.setRelatinship(CommitedRelatinship.SINGLE);
    hos.addPatient(patient2);
    hos.getAllPatients();
    
    Patient patient3=new Patient();
    patient3.setPatientName("preti");
    patient3.setGender(Gender.FEMALE);
    patient3.setIdProof(IdProof.PAN);
    patient3.setIdProof(IdProof.DN);
    patient3.setIdProof(IdProof.AADHAR);
    patient3.setIdProof(IdProof.DRIVING_LICENSE);
    patient3.setRelatinship(CommitedRelatinship.MARRIED);
    hos.addPatient(patient3);
    hos.getAllPatients();
    
    Patient patient4=new Patient();
    patient4.setPatientName("aishwarya");
    patient4.setGender(Gender.FEMALE);
    patient4.setIdProof(IdProof.PAN);
    patient4.setIdProof(IdProof.DN);
    patient4.setIdProof(IdProof.AADHAR);
    patient4.setIdProof(IdProof.DRIVING_LICENSE);
    patient4.setRelatinship(CommitedRelatinship.SINGLE);
    hos.addPatient(patient4);
    hos.getAllPatients();
    
    Patient patient5=new Patient();
    patient5.setPatientName("dinkar");
    patient5.setGender(Gender.MALE);
    patient5.setIdProof(IdProof.PAN);
    patient5.setIdProof(IdProof.DN);
    patient5.setIdProof(IdProof.AADHAR);
    patient5.setIdProof(IdProof.DRIVING_LICENSE);
    patient5.setRelatinship(CommitedRelatinship.MARRIED);
    hos.addPatient(patient5);
    hos.getAllPatients();
    
    Patient patient6=new Patient();
    patient6.setPatientName("sanketh");
    patient6.setGender(Gender.MALE);
    patient6.setIdProof(IdProof.DN);
    patient6.setIdProof(IdProof.PAN);
    patient6.setIdProof(IdProof.AADHAR);
    patient6.setIdProof(IdProof.DRIVING_LICENSE);
    patient6.setRelatinship(CommitedRelatinship.SINGLE);
    hos.addPatient(patient6);
    hos.getAllPatients();

    Patient patient7=new Patient();
    patient7.setPatientName("manoj");
    patient7.setGender(Gender.MALE);
    patient7.setIdProof(IdProof.PAN);
    patient7.setIdProof(IdProof.DN);
    patient7.setIdProof(IdProof.AADHAR);
    patient7.setIdProof(IdProof.DRIVING_LICENSE);
    patient7.setRelatinship(CommitedRelatinship.MARRIED);
    hos.addPatient(patient7);
    hos.getAllPatients();

  }
}
