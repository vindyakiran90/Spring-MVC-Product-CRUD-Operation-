<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<div align="center">
		<fieldset>
			<legend>Add Product</legend>
			<form action="./added" method="post">
				<table>
					<tr>
						<td>Product Id</td>
						<td><input type="number" name="productId"></td>
					</tr>
					<tr>
						<td>Product Name</td>
						<td><input type="text" name="productName"></td>
					</tr>
					<tr>
						<td>Product Price</td>
						<td><input type="number" name="productPrice"></td>
					</tr>
					<tr>
						<td>Product Description</td>
						<td><input type="text" name="productDescription"></td>
					</tr>
					<tr>
						<td><input type="submit" value="Register"></td>
					</tr>
				</table>
			</form>
		</fieldset>
	</div>
</body>
</html>