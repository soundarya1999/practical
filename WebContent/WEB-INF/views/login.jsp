<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loginj page</title>
</head>
<body>
<form:form name="loginpage" method="post" action="login">
<table>
<tr>
<td>UserName:</td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pswd"/></td>
</tr>
<tr><td><input type="submit" value="login"></td><tr>
</table>
</form:form>
</body>
</html>