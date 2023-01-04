<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.*,java.util.*"
	errorPage="error/error.jsp"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="mdao" class="member.MemberDAO" />
<jsp:useBean id="mvo" class="member.MemberVO" />
<jsp:setProperty property="*" name="mvo" />
<%
String action = request.getParameter("action");
// 사용자가 어떤 요청을 했는지에 대한 정보

if (action.equals("main")) { // 사용자의 요청이 회원목록 보여줘!라면
	ArrayList<MemberVO> datas = mdao.selectAll(null);
	request.setAttribute("datas", datas);
	//System.out.println("로그: "+datas);
	pageContext.forward("b_main.jsp");
	/*
	response.sendRedirect("b_main.jsp");
	// 메인페이지로 가줘!라는 "새로운 요청"
	// "새로운 요청"이기때문에 request 내장객체가 새로 생성됨
	// 데이터를 유지할 수 없음!!!!!
	
	pageContext.forward("b_main.jsp");
	// 지금과 같이, "전달할 데이터"가 존재한다면 [forward 액션]을 사용!!!!!
	*/
} else if (action.equals("mypage")) { // 마이페이지
	MemberVO data = mdao.selectOne(mvo);
	request.setAttribute("data", data);
	pageContext.forward("b_mypage.jsp");
} else if (action.equals("insert")) { // 새 멤버 등록
	if (mdao.insert(mvo)) {
		response.sendRedirect("b_controller.jsp?action=main");
	} else {
		out.println("<SCRIPT>alert('등록 실패했습니다!');history.go(-1);</SCRIPT>");
	}
} else if (action.equals("update")) { // 정보 변경
	if (mdao.update(mvo)) {
		response.sendRedirect("b_controller.jsp?action=main");
	} else {
		out.println("<SCRIPT>alert('변경 실패했습니다!');history.go(-1);</SCRIPT>");
	}
} else if (action.equals("delete")) { // 삭제
	if (mdao.delete(mvo)) {
		response.sendRedirect("b_controller.jsp?action=main");
	} else {
		out.println("<SCRIPT>alert('삭제 실패했습니다!');history.go(-1);</SCRIPT>");
	}
} else {
	// 에러페이지로
	out.println("<SCRIPT>alert('없는 요청입니다!');history.go(-1);</SCRIPT>");
}
%>