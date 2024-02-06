<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
<html>
<body style="background-color:rgb(144,238,144)">
<h1 style="color: orange;">SDFC BANK</h1>
<h3 style="color: green;">EXTRAORDINARY SERVICES</h3>
<a href="/newAccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/closeAccount">Close Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/about">About</a>&nbsp;&nbsp;&nbsp;&nbsp;
<h2 style="color: purple;">Close Form</h2>
<form action="/close">
<table border="1" style="background-color: rgb(255,213,128)">
<tr>
<td>Account Number:</td>
<td><input type="number" name="accountNumber">
</td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name">
</td></tr>
<tr>
<td>Password:</td>
<td><input type="text" name="password">
</td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Clear">
</td></tr>
</table>
</form>
</body>
</html>
</center>