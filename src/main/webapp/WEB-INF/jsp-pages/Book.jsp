<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/Book.css">
<meta charset="ISO-8859-1">
<title>Book Product</title>
</head>
<body>
<div>
<h4 id="head">Book a product</h4>
<a href="Cart" class="btn btn-primary" id="cart">Cart</a>
<form:form action="/MainPage" modelAttribute="bookproduct" method="post">
<table class="table table-dark">
  <thead>
    <tr>
    <th scope="col">Check box</th>
      <th scope="col">Type</th>
      <th scope="col">Product Name</th>
      <th scope="col">Specifications</th>
      <th scope="col">Description</th>
    </tr>
  </thead>
<c:forEach var="name" items="${value}">
  <tbody>
    <tr>
    <td><form:checkbox path="ProductName" value="${name.getProductName()}"/></td>
      <td>${name.getType()}</td>
      <td>${name.getProductName()}</td>
      <td>${name.getSpecifications()}</td>
      <td>${name.getDescription()}</td>
    </tr>
    </tbody>
    </c:forEach>
    </table>
<button type="submit" class="btn btn-primary" id="order">Order</button>
</form:form>
<a href="index" class="btn btn-primary" id="back">Back to Search</a>
</div>
</body>
</html>