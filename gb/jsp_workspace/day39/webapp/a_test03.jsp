<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList, test.ProductVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>

	<%
	ArrayList<ProductVO> datas = new ArrayList<ProductVO>();
	datas.add(new ProductVO("아메리카노", 2500));
	datas.add(new ProductVO("카페라떼", 3000));
	datas.add(new ProductVO("프라푸치노", 6000));
	application.setAttribute("datas", datas);
	%>

	<form action="a_test04.jsp" method="post">
		<select name="product">
			<%
			for (ProductVO v : datas) {
				out.println("<option value='" + v.getName() + "'>" + v + "</option>");
			}
			%>
		</select>
		<input type="number" min="1" max="3" name="cnt" value="1">
		<input type="submit" value="구매">
	</form>

</body>
</html>