<%@page session="true"%>

<%!
	String username,password;
%>

<%

    username=(String)session.getAttribute("username");
    password=(String)session.getAttribute("password");
    
    out.print("Given UserName is :"+username);
    out.println("<br>");
    out.print("Given Password is:"+password);

%>
  