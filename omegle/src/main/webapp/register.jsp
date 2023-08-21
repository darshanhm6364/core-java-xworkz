<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
  rel="stylesheet"
  integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
  crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
  crossorigin="anonymous"></script>
</head>
<body class="bg-primary-subtle">
  <%@include file="navbar.jsp"%>

  <div class="container w-50 border border-dark p-3 mt-3 fw-semibold rounded bg-light">
    <h3 class="text-success text-center">${sm}</h3>
    <h3 class="text-danger text-center">${em}</h3>
    <form action="save" method="post">
      <div class="mb-2">
        <label for="exampleFormControlInput1" class="form-label">Name</label> <input type="text"
          class="form-control" id="exampleFormControlInput1" placeholder="Enter name" name="uname"
          required>
      </div>
      <div class="mb-2">
        <label for="exampleFormControlInput1" class="form-label">Email</label> <input type="email"
          class="form-control" id="exampleFormControlInput1" placeholder="Enter email" name="uemail"
          required>
      </div>
      <div class="mb-2">
        <label for="exampleFormControlInput1" class="form-label">Phone</label> <input type="tel"
          class="form-control" id="exampleFormControlInput1" placeholder="Enter phone" name="uphone"
          required>
      </div>
      <div class="mb-2">
        <label for="exampleFormControlInput1" class="form-label">Address</label> <select
          class="form-select" aria-label="Default select example" name="uaddress" required>
          <option selected>Choose address</option>
          <option value="andaman and nicobar islands">Andaman and Nicobar Islands</option>
          <option value="andhra pradesh">Andhra Pradesh</option>
          <option value="arunachal pradesh">Arunachal Pradesh</option>
          <option value="assam">Assam</option>
          <option value="bihar">Bihar</option>
          <option value="chandigarh">Chandigarh</option>
          <option value="chhattisgarh">Chhattisgarh</option>
          <option value="dadra and nagar haveli and daman and diu">Dadra and Nagar Haveli
            and Daman and Diu</option>
          <option value="delhi">Delhi</option>
          <option value="goa">Goa</option>
          <option value="gujarat">Gujarat</option>
          <option value="haryana">Haryana</option>
          <option value="himachal pradesh">Himachal Pradesh</option>
          <option value="jammu and kashmir">Jammu and Kashmir</option>
          <option value="jharkhand">Jharkhand</option>
          <option value="karnataka">Karnataka</option>
          <option value="kerala">Kerala</option>
          <option value="lakshadweep">Lakshadweep</option>
          <option value="madhya pradesh">Madhya Pradesh</option>
          <option value="maharashtra">Maharashtra</option>
          <option value="manipur">Manipur</option>
          <option value="meghalaya">Meghalaya</option>
          <option value="mizoram">Mizoram</option>
          <option value="nagaland">Nagaland</option>
          <option value="odisha">Odisha</option>
          <option value="puducherry">Puducherry</option>
          <option value="punjab">Punjab</option>
          <option value="rajasthan">Rajasthan</option>
          <option value="sikkim">Sikkim</option>
          <option value="tamil nadu">Tamil Nadu</option>
          <option value="telangana">Telangana</option>
          <option value="tripura">Tripura</option>
          <option value="uttar pradesh">Uttar Pradesh</option>
          <option value="uttarakhand">Uttarakhand</option>
          <option value="west bengal">West Bengal</option>
        </select>
      </div>
      <div class="mb-2">
        <label for="exampleFormControlInput1" class="form-label">Age</label> <input type="number"
          class="form-control" id="exampleFormControlInput1" placeholder="Enter age" name="uage"
          required>
      </div>
      <input type="submit" class="btn btn-success mt-2">
    </form>
  </div>
</body>
</html>