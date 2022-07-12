<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connecting to Database</title>
</head>
<script>
function checkForm(){
	if(document.Customer.hName.value.length==0){
		alert("Please enter Name");
		return false;
	}
	if(isNaN(document.Customer.hAge.value)){
		alert("Please enter Age as Numeric");
		return false;
	}
	document.Customer.ID.value="Insert";
	document.Customer.submit();
	return true;
}
function checkform19{
	document.Customer.ID.value="Dislay";
	document.customer.submit();
	return true;
}
</script>
<body>
	<%@ include file="Header.jsp"%>
	<h3>Employee Details</h3>
	<form name="Customer" method="get" action="dbConn.jsp">
		<input type="hidden" name="ID" value="Display">
		<table>
			<tr>
				<td>Enter Name:</td>
				<td><input type="text" name="hName" size="20"></td>
				<td>Enter Age:</td>
				<td><input type="text" name="hAge" size="3"></td>
			</tr>
			<td colspan="2" align="center"><input type="button" name="hAdd"
				value="Insert" onClick="checkForm()"></td>
			<td colspan="2" align="center"><input type="button" name="hDisp"
				value="Display" onclick="checkForm1()"></td>
			</tr>
		</table>
	</form>
	<%@ include file="Footer.jsp"%>
</body>
</html>