<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Customer</title>
</head>
<body>
<table border="2">
 	<tr>
 		<th>Customer No</th>
 		<th>Base Pack</th>
 		<th>Optional Pack</th>
 	</tr>
 	 	<tr>
 		<td>001</td>
 		<td>Disco Hindi</td>
 		<td>Comedy</td>
 	</tr>
 </table>
<c:forEach var="c" items="${cLsit}">
 <p>${c.customerId}   ${c.basePack}  ${c.addpack}</p>
</c:forEach>
</body>
</html>