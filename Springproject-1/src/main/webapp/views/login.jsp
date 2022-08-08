<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/form1/login" method="post" modelAttribute="">

UserName:<form:input path="uname"/><br>
Password:<form:input path="password"/><br>

<input type="submit" value="click">
</form:form>