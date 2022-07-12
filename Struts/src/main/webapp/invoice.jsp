<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Enumeration em = session.getAttributeNames();
	while (em.hasMoreElements()) {
		String name = em.nextElement().toString();
		String value = session.getAttribute(name).toString();
		if (name.equals("action") || name.equals("shopping")||name.equals("nextshop")) {

		} else {

			out.println("<h1>" + name + ":" + value + "<h1>");
		}
	}
	%>
</body>
</html>