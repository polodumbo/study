<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<hr>
		
		<h1>상품 목록</h1>
		<hr>
		<br>
		<form action="z_pay.jsp" method="post">
			<select name="product">
				<option>아메리카노</option>
				<option>카푸치노</option>
				<option>프라푸치노</option>
			</select>
			<input type="number" name="number" placeholder="수량" min="1" max="3" required>
			<input type="submit" value="얼마지?">
		</form>
		<hr>

	<%
	if (session.getAttribute("id") == null) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if (!(id.equals("test")) || !(pw.equals("1234"))) {
			%>
			<script type="text/javascript">
				alert('회원정보가 일치하지 않습니다! 다시 시도해주세요');
				history.go(-1);
			</script>
			<%
		} else {
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			%>
			<%=session.getAttribute("id")%>님, 환영합니다! :D
			<%
		}
	} else {
		if (session.getAttribute("product") != null) {
		%>
		<%=session.getAttribute("product")%> <%=session.getAttribute("number")%>개의 가격은 <%=session.getAttribute("res")%>원입니다. 
		<%
		}
		
	}
	%>
	
</body>
</html>