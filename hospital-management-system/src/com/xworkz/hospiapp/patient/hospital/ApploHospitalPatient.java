package com.xworkz.hospiapp.patient.hospital;

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
        Patient pat = null;
        for (Patient p : this.patient) {
            if (p.getPatientAddress().equals(address)) {
                pat = p;
            }
        }
        return pat;
    }

    @Override
    public String getPatientNameByWardNo(String wardNo) {
        System.out.println("invoked getpatientNameByWardNo method");
        String patName = null;
        for (Patient p : this.patient) {
            if (p.getWardNo().equals(wardNo)) {
                patName = p.getPatientName();
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
        return patNames;
    }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingPatienseName, String updateDiseaseName) {
        System.out.println("invoked updatePatientDiseaseByPatientName method");
        boolean isUpdated = false;
        for (Patient value : this.patient) {
            if (value.getPatientName().equals(existingPatienseName)) {
                value.setDieaseName(updateDiseaseName);
                isUpdated = true;
                System.out.println("patient disease updated successfully");
                System.out.println(value);
            }
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
        return isUpdated;
    }

    @Override
    public boolean updatePatientsAgeByPatientId(int updateAge, int existingPatientId) {
        boolean isUpdated = false;
        for (Patient valve : this.patient) {
            if (valve.getPatientId() == existingPatientId) {
                valve.setAge(updateAge);
                isUpdated = true;
                System.out.println(valve);
            }
        }
        return isUpdated;
    }

    @Override
    public Patient getPatientById(int patientId) {
        System.out.println("get patient details by using id");
        Patient p = null;
        for (Patient pat : this.patient) {
            if (pat.getPatientId() == patientId) {
                p = pat;
            }
        }
        return p;
    }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) {
        String attenderName = null;
        for (Patient value : this.patient) {
            if (value.getPatientId() == patientId) {
                attenderName = value.getAttendarName();
            }
        }
        return attenderName;
    }

    @Override
    public String getPatientStreetNameByPatientId(int patientId) {
        String streetName = null;
        for (Patient p : this.patient) {
            if (p.getPatientId() == patientId) {
                streetName = p.getAddress().getCountry().getState().getCity().getArea().getStreet().getStreetName();
            }
        }
        return streetName;
    }
}