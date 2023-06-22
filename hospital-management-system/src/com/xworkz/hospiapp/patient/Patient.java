package com.xworkz.hospiapp.patient;

import com.xworkz.hospiapp.patient.gender.Gender;
import com.xworkz.hospiapp.patient.idproof.IdProof;
import lombok.Getter;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int patientId;
    private String patientName;
    public long phoneNumber;
    public Gender gender;
    public IdProof idProof;
    private String address;
    private String wardNo;
    private String dieaseName;


}
