<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bookproject.*" %>

<jsp:useBean id="bookLoanDao" type="bookproject.BookLoanDao" scope="request" />

<jsp:useBean id="bookDao" type="bookproject.BookDao" class="bookproject.BookDao" />
<jsp:useBean id="personDao" type="bookproject.PersonDao" class="bookproject.PersonDao" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Entry Form</title>
</head>
<body>
<form method="POST" action="loan.html">
<pre>
   Book: 
   <select>
   <% for(Book book : bookDao.getAllBooks()) { %>
   	<option value="<%= book.getId() %>"><%=book.getTitle() %> (<%=book.getAuthor() %>)</option>	
   <% } %>
   </select>
          <input type="submit" value="Register Book">
</pre>
</form>
<table>
<% for(BookLoan bookLoan : bookLoanDao.getAllBookLoans()) { %>
	<tr><td><%= bookLoan.getBook().getTitle() %></td><td><%= bookLoan.getBorrower().getName() %></td>
<% } %>
</table>
</body>
</html>