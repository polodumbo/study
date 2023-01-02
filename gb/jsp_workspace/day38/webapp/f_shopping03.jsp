<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 실제로 보이지는 않고 처리만 해주는 페이지 -->
<title>장바구니에 상품을 추가하는 행동을 처리하는 페이지</title>
</head>
<body>

	<%
	String product = request.getParameter("product");

	// 세션아 장바구니 주는데
	ArrayList<String> products = (ArrayList)session.getAttribute("products");
	// 없으면 새로 만들어서 줘
	if (products == null) {
		products = new ArrayList<String>();
		session.setAttribute("products", products);
	}

	// 장바구니에 저장
	products.add(product);
	%>

	<script type="text/javascript">
		alert('<%=product%>이(가) 추가되었습니다! :D');
		history.go(-1);
	</script>

	<%
	System.out.println("로그: " + products);
	%>

</body>
</html>