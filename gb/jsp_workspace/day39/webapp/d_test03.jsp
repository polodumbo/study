<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="test.MemberVO"%>
<%request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="mDAO" class="test.MemberDAO" />
<jsp:useBean id="mVO" class="test.MemberVO" />
<jsp:setProperty property="*" name="mVO" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트 페이지</title>
</head>
<body>
	<ul>
		<%
		for(MemberVO v : mDAO.selectAll(null)) {
			out.println("<LI>" + v + "</LI>");
		}
		%>
	</ul>
	<hr>
	<a href="d_test01.jsp">회원가입</a>
</body>
</html>