<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/views/style.css"%></style>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@400;500;600&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<div class="wrapper">
		<div class="card">
		<div class="content">
			<h1>Welcome!</h1>
		<div class="inputs">
				<form action="<%= request.getContextPath() %>/register" method="post">
				<input type="text" name="firstName" placeholder="First name">
				<input type="text" name="secondName" placeholder="Second name">
				<input type="text" name="email" placeholder="Email">
				<input type="text" name="userName" placeholder="Username">
				<input type="password" name="passwd" placeholder="Password">
							   <input type="submit" value="Submit" class="button">
			</form>

       	</div>

		</div>
	</div>
</div>
</body>
</html>