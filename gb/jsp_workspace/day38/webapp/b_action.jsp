<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 수행 결과 페이지</title>
</head>
<body>
	이 페이지는 action.jsp 페이지입니다.
	
	<hr>
	
	<% out.println(request.getParameter("email")); %> <br>
	<%-- <%= request.getParameter("email") %> <br> --%>
	<%= request.getParameter("name") %> <br>
	<%= request.getParameter("age") %>
</body>
</html>