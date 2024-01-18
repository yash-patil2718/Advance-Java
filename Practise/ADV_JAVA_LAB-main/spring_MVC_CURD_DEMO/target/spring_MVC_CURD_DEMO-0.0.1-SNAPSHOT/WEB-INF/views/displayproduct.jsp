<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Product </title>
</head>
<body>
	
	<h1>Product Details</h1>
	<hr>
<table border="2" align="center">
  <tr >
     <th>Product Id</th>
     <th>Product Name</th>
     <th>Quantity</th>
     <th>price</th>
     <th>action</th>
  </tr>
  <c:forEach var="p" items="${plist}">
     <tr>
       <td>${p.pid}</td>
       <td>${p.pname}</td>
       <td>${p.qty}</td>
       <td>${p.price}</td>
       <td><a href="delete/${p.pid}">delete</a>
       /
       <a href="edit/${p.pid}">edit</a></td>
     </tr>
  </c:forEach>
</table>
<center><a href="addproduct">Add new Product</a></center>

</body>
</html>