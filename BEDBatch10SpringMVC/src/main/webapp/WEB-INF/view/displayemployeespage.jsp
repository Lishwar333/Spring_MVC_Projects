<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.wipro.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> employees=(List<Employee>)request.getAttribute("employeekey");
%>
<table>
<th>Employee ID</th><th>Employee Name</th><th>Employee Band</th>
<%
for(Employee e:employees)
{
%>

 

<tr><td><%=e.getId()%></td><td><%=e.getName()%></td><td><%=e.getBand()%></td></tr>
<%

 

}
%>
</table>
</body>
</html>