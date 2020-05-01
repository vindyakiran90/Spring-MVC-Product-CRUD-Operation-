<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Product</title>
</head>
<body>
	<fieldset>
		<legend>Delete Product</legend>
		<form action="./deletePro">
			Product ID:<input type="number" name="productId" required>
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<input type="submit" value="delete">
		</form>
	</fieldset>
</body>
</html>