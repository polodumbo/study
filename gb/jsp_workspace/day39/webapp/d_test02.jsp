<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>

<!-- scope="application" application 단위로 유지 -->
<%-- 
	<%
		if (application.getAttribute("mDAO") == null) {
			MemberDAO mDAO = new MemderDAO();
			application.setAttribute("mDAO", mDAO);
		}
		mDAO = application.getAttribute("mDAO");
	%>
--%>
<jsp:useBean id="mDAO" class="test.MemberDAO" scope="application"/>

<jsp:useBean id="mVO" class="test.MemberVO" />
<jsp:setProperty property="*" name="mVO" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 확인 페이지</title>
</head>
<body>
	<%
	mDAO.insert(mVO);
	%>

	이름: <%=request.getParameter("name")%>
	<br>
	아이디: <%=request.getParameter("id")%>
	<br>
	<hr>

	<a href="d_test03.jsp">메인으로 이동하기</a>
</body>
</html>