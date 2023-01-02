<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include 액션</title>
</head>
<body>
	이 페이지는 b_includeAction.jsp 페이지입니다.
	
	<hr>
	
	<!-- jsp 액션태그 내부에 주석을 넣으면 안 된다 -->
	<%-- <jsp:param value="값" name="변수명"/> --%>
	<jsp:include page="b_action.jsp">
		<jsp:param value="polosh1208@gmail.com" name="email"/>
		<jsp:param value="timo" name="name"/>
	</jsp:include>
</body>
</html>