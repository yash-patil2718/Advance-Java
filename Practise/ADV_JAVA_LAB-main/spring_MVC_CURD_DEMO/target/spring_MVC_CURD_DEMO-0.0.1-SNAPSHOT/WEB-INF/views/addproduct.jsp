<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Product Here</title>
</head>
<body>
<fieldset>
	<form action="insertproduct" method="post">
	Enter Product Id:<input type="number" name="pid" placeholder="Enter Pid"><br><br>
	Enter Product Name:<input type="text" name="pname" placeholder="Enter Name"><br><br>
	Enter Product Quantity:<input type="number" name="qty" placeholder="Enter Quantity"><br><br>
	Enter Product Price:<input type="number" name="price" placeholder="Enter Price"><br><br>
	<input type="submit" value="Add Product" id="button" placeholder="Submit">
	</form>
</fieldset>
</body>
</html>