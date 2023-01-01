<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모듈화 01</title>
</head>
<body>

	<%
	// 1. CalcBean을 객체화 == cb
		// 2. 사용자가 요청한 정보들의 파라미터들을 cb에 setter

		C_CalcBean cb = new C_CalcBean();

		if (request.getMethod().equals("POST")) {
			cb.setNum1(Integer.parseInt(request.getParameter("num1")));
			cb.setNum2(Integer.parseInt(request.getParameter("num2")));
			cb.setOp(request.getParameter("operator"));

			cb.calculate();
		}
			// cb.calculate(); cb가 실행되지 않은 상태라서 여기서는 NPE 발생
	%>

	<form method="post">
		<input type="text" name="num1">
		<select name="operator">
			<option>+</option>
			<option>-</option>
			<option>x</option>
			<option>/</option>
		</select>
		<input type="text" name="num2">
		<input type="submit" value="계산하기">
	</form>

	<hr>

	계산결과: <%= cb.getRes() %>

</body>
</html>