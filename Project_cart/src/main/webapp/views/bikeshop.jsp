<%@page import="java.sql.ResultSet"%>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bike Shop</title>
<style type="text/css">
body {
 background-image: url("https://c4.wallpaperflare.com/wallpaper/285/846/367/feelings-quote-black-white-wallpaper-preview.jpg");
  text-align: center;
   background-size: 4840x3160  ;
    }
h1,span{
color: black;
}
.sub{
 background-color: white;
}
</style>
</head>
<body>
<h1>Biker's</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/con/shop" method="post">
<input type="hidden" name="shop" value="Invoice">
<% rs=db.checkTable("bikers"); 
while(rs.next()){ %>
<span><input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/con/shopimg?shopname=bikers&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next">
</form>
</body>
</html>