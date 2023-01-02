<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 미니홈피</title>
</head>
<body>
	<%=application.getAttribute("name")%>님의 미니홈피입니다.
	<br>
	<%
	int count = (Integer)application.getAttribute("count");
	count++;
	application.setAttribute("count", count);
	// 전위증감연산자도 가능하지만 가독성이 좋지 않다.
	// application.setAttribute("count", ++count);
	%>
	현재 방문자수: <%=count%>명
</body>
</html>