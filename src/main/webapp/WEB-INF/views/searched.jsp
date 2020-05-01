<%@page import="com.tyss.springmvc.beans.ProductInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% ProductInfoBean info = (ProductInfoBean)request.getAttribute("bean"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
	<% if(info != null) { %>
	<div align="center">
		<table border="1" style="width: 70%">
			<tr style="background: navy; color: white;">
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Price</th>
				<th>Product Description</th>
			</tr>
			<tr>
				<td><%=info.getProductId() %></td>
				<td><%=info.getProductName() %></td>
				<td><%=info.getProductPrice() %></td>
				<td><%=info.getProductDescription() %></td>
			</tr>
		</table>

	</div>
	<% } %>
</body>
</html>