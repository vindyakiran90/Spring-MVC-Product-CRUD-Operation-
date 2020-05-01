<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Product</title>
</head>
<body>
	<div align="center">
		<fieldset>
			<legend>Search Product</legend>
			<form action="./searchProduct">
				Product ID:<input type="number" name="productId" required>
				&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" value="search">
			</form>
		</fieldset>
	</div>
</body>
</html>