<%@ include file="header.jsp" %>

<h1>Add User</h1>
<form action="<%=request.getContextPath() %>/UserController/add" method="post">
	Username : <input type="text" name="username"><br>
	Password : <input type="password" name="password"><br>
	Address : <input type="text" name="address"><br>
	<input type="submit" value="Add User"><br>
</form>

<%@ include file="footer.jsp" %>