<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/con/first" method="POST" modelAttribute="userobj">
UserName:<form:input path="uname" />
	<br>
UserID:<form:input path="uid" />
	<br>
Password:<input type="password" path="password" />
	<br>
Re-Enter PassWord:<input type="password" name="password2" />
	<br>
Email:<form:input path="email" />
	<br>
Phone:<form:input path="phone" />
	<br>
City:<form:input path="city" />
	<br>
Address:<form:input path="address" />
	<br>
Flag:<form:input path="flag" />
	<br>
Image:<form:input type="file" path="img" />
	<br>

	<input type="submit" value="click">


</form:form>