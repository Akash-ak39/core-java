<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A Sample FORM using POST</title>
</head>
<body bgcolor="#FDF5E6">
	<h1 align="center">A Sample FORM using POST</h1>
	<FORM action="formTest.jsp" method="POST">
		Item Number: <input type="TEXT" name="itemnum"><br>
		Quantity: <input type="TEXT" name="quantity"><br> Price
		Each: <input type="text" name="price" value="$"><br>
		<hr>
		First Name: <input type="text" name="firstName"><br> Last
		Name: <input type="text" name="lastName"><br> Middle
		Initial: <input type="text" name="initial"><br> Shipping
		Address:
		<textarea name="address" rows=3 cols=40></textarea>
		<br> Credit Card:<br> <input type="RADIO" name="cardtype"
			value="Visa">Visa<br> <input type="RADIO"
			name="cardtype" value="Master Card">Master Card<br> <input
			type="RADIO" name="cardtype" value="Amex">American Express<br>
		<input type="RADIO" name="cardtype" value="Discover">Discover<br>
		<input type="RADIO" name="cardtype" value="Java SmartCard">Java
		SmartCard<br>
		Credit Card Number:
		<input type="password" name="cardNum"><br>
		Repeat Credit Card Number:
		<input type="password" name="cardNum"><br><br>
		<centre>
		<input type="submit" value="Submit Order">
		</centre>
	</FORM>
</body>
</html>