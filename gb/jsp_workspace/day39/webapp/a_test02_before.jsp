<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// a_test02.jsp와 LoginBean으로 분화

// 로그인 처리 페이지
// 화면에 출력되지않음

request.setCharacterEncoding("UTF-8");

final String ID = "test"; // 상수화
final String PW = "1234";

String id = request.getParameter("id");
if (id.equals(ID)) {
	if (request.getParameter("pw").equals(PW)) {
		session.setAttribute("id", id);
		response.sendRedirect("a_test03.jsp");
	} else {
		out.println("<SCRIPT>alert('잘못된 비밀번호입니다!');history.go(-1);</SCRIPT>");
	}
} else {
	// 알림창을 띄우고싶음
	// script
	// HTML 영역
	out.println("<SCRIPT>alert('잘못된 아이디입니다!');history.go(-1);</SCRIPT>");
}
%>