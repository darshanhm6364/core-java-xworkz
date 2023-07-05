package com.xworkz.hospiapp.patient;

import com.xworkz.hospiapp.patient.exception.DiseaseNotFoundException;
import com.xworkz.hospiapp.patient.exception.PatientIdNotFoundException;
import com.xworkz.hospiapp.patient.exception.WardNotFoundException;
import com.xworkz.hospiapp.patient.hospital.Hospital;
import com.xworkz.hospiapp.patient.location.*;
import com.xworkz.hospiapp.patient.patient.Patient;
import com.xworkz.hospiapp.patient.hospital.ApploHospitalPatient;
import com.xworkz.hospiapp.patient.gender.Gender;
import com.xworkz.hospiapp.patient.idproof.IdProof;

import java.util.Scanner;

public class HospitalTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the patient size to be added: ");
    int size = sc.nextInt();
    Hospital hospital = new ApploHospitalPatient(size);
    for (int patientIndex = 0; patientIndex < size; patientIndex++) {
      Patient patient = new Patient();
      System.out.println("Enter patient id: ");
      patient.setPatientId(sc.nextInt());
      System.out.println("Enter patient name: ");
      patient.setPatientName(sc.next());
      System.out.println("enter ward number");
      patient.setWardNo(sc.next());
      System.out.println("enter disesName");
      patient.setDieaseName(sc.next());
      System.out.println("Enter attender name: ");
      patient.setAttendarName(sc.next());
      System.out.println("Enter patient address: ");
      patient.setPatientAddress(null);
      System.out.println("Enter age: ");
      patient.setAge(sc.nextInt());
      System.out.println("Enter phone num: ");
      patient.setPhoneNumber(sc.nextLong());
      System.out.println("enter patient gender");
      patient.setGender(Gender.valueOf(sc.next()));
      System.out.println("Enter idproof type");
      patient.setIdProof(IdProof.valueOf(sc.next()));
      
      Street street = new Street();
      System.out.println("Enter street name: ");
      street.setStreetName(sc.next());
      
      Area area = new Area();
      area.setStreet(street);
      
      City city = new City();
      city.setArea(area);
      
      State state = new State();
      state.setCity(city);
      
      Country country = new Country();
      country.setState(state);
      
      Address address = new Address();
      address.setCountry(country);
      
      patient.setAddress(address);
      hospital.addPatient(patient);
    }
    
    String text;
    do {
      System.out.println("1.get all patient details  \n2. get PatientNameByWardNo details   \n3.get PatientNameByDiseaseName \n4. updatePatientDiseaseByPatientName \n5.updatePatientWardNoByPatientId \n6.updatePatientsAgeByPatientId \n7.Get PatientById \n8. Get PatientAttenderNameByPatientId \n9. Get PatientStreetNameByPatientId ");
      int option = sc.nextInt();
      switch (option) {
        case 1:
          hospital.getAllPatients();
          break;
        
        case 2:
          System.out.println("enter the address of the find patient: ");
          Patient p = hospital.getPatientByAddress(sc.next());
          System.out.println(p);
          break;
        
        case 3:
          System.out.println("Enter ward no to find patient: ");
          try {
            String patientNameByWardNo = hospital.getPatientNameByWardNo(sc.next());
            
          } catch (WardNotFoundException e) {
            e.printStackTrace();
          }
          System.out.println("patientNameByWardNo");
          break;
        
        case 4:
          System.out.println("Enter disease name to find patient: ");
          String[] patNames = new String[0];
          try {
            patNames = hospital.getPatientNameByDiseaseName(sc.next());
          } catch (DiseaseNotFoundException dnfe) {
            dnfe.printStackTrace();
            
          }
          for (String str : patNames) {
             System.out.println(str);
          }
          break;
        
        case 5:
          System.out.println("Enter patient name & new disease name to update: ");
          try {
            hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());
          }catch(PatientIdNotFoundException pf){
            pf.printStackTrace();
            
          }
          break;
        
        case 6:
          System.out.println("Enter patient id and new ward no to update: ");
          hospital.updatePatientWardNoByPatientId(sc.nextInt(), sc.next());
          break;
        
        case 7:
          System.out.println("enter patient id to update age and enter new age");
          hospital.updatePatientsAgeByPatientId(sc.nextInt(), sc.nextInt());
          break;
        
        case 8:
          System.out.println("enter id to find patient details");
          Patient p1 = hospital.getPatientById(sc.nextInt());
          System.out.println(p1);
          break;
        
        case 9:
          System.out.println("enter patient id to find attendars");
          String att = hospital.getPatientAttenderNameByPatientId(sc.nextInt());
          System.out.println(att);
          break;
        
        case 10:
          System.out.println("Enter id to find street name: ");
          String street = hospital.getPatientStreetNameByPatientId(sc.nextInt());
          System.out.println(street);
          break;
        
        default:
          System.out.println("Enter valid option");
      }
      System.out.println("Do you want to continue: y/n");
      text = sc.next();
    } while (text.equals("y"));
  }
}