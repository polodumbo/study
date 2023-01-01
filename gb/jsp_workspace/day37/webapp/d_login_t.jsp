<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실습 예제 풀이</title>
</head>
<body>

	<%
	String id = "";
	String pw = "";
	if (request.getMethod().equals("POST")) {
		id = request.getParameter("id");
		pw = request.getParameter("pw");
	}
	System.out.println("로그: " + id + " " + pw);
	String msg = "없는 아이디이거나 아직 로그인하지 않았습니다...";
	if (id.equals("timo")) {
		msg = "비밀번호 오류!";
		if (pw.equals("1234")) {
			msg = "안녕하세요, 티모님!";
		}
	}
	%>

	<form method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" placeholder="아이디 입력" required></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pw" placeholder="비밀번호 입력" required></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					value="로그인하기"></td>
			</tr>
		</table>
	</form>

	<hr>

	로그인 결과:
	<%=msg%>

</body>
</html>