<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>foward 액션</title>
</head>
<body>
	이 페이지는 b_fowardAction.jsp 페이지입니다.
	
	<hr>
	
	<jsp:forward page="b_action.jsp">
		<jsp:param value="polosh1208@gmail.com" name="email"/>
		<jsp:param value="timo" name="name"/>
	</jsp:forward>
</body>
</html>