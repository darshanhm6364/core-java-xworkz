package com.xworkz.omegle.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.omegle.dto.OmegleDTO;
import com.xworkz.omegle.servi.OmegleServi;
import com.xworkz.omegle.servi.OmegleServiImpl;

@WebServlet(urlPatterns = "/save")
public class OmegleSaveServlet extends HttpServlet {
  OmegleDTO dto;
  OmegleServi servi;

  public OmegleSaveServlet() {
    System.out.println("OmegleSaveServlet constructor");
  }

  @Override
  public void init() throws ServletException {
    dto = new OmegleDTO();
    servi = new OmegleServiImpl();
  }

  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Invoked doPost method");
    String name = req.getParameter("uname");
    String email = req.getParameter("uemail");
    long phone = Long.parseLong(req.getParameter("uphone"));
    String address = req.getParameter("uaddress");
    int age = Integer.parseInt(req.getParameter("uage"));

    dto.setName(name);
    dto.setEmail(email);
    dto.setPhone(phone);
    dto.setAddress(address);
    dto.setAge(age);
    System.out.println(dto.toString());

    try {
      boolean saved = servi.validateAndSave(dto);
      if (saved) {
        req.setAttribute("sm", "SUCCESS!");
        RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
        dispatcher.forward(req, resp);
      } else {
        req.setAttribute("em", "ERROR!");
        RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
        dispatcher.forward(req, resp);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
