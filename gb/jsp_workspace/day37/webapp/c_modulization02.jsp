<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="cb" class="test.C_CalcBean" />
<%-- 클래스명 객체명 = new 기본생성자(); --%>
<%-- 1. Bean 클래스들은 기본생성자를 반드시 가져야 함 --%>
<%-- 2. Bean 클래스들은 반드시 패키지를 가져야 함 --%>

<jsp:setProperty property="*" name="cb" />
<%-- 파라미터가 없어서 매핑할 값이 없으면 알아서 안 함 --%>
<%-- 파라미터의 값이 String인데 멤버변수가 int일 때, 알아서 형변환(캐스팅) 해 줌 --%>
<%-- setProperty는 setter를 호출 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모듈화 02</title>
</head>
<body>

	<%
	// 1. CalcBean을 객체화 == cb
	// 2. 사용자가 요청한 정보들의 파라미터들을 cb에 setter

	if (request.getMethod().equals("POST")) {
		cb.calculate();
	}
	%>

	<form method="post">
		<input type="text" name="num1"> <select name="op">
			<option>+</option>
			<option>-</option>
			<option>x</option>
			<option>/</option>
		</select>
		<input type="text" name="num2">
		<input type="submit" value="계산하기">
	</form>

	<hr>

	계산결과: <jsp:getProperty property="res" name="cb" />
	<%-- getPropery는 getter를 호출 --%>
	<%-- 잘 사용하진 않음 --%>

</body>
</html>