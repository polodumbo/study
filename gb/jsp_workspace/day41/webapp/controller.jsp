<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error/error.jsp"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="bdao" class="board.BoardDAO" />
<jsp:useBean id="bvo" class="board.BoardVO" />
<jsp:setProperty property="*" name="bvo" />
<%
String action = request.getParameter("action");

if (action.equals("main")) { // 메인(전체 목록)
	if (bvo.getSearchCondition() == null) {
		request.setAttribute("datas", bdao.selectAll(null));
	} else {
		request.setAttribute("datas", bdao.selectAll(bvo));
	}
	pageContext.forward("main.jsp");
} else if (action.equals("board")) { // 게시글 페이지
	if (request.getParameter("passwd").equals("1234")) {
		request.setAttribute("data", bdao.selectOne(bvo));
		pageContext.forward("board.jsp");
	} else {
		out.println("<SCRIPT>alert('비밀번호가 올바르지않습니다!');history.go(-1);</SCRIPT>");
	}
} else if (action.equals("insert")) { // 새 게시글 등록
	if (bdao.insert(bvo)) {
		response.sendRedirect("controller.jsp?action=main");
	} else {
		throw new Exception("insert에서 예외발생!");
	}
} else if (action.equals("update")) { // 정보 변경
	if (bvo.getWriter().equals("admin")) {
		throw new Exception("admin의 게시글을 변경할 수 없습니다!");
	} else if (bdao.update(bvo)) {
		response.sendRedirect("controller.jsp?action=main");
	} else {
		throw new Exception("update에서 예외발생!");
	}
} else if (action.equals("delete")) { // 삭제
	if (bdao.delete(bvo)) {
		response.sendRedirect("controller.jsp?action=main");
	} else {
		throw new Exception("delete에서 예외발생!");
	}
} else { // 에러페이지
	out.println("<SCRIPT>alert('잘못된 요청입니다!');history.go(-1);</SCRIPT>");
}
%>