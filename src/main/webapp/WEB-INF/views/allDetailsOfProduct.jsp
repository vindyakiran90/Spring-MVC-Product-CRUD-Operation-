<%@page import="com.tyss.springmvc.beans.ProductInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<% List<ProductInfoBean> info = (List<ProductInfoBean>)request.getAttribute("list"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products List</title>
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
			<%for(ProductInfoBean info1 : info) { %>
			<tr>
				<td><%=info1.getProductId() %></td>
				<td><%=info1.getProductName() %></td>
				<td><%=info1.getProductPrice() %></td>
				<td><%=info1.getProductDescription() %></td>
			</tr>
			<%} %>
		</table>

	</div>
	<% } %>
</body>
</html>