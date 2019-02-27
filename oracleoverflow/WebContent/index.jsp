<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="app.css">
<body>
	<center>
		<div id="login">
			<%
				String status = (String) request.getAttribute("status");
				if (status != null && status != "") {
			%>
			<h3 style="color:red;"><%=status%></h3>
			<%
				}
			%>
			<h3 style="color:green;">Login Page</h3>
			<form action="LoginController" method="post">
				<table align="center">
					<tr>
						<td>User Name:</td>
						<td><input type="text" name="uname" autofocus="autofocus" required="required"></td>

					</tr>
					<tr>
						<td>User Password:</td>
						<td><input type="text" name="pwd" autofocus="autofocus"></td>
					</tr>
					<tr>
						<th colspan="2"><input type="submit" value="Login"></th>
					</tr>
				</table>
			</form>
		</div>
	</center>
</body>
</html>