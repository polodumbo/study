<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 내장객체</title>
</head>
<body>
	<%
	application.setAttribute("name", "홍길동");
	application.setAttribute("count", 0);
	%>
	<a href="e_application_result.jsp">방문하기</a>
</body>
</html>