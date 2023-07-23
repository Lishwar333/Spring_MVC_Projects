<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Today Date</</title>
</head>
<body>
<h2>Today Date</h2>
<%
String tdt=(String) request.getAttribute("getdate");
out.println(tdt);
%>
</body>
</html>