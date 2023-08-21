package com.xworkz.omegle.servi;

import java.sql.SQLException;
import java.util.Set;

import com.xworkz.omegle.dto.OmegleDTO;
import com.xworkz.omegle.repo.OmegleRepo;
import com.xworkz.omegle.repo.OmegleRepoImpl;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class OmegleServiImpl implements OmegleServi {
  OmegleRepo repo = new OmegleRepoImpl();

  @Override
  public boolean validateAndSave(OmegleDTO dto) throws SQLException {
    System.out.println("Invoked validateAndSave method");
    if (dto != null) {
      ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
      Validator validator = factory.getValidator();
      Set<ConstraintViolation<OmegleDTO>> violations = validator.validate(dto);
      if (violations.isEmpty()) {
        System.out.println("dto is not null, proceeding to save");
        boolean save = repo.onSave(dto);
        System.out.println(save);
        return true;
      } else {
        System.out.println("violations present inside the dto: " + violations);
        return false;
      }
    } else {
      System.out.println("dto is null");
      return false;
    }
  }
}
