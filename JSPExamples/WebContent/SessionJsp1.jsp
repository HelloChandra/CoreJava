<html>
<body>

<%@page session="true"%>

<%!
	String username,password;
%>

<%
   username=request.getParameter("username");
   password=request.getParameter("password");
   
   
   session.setAttribute("username",username);
   session.setAttribute("password",password);
   out.print("Data Added to the session");
   
 %>
 <a href="SessionJsp2.jsp">Session Data ?</a>
 </body>
 </html>