package com.xworkz.hospiapp.patient.applohosp;

import com.xworkz.hospiapp.patient.Patient;
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

    @Override
    public Patient getPatientByAddress(String address) {
        for (int i = 0; i < this.patient.length; i++) {
            if (this.patient[i].getAddress().equals(address)) {
                System.out.println(this.patient[i]);
            }
        }

        return null;
    }

    @Override
    public String getPatientNameByWardNo(String wardNo) {
        System.out.println("invoked getpatientNameByWardNo method");
        if (wardNo != null && !wardNo.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getWardNo().equals(wardNo)) {
                    System.out.println(this.patient[i].getPatientName());
                }
            }
        } else {
            System.out.println("invalid ward no");
        }
        return null;
    }

    @Override
    public String[] getPatientNameByDiseaseName(String dieaseName) {
        System.out.println("invoked getPatientNameByDiseaseName method");
        if (dieaseName != null && !dieaseName.isEmpty()) {
            for (int i = 0; i < patient.length; i++) {
                if (this.patient[i].getDieaseName().equals(dieaseName)) {
                    StringBuilder patientName = new StringBuilder();
                    patientName = patientName.append(this.patient[i].getPatientName());
                    System.out.println(patientName);
                }
            }
        } else {
            System.out.println("invalid diseases name");
        }
        return null;
    }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingPatienseName, String updateDiseaseName) {
        System.out.println("invoked updatePatientDiseaseByPatientName method");
        boolean isUpdated = false;
        if (existingPatienseName != null && !existingPatienseName.isEmpty() && updateDiseaseName != null && !updateDiseaseName.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getPatientName().equals(existingPatienseName)) {
                    this.patient[i].setDieaseName(updateDiseaseName);
                    isUpdated = true;
                    System.out.println("patient disease updated successfully");
                    System.out.println(this.patient[i]);
                    System.out.println("---------------");
                }
            }
        } else {
            System.out.println("invalid patient name or updated disease name");
        }
        return isUpdated;
    }

    @Override
    public boolean updatePatientWardNoByPatientId(int existingId, String updateWardNo) {
        System.out.println("invoked updatePatientWardNoByPatientId method");
        boolean isUpdated = false;
        if (existingId != 0 && updateWardNo != null && !updateWardNo.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getPatientId() == existingId) {
                    this.patient[i].setWardNo(updateWardNo);
                    isUpdated = true;
                    System.out.println(this.patient[i]);
                }
            }
        }
        return isUpdated;
    }
}