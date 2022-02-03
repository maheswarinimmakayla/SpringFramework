<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
	<h2>Customer Details</h2>
	<h2>${Customer.customer}</h2>
	 <div align="center">
	<table border="1" cellpadding = "5">
		<caption><h2>List of customer</h2></caption>
		<tr>
			<th>CustomerId </th>
			<th>CustomerName </th>
			<th>CustomerPhoneNo </th>
			<th>CustomerLocation </th>
			
		</tr> 
		<c:forEach items = "${Customer.customer}" var="customer" >
	
	      <tr>
			<td><c:out value= "${customer.customerId}" /></td>
			<td><c:out value= "${customer.customername}" /></td>
			<td><c:out value= "${customer.custonerPhoneNo}" /> </td>
			<td><c:out value= "${customer.customerLocation}" /> </td>
		</tr> 
		</c:forEach>
	</table> 
		
</div>
</body>
</html>