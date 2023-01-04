<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="member.*,java.util.*"%>
<jsp:useBean id="datas" class="java.util.ArrayList" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>PW</th>
			<th>NAME</th>
		</tr>
		<%
		out.println(datas.getClass());
		out.println(datas.getClass().getName());
		for (MemberVO v : (ArrayList<MemberVO>)datas) {
		%>
		<tr>
			<td><a href="b_controller.jsp?action=mypage&id=<%=v.getId()%>"><%=v.getId()%></a></td>
			<td><%=v.getPw()%></td>
			<td><%=v.getName()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<hr>
	<a href="b_insert.jsp">새 멤버 등록하기</a>

</body>
</html>