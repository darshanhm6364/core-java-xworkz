package com.xworkz.omegle.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OmegleDTO {
  private int id;
  @NotNull
  @NotEmpty
  private String name;

  @Email
  private String email;

  @Min(value = 1000000000L, message = "PhoneNumber must be 10 digits")
  @Max(value = 9999999999L, message = "PhoneNumber must be 10 digits")
  private long phone;

  @NotNull
  @NotEmpty
  private String address;

  @Min(value = 18, message = "Age must be 18 and above")
  private int age;
}
