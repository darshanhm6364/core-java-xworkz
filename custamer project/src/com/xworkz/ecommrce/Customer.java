package com.xworkz.ecommrce;

import com.xworkz.ecommrce.enams.Gender;
import com.xworkz.ecommrce.enams.PaymentMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Customer {
  
  private int customerId;
  private String customerName;
  private String emailId;
  private String possward;
  private long mobileNumber;
  private Gender gender;
  private PaymentMethod paymentMethod;
  
  
  
}
