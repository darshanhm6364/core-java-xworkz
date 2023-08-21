package com.xworkz.omegle.repo;

import java.sql.SQLException;

import com.xworkz.omegle.dto.OmegleDTO;

public interface OmegleRepo {
  boolean onSave(OmegleDTO dto) throws SQLException;
}
