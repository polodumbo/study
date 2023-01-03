<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList,test.ProductVO" import="java.util.ArrayList,test.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<%
		MemberVO member = (MemberVO)session.getAttribute("member");
	%>

	<h1><%=member.getName() %>님, 안녕하세요! :D</h1>

	<%
	ArrayList<ProductVO> datas = new ArrayList<ProductVO>();
	datas.add(new ProductVO("아메리카노", 2500));
	datas.add(new ProductVO("카페라떼", 3000));
	datas.add(new ProductVO("프라푸치노", 6000));
	application.setAttribute("datas", datas);
	%>

	<form action="c_test04.jsp" method="post">
		<select name="product">
			<%
			for (ProductVO v : datas) {
				out.println("<option value='" + v.getName() + "'>" + v + "</option>");
			}
			%>
		</select> <input type="number" min="1" max="3" name="cnt" value="1"> <input
			type="submit" value="구매">
	</form>

</body>
</html>