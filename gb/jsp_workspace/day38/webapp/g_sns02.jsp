<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>

	<%
	// sns03에 갔다 온다면 sns03의 response.sendRedirect()로 인해 파라미터가 갱신된 상태이기 때문에
	// 세션에 name속성이 null일 때만 수행
	
	// name이 null이라면
	if (session.getAttribute("name") == null) {
		// String name에 sns01에서 담긴 파라미터에서 name 안에 담긴 문자열로 초기화
		String name = request.getParameter("name");
		// 방금 선언한 name을 세션에 저장
		session.setAttribute("name", name);
	}
	%>

	<form action="g_sns03.jsp" method="post">
		[<%=session.getAttribute("name")%>]님
		<input type="text" name="msg">
		<input type="submit" value="작성">
	</form>

	<br>
	<hr>
	<br>

	<ul>
		<%
		ArrayList<String> posts = (ArrayList)application.getAttribute("posts");
		if (posts != null) {
			for (String v : posts) {
				out.println("<LI>" + v + "</LI><BR>");
			}
		} else {
			out.println("아직 등록된 메세지가 없습니다!");
		}
		%>
	</ul>

</body>
</html>