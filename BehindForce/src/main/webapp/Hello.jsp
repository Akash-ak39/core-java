<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	buffer="1kb"
	autoFlush="true"
	errorPage="err.jsp"
	%>
	<hr>
	<%@ include file="header1.jsp" %>
	<hr>
	<jsp:include page="header1.jsp">
	<jsp:param name="cname" value="Anoud Technologies.."/>
	</jsp:include>
	<hr>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Date d;
	List list;
	ArrayList al;
	%>
	<% for(int i=0;i<1000;i++){
		//out.println("Hello");
	} %>
	<%="Welcome to JSP........"%>
	<%=application.getRealPath("")%>
	<%
	String uname = request.getParameter("uname");
	%>
	<h1>
		<%
		out.println(uname);
		met();
		%>
	</h1>
	<h2>
		<%=uname%><%=value%>
	</h2>

	<%!String value = "hello world...";

	void met() {
		System.out.println("called....");
	}%>
</body>
</html>
<hr>
<%@include file="footer1.jsp"%>
<hr>