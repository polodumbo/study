<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록 페이지</title>
</head>
<body>
	<h1>상품 목록</h1>
	<hr>
	<%
	// 파라미터의 이름값 불러와서 세션에 저장
	String name = request.getParameter("name");
	session.setAttribute("name", name);
	%>
	<%=session.getAttribute("name")%>님, 환영합니다! :D
	<br>
	<form action="f_shopping03.jsp" method="post">
		<select name="product">
			<option>목도리</option>
			<option>모자</option>
			<option>운동화</option>
			<option>장갑</option>
			<option>텀블러</option>
		</select>
		<input type="submit" value="장바구니에 추가">
	</form>
	<hr>
	<a href="f_shopping04.jsp">결제 페이지로 이동하기</a>
</body>
</html>