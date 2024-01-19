<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %><%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Details</h1>
	<tr>
		<th>Student id</th>
		<th>Student name</th>
	</tr>
	<c:forEach var="s" items="${slist)">
	<tr>
		<td>${s.sid}</td>
		<td>${s.sname}</td>
	</tr>
	</c:forEach>
</body>
</html>