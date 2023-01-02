<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 내장객체</title>
</head>
<body>
	<%
		if (session.isNew()) { // session이 새로운 session이니?
			out.println("<SCRIPT>alert('새로운 세션 생성');</SCRIPT>"); // SCRIPT 태그 > 가독성
			session.setAttribute("name", "이성훈");
		}
	%>

	<!-- request보다 큰 범위들은 parameter가 아닌 attribute를 사용 -->
	<%= session.getAttribute("name") %>
</body>
</html>