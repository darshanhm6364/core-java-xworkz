package com.xworkz.hospiapp.patient;

import com.xworkz.hospiapp.patient.gender.Gender;
import com.xworkz.hospiapp.patient.hospital.CommitedRelatinship;
import com.xworkz.hospiapp.patient.idproof.IdProof;
import lombok.Getter;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
  
  private  String patientName;
  public Gender gender;
  public IdProof idProof;
  public CommitedRelatinship relatinship;
  
}
