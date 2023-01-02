<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시작 페이지</title>
</head>
<body>

	<form action="h_test01.jsp" method="post">
		forward 액션 방식으로 데이터 전송 <br>
		<input type="text" name="data">
		<input type="submit" value="데이터 전송">
	</form>

	<hr>

	<form action="h_test02.jsp" method="post">
		response.sendRedirect() 방식으로 데이터 전송 <br>
		<input type="text"name="data">
		<input type="submit" value="데이터 전송">
	</form>

</body>
</html>