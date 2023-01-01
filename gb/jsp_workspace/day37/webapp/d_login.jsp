<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="lb" class="test.D_LoginBean" />
<%-- LobinBean() lb = new LoginBean(); --%>
<jsp:setProperty property="*" name="lb" />
<%--  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	if (request.getMethod().equals("POST")) {
		lb.login();
	}
	%>

	<form method="post">
		<input type="text" name="userId" placeholder="아이디 입력" required>
		<input type="password" name="userPw" placeholder="비밀번호 입력" required>
		<input type="submit" value="로그인">
	</form>

	<hr>
	
	<%
	if (lb.getMsg() != null) {
		// out.println(lb.getMsg());
		%>
		<%= lb.getMsg() %>
		<%
	}
	%>

</body>
</html>