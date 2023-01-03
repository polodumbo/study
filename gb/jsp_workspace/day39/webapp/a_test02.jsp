<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="lb" class="test.LoginBean" />
<jsp:setProperty property="*" name="lb" />
<%
if (lb.login()) {
	session.setAttribute("id", lb.getId());
	response.sendRedirect("a_test03.jsp");
} else {
	// 알림창을 띄우고싶음
	// script
	// HTML 영역
	out.println("<SCRIPT>alert('로그인 정보가 정확하지않습니다!');history.go(-1);</SCRIPT>");
}
%>