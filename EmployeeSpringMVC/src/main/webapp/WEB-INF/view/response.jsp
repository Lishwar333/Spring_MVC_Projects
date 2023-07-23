<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response</title>
</head>
<body>
<%
String message=(String)request.getAttribute("responsekey");
out.println("<h1>"+message+"</h1>");

 

%>
</body>
</html>