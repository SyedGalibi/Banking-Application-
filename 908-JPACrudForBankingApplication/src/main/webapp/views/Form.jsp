<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<body style="background-color: pink;">
<form action="/dep">
<h1 style="color: blue;">Data Based on Given details</h1>
<table border="1" style="background-color: red;">
<tr>
<td>Account Number</td>
<td>UserName</td>
<td>Amount</td>
<td>Address</td>
<td>phone</td>
<td>DataUpdate</td>

</tr>
<tr>
<td>${b1.accountNumber}</td>
<td>${b1.name}</td>
<td>${b1.amount}</td>
<td>${b1.address}</td>
<td>${b1.mobileNumber}</td>
<td><a href="/accountdata">UpdateAount</a>
</tr>

</table>
</form>
</body>


</html>