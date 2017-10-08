<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bookproject.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Person REgistration Form</title>
</head>
<body>
<form method="POST" action="person.html">
<pre>
   Name: <input type="text" name="name">
  Email: <input type="text" name="email">
         <input type="submit" value="Register Person">
</pre>
</form>
<c:if test="${not empty personDao}">
<jsp:useBean id="personDao" type="bookproject.PersonDao" scope="request" />

<table>
<tr><td>Id</td><td>Name</td><td>Email</td></tr>
<% for(Person person : personDao.getAllPersons()) { %>
	<tr><td><%= person.getId() %></td><td><%= person.getName() %></td><td><%= person.getEmail() %></td>
<% } %>
</table>
</c:if>
</body>
</html>