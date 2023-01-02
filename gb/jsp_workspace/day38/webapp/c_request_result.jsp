<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 페이지</title>
</head>
<body>

	<table border="1">
		<tr>
			<td>이름</td>
			<td>
				<%=request.getParameter("name")%>
				<%-- <input type="text" name="name"> --%>
			</td>
		</tr>
		<tr>
			<td>선택언어</td>
			<td>
				<%=request.getParameter("lang")%>
				<%--
				<select name="lang">
					<option selected>JAVA</option>
					<option>C언어</option>
					<option>파이썬</option>
				</select>
				--%>
			</td>
		</tr>
		<tr>
			<td>관심분야</td>
			<td>
				<%
				String[] favs = request.getParameterValues("fav");
				for (String v : favs) {
					out.println(v + "&nbsp;&nbsp;&nbsp;");
				}
				%>
				<%--
				<input type="checkbox" name="fav" value="웹">웹
				<input type="checkbox" name="fav" value="앱">앱
				<input type="checkbox" name="fav" value="빅데이터">빅데이터
				--%>
			</td>
		</tr>
	</table>

</body>
</html>