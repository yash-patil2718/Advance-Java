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
<h1>Product Details</h1>
<table border="2">
  <tr >
     <th>Employee No</th>
     <th>Start Date</th>
     <th>End date</th>
     <th>Leave Type</th>
     <th>Leave Reason</th>
  </tr>
  <c:forEach var="p" items="${elist}">
     <tr>
       <td>${p.empno}</td>
       <td>${p.Startdate}</td>
       <td>${p.Enddate}</td>
       <td>${p.Leavetype}</td>
       <td>${p.Reason}</td>
     </tr>
  </c:forEach>
</table>
<a href="addleave">Add new Leave</a>
</body>
</html>