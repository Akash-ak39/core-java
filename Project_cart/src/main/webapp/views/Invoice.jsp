
<!DOCTYPE html>
<%@page import="java.util.Enumeration"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invoice</title>
<style type="text/css">
body {
 background-image: url("https://img.freepik.com/free-vector/watercolor-stains-abstract-background_23-2149107181.jpg?w=2000");
  text-align: center;
   background-size: 4840x3160  ;
    }
a{
text-decoration: none;
}
table {
	text-align: center;
	align-content: center;
}
</style>
</head>
<body>
<h1>Invoice</h1><center>
<table  border="1"><thead><tr><th>Name</th><th>Value</th></tr></thead>
<% long c=0;
Enumeration<String> em=session.getAttributeNames();
while(em.hasMoreElements()){
	String a=em.nextElement().toString();
	String b=session.getAttribute(a).toString();
	if(a.equals("shop")){}
	else{
		c=c+Long.parseLong(b);
%>
<tbody>
<tr><td><%=a %></td><td><%=b %></td></tr>
</tbody>
<%
	}
}
%>
<tfoot><tr><td>Total</td><td><%=c %></td></tr></tfoot>
</table></center>
<a href="../index.html">Home</a>
</body>
</html>