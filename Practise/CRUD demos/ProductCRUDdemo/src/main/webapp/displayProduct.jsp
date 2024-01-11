<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Product id</th>
		<th>Product Name</th>
		<th>Product Qty</th>
		<th>Product Price</th>
	</tr>
	<c:forEach var="pro" items="${list}">
	<tr>
	<td>${pro.pid}</td> 
	<td>${pro.pname}</td>
	<td>${pro.qty}</td>
	<td>${pro.price}</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>