<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

	<h1 align="center" >Sign in Here!</h1>
	
	<form method="post"  action="/logindemo">
		<table>
		<tr>
		<td>UserName</td>
		<td><input type="text" name="uName"/></td>
		</tr>
		
		<tr>
		<td>Password</td>
		<td><input type="password" name="pword"/></td>
		</tr>
		
		<tr>
		<td><input type="submit" name="login"/></td>
		<td><input type="reset" name="clear"/></td>
		</tr>
		
		</table>
	
	</form>

</body>
</html>