<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<body style="background-color: pink;">

<h1 style="color: blue;">Data Based on Given details</h1>
<table border="1" style="background-color: red;">
<tr>
<td>Account Number</td>
<td>UserName</td>
<td>Deposit</td>


</tr>
<tr>
<td>${b1.accountNumber}</td>
<td>${b1.name}</td>
<td>${b1.deposit}</td>


</tr>

</table>

</body>


</html>