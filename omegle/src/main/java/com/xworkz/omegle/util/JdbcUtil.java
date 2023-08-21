package com.xworkz.omegle.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
  public static String url = "jdbc:mysql://localhost:3306/kr";
  public static String userName = "root";
  public static String passward = "root";
  public static Connection con;

  public static Connection getConnection() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(url, userName, passward);
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
    return con;
  }
}
