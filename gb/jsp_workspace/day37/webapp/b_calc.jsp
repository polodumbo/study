<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	// 스크립트릿
	// JAVA 언어 영역

	int res = 0;

	// 페이지를 첫 로딩하는 요청은 GET
	if (request.getMethod().equals("POST")) { // 사용자가 POST 요청을 했다면,

		// 웹 데이터는 String임에 유의!
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		String op = request.getParameter("operator");
		// op = 사용자가 보내온 정보.파라미터중에("operator");
		if (op.equals("+")) { // 사용자가 보낸 연산자 값
			res = num1 + num2;
		} else if (op.equals("-")) {
			res = num1 - num2;
		} else if (op.equals("x")) {
			res = num1 * num2;
		} else {
			res = num1 / num2;
		}
	}
	%>

	<form method="post">
		<input type="text" name="num1"> <select name="operator">
			<option>+</option>
			<option>-</option>
			<option>x</option>
			<option>/</option>
		</select> <input type="text" name="num2"> <input type="submit"
			value="계산하기">
	</form>

	<hr>

	계산결과:
	<%=res%>
	<%-- 
		표현식
		화면에 JAVA 변수 등을 출력할때에 사용
	 --%>

</body>
</html>