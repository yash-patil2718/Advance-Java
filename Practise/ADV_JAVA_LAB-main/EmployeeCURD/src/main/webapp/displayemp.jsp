<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee </title>
</head>
<body>
<table border='2'>
<tr>
<th>Employee id</th>
<th>Employee Name</th>
<th>Employee Salary</th>
<th>actions</th>
</tr>
<c:forEach var="emp" items="${list}">
<tr>
<td>${emp.empid}</td>
<td>${emp.ename}</td>
<td>${emp.sal}</td>
<td><a href="deleteemp?empid=${emp.empid}">Delete</a>/
	<a href="editemp?empid=${emp.empid}">Edit</a>
</td>	
</tr>
</c:forEach>
</table>

<a href="addemp.jsp">Add New Employee</a>
</body>
</html>