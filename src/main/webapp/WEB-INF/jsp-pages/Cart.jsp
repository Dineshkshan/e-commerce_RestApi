<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/Cart.css">
<meta charset="ISO-8859-1">
<title>Cart Page</title>
</head>
<body>
<h4 id="head">Welcome to Cart page!!</h4>
<table class="table table-dark" id="table">
  <thead>
    <tr>
      <th scope="col">S.No</th>
      <th scope="col">Type</th>
      <th scope="col">Product Name</th>
      <th scope="col">Date and Time</th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="name" items="${value }">
    <tr>
      <td>${name.getProductNo() }</td>
      <td>${name.getType()}</td>
      <td>${name.getProductName()}</td>
      <td>${name.getDateAndTime()}</td>
      <td><a href="delete/${name.getProductNo()}" class="btn btn-primary">Delete</a></td>
      </tr>
      </c:forEach>
    </tbody>
    </table>
<a href="index" class="btn btn-primary" id="newitem">Add new Item</a>
<a href="confirmorder" class="btn btn-primary" id="ConfirmOrder">Confirm order</a>
</body>
</html>