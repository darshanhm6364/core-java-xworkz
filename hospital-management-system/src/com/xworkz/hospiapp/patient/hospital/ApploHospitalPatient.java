package com.xworkz.hospiapp.patient.hospital;

import com.xworkz.hospiapp.patient.exception.DiseaseNotFoundException;
import com.xworkz.hospiapp.patient.exception.PatientIdNotFoundException;
import com.xworkz.hospiapp.patient.exception.WardNotFoundException;
import com.xworkz.hospiapp.patient.patient.Patient;
import com.xworkz.hospiapp.patient.hospital.Hospital;

public class ApploHospitalPatient implements Hospital {
  
  Patient patient[];
  
  int index;
  
  public ApploHospitalPatient(int size) {
    patient = new Patient[size];
    
  }
  
  @Override
  public boolean addPatient(Patient patient) {
    System.out.println("invoked addPatient");
    boolean isAdded = false;
    try {
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
      
    } catch (NullPointerException npe) {
      System.out.println("catch block is excuted");
      
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
  
  @Override
  public Patient getPatientByAddress(String address) {
    Patient pat = null;
    for (Patient p : this.patient) {
      try {
        if (p.getPatientAddress().equals(address)) {
          pat = p;
        }
      } catch (NullPointerException npe) {
        System.out.println("Catch block is executed");
      }
    }
    return pat;
  }
  
  @Override
  public String getPatientNameByWardNo(String wardNo) {
    System.out.println("invoked getpatientNameByWardNo method");
    String patName = null;
   
      
      if (wardNo == null && !wardNo.isEmpty()) {
        for (Patient p : this.patient) {
          if (p.getWardNo().equals(wardNo)) {
            patName=p.getPatientName();
           // patName = p.getPatientName();
          }else{
            WardNotFoundException exception=new WardNotFoundException(wardNo);
            throw exception;
          }
        }
      }
   
    return patName;
  }
  
  @Override
  public String[] getPatientNameByDiseaseName(String dieaseName) {
    System.out.println("invoked getPatientNameByDiseaseName method");
    String[] patNames = new String[3];
    int i = 0;
    
    for (Patient p : patient) {
      if (p.getDieaseName().equals(dieaseName)) {
        patNames[i++] = p.getPatientName();
      }
    }
    DiseaseNotFoundException exception = new DiseaseNotFoundException(dieaseName);
    throw exception;
  }
  
  @Override
  public boolean updatePatientDiseaseByPatientName(String existingPatienseName, String updateDiseaseName) {
    System.out.println("invoked updatePatientDiseaseByPatientName method");
    boolean isUpdated = false;
    try {
      for (Patient value : this.patient) {
        if (value.getPatientName().equals(existingPatienseName)) {
          value.setDieaseName(updateDiseaseName);
          isUpdated = true;
          System.out.println("patient disease updated successfully");
          System.out.println(value);
        }
      }
    } catch (NullPointerException npe) {
      System.out.println("catch exception ");
      
    }
    return isUpdated;
  }
  
  @Override
  public boolean updatePatientWardNoByPatientId(int existingId, String updateWardNo) {
    System.out.println("invoked updatePatientWardNoByPatientId method");
    boolean isUpdated = false;
    
      
      
      for (Patient value : this.patient) {
        if (value.getPatientId() == existingId) {
          value.setWardNo(updateWardNo);
          isUpdated = true;
          System.out.println(value);
        }
      }
    int id = 0;
    PatientIdNotFoundException exception=new PatientIdNotFoundException(id);
   
    return isUpdated;
  }
  
  @Override
  public boolean updatePatientsAgeByPatientId(int updateAge, int existingPatientId) {
    boolean isUpdated = false;
    try {
      for (Patient valve : this.patient) {
        if (valve.getPatientId() == existingPatientId) {
          valve.setAge(updateAge);
          isUpdated = true;
          System.out.println(valve);
        }
      }
    } catch (NullPointerException npe) {
      System.out.println("catch exception is created");
      
    }
    return isUpdated;
  }
  
  @Override
  public Patient getPatientById(int patientId) {
    System.out.println("get patient details by using id");
    Patient p = null;
    try {
      for (Patient pat : this.patient) {
        if (pat.getPatientId() == patientId) {
          p = pat;
        }
      }
    } catch (NullPointerException npe) {
      System.out.println("catch exception is created");
      
    }
    return p;
  }
  
  @Override
  public String getPatientAttenderNameByPatientId(int patientId) {
    String attenderName = null;
    try {
      for (Patient value : this.patient) {
        if (value.getPatientId() == patientId) {
          attenderName = value.getAttendarName();
        }
      }
    } catch (NullPointerException npe) {
      System.out.println("catch exception is created");
      
    }
    return attenderName;
  }
  
  @Override
  public String getPatientStreetNameByPatientId(int patientId) {
    String streetName = null;
    try {
      for (Patient p : this.patient) {
        if (p.getPatientId() == patientId) {
          streetName = p.getAddress().getCountry().getState().getCity().getArea().getStreet().getStreetName();
        }
      }
    } catch (NullPointerException npe) {
      System.out.println("catch exception is created");
      
    }
    return streetName;
  }
}