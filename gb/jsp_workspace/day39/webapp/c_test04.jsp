<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList,test.ProductVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 페이지</title>
</head>
<body>

	<%
	request.setCharacterEncoding("UTF-8");

	String product = request.getParameter("product");
	int cnt = Integer.parseInt(request.getParameter("cnt"));

	int price = 0;
	ArrayList<ProductVO> datas = (ArrayList)application.getAttribute("datas");
	for (ProductVO v : datas) {
		if (product.equals(v.getName())) {
			price = v.getPrice();
			break;
		}
	}
	int total = price * cnt;
	%>

	<%=product%>를 [<%=cnt%>]개 주문하셨습니다.
	<br>
	총 <%=total%>원입니다.

</body>
</html>