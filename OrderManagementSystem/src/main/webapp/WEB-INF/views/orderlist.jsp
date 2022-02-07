<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order List</title>
</head>
<body>


	<div align="center">
	<h2>Order Details</h2>
	<table border="1" cellpadding = "5">
		<caption><h2>List of Order</h2></caption>
		<tr>
			<th>OrderId </th>
			<th>OrderDate </th>
			<th>OrderValue </th>
			<th>Actions </th>
		</tr>
		<c:forEach items = "${Orders}" var="ord" >
		
		<!-- Construct update and delete links with order id -->
		<c:url var="updateOrder" value="/oms/order/updateOrder">
			<c:param name="orderId" value="${ord.orderId}"></c:param>
		</c:url>
		<c:url var="deleteOrder" value="/oms/order/deleteOrder">
			<c:param name="orderId" value="${ord.orderId}"></c:param>
		</c:url>
		<tr>
			<td><c:out value= "${ord.orderId}" /></td>
			<td><c:out value= "${ord.orderDate}" /></td>
			<td><c:out value= "${ord.orderValue}" /> </td>
			<td>
				<a href="${updateOrder}">Update</a>
				<a href="${deleteOrder}">Delete</a>
			</td>
		</tr>
		</c:forEach>
</table>
		
</div>
</body>
</html>