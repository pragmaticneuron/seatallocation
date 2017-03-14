<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Home Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h3>Enter the product details here..</h3> </br>
<div class="col-xs-2">
<form action="http://localhost:8080/restful-test/rest/product/createProductFromForm" method="post">
  <div class="form-group">
    <label for="name">Product Name:</label>
    <input type="text" class="form-control" id="name" name="name" >
    <label for="category">Category:</label>
    <input type="text" class="form-control" id="category" name="category">
    <label for="quantity">Quantity:</label>
    <input type="text" class="form-control" id="quantity" name="quantity">
    <label for="region">Region:</label>
    <input type="text" class="form-control" id="region" name="region">
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</div>

<form action="http://localhost:8080/restful-test/rest/product/createProductFromForm" method="post">
  <button type="submit" class="btn btn-default">Get All products from DB</button>
</form>
</body>
</html>