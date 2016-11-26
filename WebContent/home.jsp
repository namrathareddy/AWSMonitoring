<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to your home page</title>
</head>
<body>
	<div align="right">
		<form method="get" action="logoutServlet">
			<input type="submit" value="Logout" />
		</form>
	</div>
	<h3>
		Hello,
		<%=session.getAttribute("emailId")%></h3>
	<h3>Welcome to your AWS monitoring place!!!!</h3>
	
</body>
</html>