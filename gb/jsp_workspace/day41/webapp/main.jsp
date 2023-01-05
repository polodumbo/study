<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="board.*,java.util.*"%>
<jsp:useBean id="datas" class="java.util.ArrayList" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
</head>
<body>

	<script type="text/javascript">
		function check(num) {
			passwd = prompt('비밀번호를 입력하세요.');
			document.location.href = "controller.jsp?action=board&num=" + num
					+ "&passwd=" + passwd;
			// URL : controller.jsp?action=board&num=ㅁㅁㅁ&passwd=ㅁㅁㅁ
		}
	</script>

	<%
	if (datas.isEmpty()) {
		out.println("<h1>등록된 게시글이 없습니다!</h1>");
	} else {
	%>
	
	<form method="get">
		<input type="hidden" name="action" value="main">
		<select name="searchCondition">
			<option selected>제목</option>
			<option>작성자</option>
		</select>
		<input type="text" name="searchContent" placeholder="검색어 입력" required>
		<input type="submit" value="검색">
	</form>
	
	<table border="1">
		<tr>
			<th>글 번호</th>
			<th>글 제목</th>
			<th>작성자</th>
			<th>조회수</th>
		</tr>
		<%
		for (BoardVO v : (ArrayList<BoardVO>)datas) {
		%>
		<tr>
			<td><a href="javascript:check(<%=v.getNum()%>)"><%=v.getNum()%></a></td>
			<td><%=v.getTitle()%></td>
			<td><%=v.getWriter()%></td>
			<td><%=v.getCnt()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	}
	%>
	<hr>
	<a href="controller.jsp?action=main&searchCondition=TOP">TOP 3 게시글 보기</a>
	<hr>
	<a href="insert.jsp">새 게시글 작성</a>

</body>
</html>