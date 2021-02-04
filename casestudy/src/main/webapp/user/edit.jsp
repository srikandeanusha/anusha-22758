<%@page import="com.cybage.model.User"%>
<%@ include file="header.jsp" %>
<%@ page isELIgnored="false" %>

<h1>Add User</h1>
<%
User u = (User)request.getAttribute("user");
System.out.println(">>>>>>"+u.getName());
%>

<form action="<%=request.getContextPath() %>/UserController/update-data" method="post">
	<input type="text" name="id" value="<%=u.getId() %>" readOnly><br>
	Username : <input type="text" name="username" value="<%=u.getName() %>"><br>
	
	Address : <input type="text" name="address" value="<%=u.getAddress() %>"><br>
	<input type="submit" value="Update"><br>
	
</form>

<%@ include file="footer.jsp" %>