package com.xworkz.hospiapp.patient.patient;

import com.xworkz.hospiapp.patient.gender.Gender;
import com.xworkz.hospiapp.patient.idproof.IdProof;
import com.xworkz.hospiapp.patient.location.Address;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Patient {
    
    private int patientId;
    private String patientName;
    private long phoneNumber;
    private Gender gender;
    private IdProof idProof;
    private String patientAddress;
    private String wardNo;
    private String dieaseName;
    private int age;
    private String attendarName;
    private Address address;
}
