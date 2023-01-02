<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제 페이지</title>
</head>
<body>

	<h1><%=session.getAttribute("name")%>님이 장바구니에 추가한 상품 목록
	</h1>
	<hr>
	<ol>
		<%
		ArrayList<String> products = (ArrayList)session.getAttribute("products");
		if (products == null) {
			out.println("장바구니에 담긴 상품이 없습니다.");
		} else {
			for (String v : products) {
				out.println("<LI>" + v + "</LI><BR>");
			}
		}
		%>
	</ol>
</body>
</html>