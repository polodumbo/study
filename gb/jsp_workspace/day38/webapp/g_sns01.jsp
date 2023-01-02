<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>

	<h1>로그인 페이지</h1>
	<!-- 이름을 name에 담아서 파라미터로 슝 -->
	<form action="g_sns02.jsp" method="post">
		이름: <input type="text" name="name">
		<input type="submit" value="로그인">
	</form>

</body>
</html>