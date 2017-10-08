<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bookproject.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="book" type="bookproject.Book" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Entry Form</title>
</head>
<body>
<div>
<form method="POST" action="book.html">
<pre>
   Title: <input type="text" name="title">
  Author: <input type="text" name="author">
    ISBN: <input type="text" name="isbn">
   Pages: <input type="text" name="pages">
    Year: <input type="text" name="published">
 Edition: <input type="text" name="edition">
Language: <input type="text" name="language">
          <input type="submit" name="submit" value="Register Book">
</pre>
</form>
</div>
<c:if test="${not empty bookDao}">
<jsp:useBean id="bookDao" type="bookproject.BookDao" scope="request" />
<div>
<table>
<tr><td>Id</td><td>Title</td><td>Author</td></tr>
<% for(Book b : bookDao.getAllBooks()) { %>
	<tr><td><%= b.getId() %></td><td><%= b.getTitle() %></td><td><%= b.getAuthor() %></td>
<% } %>
</table>
</div>
<div>
<form method="POST" action="book.html">
<pre>
Id: <input type="text" name="id">
	<input type="submit" name="get-book-by-id" value="Get Book by Id">
</pre>
</form>
</div>

<c:if test="${not empty book}">

<div>
<h1>Book found!</h1>
<c:out value="${book.title}" /><br>
</div>
</c:if>
</c:if>
</body>
</html>