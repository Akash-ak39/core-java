<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Employee Details</h3>
	<%@ page import="java.sql.*,demo.dbConn"%>

	<%!ResultSet rs;
	dbConn db;
	String sConn;

	public void jsplnit() {
		db = new dbConn();
		sConn = db.DBConnect();
		rs = null;
	}%>
	<a href="start.jsp">Home</a>
	<%
String sID=request.getParameter("ID");
if(sID.equals("Insert")){
String sName=request.getParameter("hName");
int iage=(new Integer(request.getParameter("hAge"))).intValue();
String sInsState=null;
if(sConn.equals(""));{
sInsState=db.setData(sName,iage);
}
%>
	<h1><%=sInsState %></h1>
	<%
}else{
rs=db.getData();%>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<%
while(rs.next()){
%>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td><%=rs.getInt(2) %></td>
		</tr>
		<%
}
%>
	</table>
	<% }%>

</body>
</html>