<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage - Spring Boot</title>
</head>
<body>
	<h1>Welcome to Spring Boot...!!!</h1>
	<p>Calculation</p>
	<form action="add">
		Enter First Number <input type="text" name="num1">
		Enter Second Number <input type="text" name="num2">
		<input type="submit">
	</form><br />
	<p>Add Alien</p>
	<form action="addAlien" method="post">
		Enter AID <input type="text" name="aid">
		Enter Alien Name <input type="text" name="aname">
		<input type="submit">
	</form>
</body>
</html>