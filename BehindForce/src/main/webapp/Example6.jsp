<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- This JavaServer Page purposefully throws a NullPointerException
     that demonstrates using a JSP error page. (ErrorPage.jsp) 
 -->

<%@ page errorPage="ErrPage.jsp" import="java.util.Vector"
	import="java.io.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!Vector vec = null;%>

<body bgcolor=#ffffff>
	<h2>Let's call a method on a null Vector...</h2>

	Vector has
	<%=vec.size()%>
	elements.


</body>
</html>