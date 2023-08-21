package com.xworkz.omegle.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.omegle.dto.OmegleDTO;
import com.xworkz.omegle.util.JdbcUtil;

public class OmegleRepoImpl implements OmegleRepo {

  @Override
  public boolean onSave(OmegleDTO dto) throws SQLException {
    System.out.println("Invoked onSave method");
    Connection con = JdbcUtil.getConnection();
    String query = "INSERT INTO omegle(name,email,phone,address,age) VALUES(?,?,?,?,?)";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, dto.getName());
    ps.setString(2, dto.getEmail());
    ps.setLong(3, dto.getPhone());
    ps.setString(4, dto.getAddress());
    ps.setInt(5, dto.getAge());
    int row = ps.executeUpdate();
    if (row > 0) {
      return true;
    } else {
      return false;
    }
  }
}
