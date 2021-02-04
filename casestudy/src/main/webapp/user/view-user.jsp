<%@page import="com.cybage.model.User"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<a href="<%=request.getContextPath() %>/user/add-user.jsp">Add User</a><br><br>
<table border="1">
	<tr>
		<td>Sr No</td>
		<td>User id</td>
		<td>Username</td>
		<td>Address</td>
		<td>Update</td>
		<td>Delete</td>
	</tr>
	
<%-- 	<c:forEach var = "u" items="${users }">
	
		<tr>
		<td>Sr No</td>
		<td><c:out value="${u.id }"></c:out></td>
		<td><c:out value="${u.name }"></c:out></td>
		<td><c:out value="${u.address }"></c:out>"</td>
		<td><a href=request.getContextPath()/UserController/update?id="+${u.id }+">Update</a>Update</td>
		<td>Delete</td>
	</tr>
	
	</c:forEach> --%>
	
 	<%
		List<User> users = (List)request.getAttribute("users");
	int i = 0;
	for(User u : users){
		out.print("<tr><td>"+ ++i +"</td>");
		out.print("<td>"+ u.getId() +"</td>");
		out.print("<td>"+ u.getName() +"</td>");
		out.print("<td>"+ u.getAddress()+"</td>");
		
		String delurl = "<td><a href="+request.getContextPath()+"/UserController/delete?id="+u.getId()+">Delete</a></td>";
		 String updateurl = "<td><a href="+request.getContextPath()+"/UserController/update?id="+u.getId()+">Update</a></td>";
		out.print(updateurl);
		out.print(delurl);
		
		
		
	}
	%> 
</table>

<%@ include file="footer.jsp" %>