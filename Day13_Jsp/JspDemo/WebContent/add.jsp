<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body bgcolor="cyan">
<%

int a = Integer.parseInt(request.getParameter("var1"));
int b = Integer.parseInt(request.getParameter("var2"));

int c = a+b;

out.println("The result is "+c);
%>

</body>
</html>