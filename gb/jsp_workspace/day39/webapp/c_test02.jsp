<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="test.MemberVO"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!-- mDAO 객체 생성 -->
<jsp:useBean id="mDAO" class="test.MemberDAO" />
<!-- mVO 객체 생성 -->
<jsp:useBean id="mVO" class="test.MemberVO" />
<!-- 이전 페이지의 데이터가 깡통 mVO에 채워진다. -->
<jsp:setProperty property="*" name="mVO"/>
<%
MemberVO member = mDAO.selectOne(mVO);
if (member != null) {
	session.setAttribute("member", member);
	response.sendRedirect("c_test03.jsp");
} else {
	out.println("<SCRIPT>alert('로그인 정보가 정확하지않습니다!');history.go(-1);</SCRIPT>");
}
%>