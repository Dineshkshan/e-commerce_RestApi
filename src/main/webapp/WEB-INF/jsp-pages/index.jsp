<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/index.css">
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>
<h4 id="heading">Welcome to Dk's Store!!</h4>
<form action="/mainpage">
<div class="form-group">
<input type="text" name="search" class="form-control" placeholder="search.."/>
<button type="submit" class="btn btn-primary" id="button">search</button>
<p id="para">Enter Mobile or Laptop to search (Case-Sensitive)!!!</p>
</div>
</form>
</body>
</html>