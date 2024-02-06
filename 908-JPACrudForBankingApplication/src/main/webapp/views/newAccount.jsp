<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
<div style="border:50">
<h1 style="color: orange;">SDFC BANK</h1>
<h3 style="color: green;">EXTRAORDINARY SERVICES</h3>
</div>
<div>
<a href="/newAccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/closeAccount">Close Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/about">About</a>&nbsp;&nbsp;&nbsp;&nbsp;
</div>
<html>
<body style="background: rgb(255,213,128)">
<h2 style="color: purple;">Open Account Form</h2>

<form action="/add">
<table border="1" style="background-color: rgb(144,238,144)">
<tr>
<td>Account Number:</td>
<td><input type="number" name="accountNumber"></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name">
</td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="password"></td>
</tr>
<tr>
<td>Confirm Password:</td>
<td><input type="text" name="password"></td></tr>
<tr>
<td>Amount:</td>
<td><input type="number" name="amount">
</td></tr>
<tr>
<td>Address:</td>
<td><input type="text" name="address">
</td></tr>
<tr>
<td>Mobile Number:</td>
<td><input type="number" name="mobileNumber">
</td></tr>
<tr>
<tr>
<td>Status:</td>
<td><input type="number" name="status">
</td></tr>
<tr>
<td></td>
<td><input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Clear">
</td></tr>
</table>
</form>
</body>
</html>

</center>