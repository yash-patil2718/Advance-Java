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
	<tr>
		<th>Employee Id</th>
		<th>Employee Name</th>
		<th>Employee Salary</th>
	</tr>
	<c:forEach var="emp" items="${list}">
	<tr>
	<td>${emp.id}</td> 
	<td>${emp.name}</td>
	<td>${emp.salary}</td>
	</tr>
	</c:forEach>
</body>
</html>