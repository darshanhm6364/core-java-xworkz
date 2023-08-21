package com.xworkz.omegle.servi;

import java.sql.SQLException;

import com.xworkz.omegle.dto.OmegleDTO;

public interface OmegleServi {
  boolean validateAndSave(OmegleDTO dto) throws SQLException;
}
