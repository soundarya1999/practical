<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form name="viewpage" method="post" action="view">
<table>
<tr>
<td>Quantity:</td>
<td><input type="text" name="quantity" value="${Login.getQuantity}/></td>
</tr>
<tr>
<td>Location:</td>
<td><input type="text" name="location" value="${Login.getLocation}/></td>
</tr>
<tr><td><input type="submit" value="login"></td><tr>
</table>
</form:form>
</body>
</html>