<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿 02</title>
</head>
<body>

	<%
	for (int i = 1; i <= 10; i++) {
	%>
		<%= i %>
		<BR>
	<%
	}
	%>

</body>
</html>