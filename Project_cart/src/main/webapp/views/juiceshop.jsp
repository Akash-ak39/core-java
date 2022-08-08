<!DOCTYPE html>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Juice Shop</title>
<style type="text/css">
body {
 background-image: url("https://static.vecteezy.com/system/resources/previews/004/854/468/original/orange-premium-fruit-juice-bar-drink-logo-icon-symbol-vector.jpg");
  text-align: center;
   background-size: 4840x3160  ;
    }
h1,span{
color: black;
}
.sub{
 background-color: green;
 color: white;
}
</style>
</head>
<body bgcolor="orange">
<h1>Juice Shop</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/con/shop" method="post">
<span><input type="hidden" name="shop" value="bikeshop">
<% rs=db.checkTable("babylon"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/con/shopimg?shopname=babylon&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next">
</form>

</body>
</html>