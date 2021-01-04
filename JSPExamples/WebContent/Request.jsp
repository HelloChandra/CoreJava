<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%!
String username,password;
%>
<%
username=request.getParameter("username");
password=request.getParameter("password");
out.print("Given UserName is :"+username);
out.println("Given Password is :"+password);
%>
</body>
</html>