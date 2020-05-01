<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body>
	<fieldset>
		<legend>Update Product</legend>
		<form action="./updatePro">

			<table>
				<tr>
					<td>Product ID</td>
					<td><input type="number" name="productId" required></td>
				</tr>
				<tr>
					<td>Product Price</td>
					<td><input type="number" name="productPrice"></td>
				</tr>

				<tr>
					<td><input type="submit" value="update"></td>
				</tr>
			</table>


		</form>
	</fieldset>
</body>
</html>