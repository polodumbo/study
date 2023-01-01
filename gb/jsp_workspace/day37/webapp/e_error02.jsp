<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 발생 시 사용자에게 제공될 페이지</title>
</head>
<body>
	<h1>에러가 발생했습니다.</h1>
	<hr>
	
	<!-- isErrorPage="true"이기 사용 가능 -->
	<!-- try~catch 같은 기능 -->
	<%= exception %>
</body>
</html>