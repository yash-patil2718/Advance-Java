<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product </title>
</head>
<body>

<fieldset>
	<form action="/spring_MVC_CURD_DEMO/product/updateProduct" method="post">
	Enter Product Id:<input type="number" name="pid" placeholder="Enter Pid" value="${p.pid}"} readonly><br><br>
	Enter Product Name:<input type="text" name="pname" placeholder="Enter Name" value ="${p.pname}"><br><br>
	Enter Product Quantity:<input type="number" name="qty" placeholder="Enter Quantity" value = "${p.qty}"><br><br>
	Enter Product Price:<input type="number" name="price" placeholder="Enter Price" value="${p.price}"><br><br>
	<input type="submit" value="Update Product" id="button" placeholder="Submit">
	</form>
</fieldset>

</body>
</html>