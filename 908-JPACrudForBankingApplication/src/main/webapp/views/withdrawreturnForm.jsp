<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<body style="background-color: pink;">
<form action="/with">
<h1 style="color: blue;">Data Based on Given details</h1>
<table border="1" style="background-color: red;">
<tr>

<td>Amount</td>
<td>Withdraw</td>


</tr>
<tr>

<td>${b2.amount}</td>
<td>${b2.withdraw}</td>

</tr>

</table>
</form>
</body>


</html>