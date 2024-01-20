<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Empno : <input type="text" id="empno"/>
	StartDate: <input type="date" id="sdate"/>
	EndDate: <input type="date" id="edate"/>
	Leave Type:<select>
					<option>Earner</option>
					<option>PayLoss</option>
				</select>
	Reason : <select>
			<option>Personal</option>
			<option>Sick</option>
			<option>Ritual</option>
			<option>Out of Station</option>	
	</select>
	
	<button type="button" onclick="addleave">Apply Leave</button>
</body>
</html>