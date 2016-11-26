<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>amazon console</title>
</head>
<body>
<h1>AWS Monitoring and Alert Management</h1>
<div>

<div align="center">
<form  action="${pageContext.request.contextPath}/loginServlet" method="post">
   Email: <input type="text" id="email" align ="middle" name="email"><br><br>
Password:<input type="password" id="password" name="password" align="middle"><br><br>
<input type="submit" value ="Login">
</form>
<div align="right">
<img alt="img/aws.png" src="img/aws.png">
</div>
<div align="center">
<img alt="img/awsmonitoring.png" src="img/awsmonitoring.png">
</div>
</div>
</div>
</body>
</html>