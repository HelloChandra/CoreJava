<%@page session="true"%>

<html>
<body>
<%
  String username=(String)session.getAttribute("username");

%>
<%=username%>Login Success
</body>
</html>