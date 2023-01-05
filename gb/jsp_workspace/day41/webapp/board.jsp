<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="data" class="board.BoardVO" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세페이지</title>
</head>
<body>

	<script type="text/javascript">
		function del() {
			ans = confirm("정말 삭제할까요?");
			if (ans == true) {
				document.form.action.value = "delete";
				document.form.submit();
			} else {
				return;
			}
		}
	</script>

	<form action="controller.jsp" method="post" name="form">
		<input type="hidden" name="action" value="update">
		<input type="hidden" name="num" value="<%=data.getNum()%>">
		제목: <input type="text" name="title" value="<%=data.getTitle()%>" required> <br>
		내용: <input type="text" name="content" value="<%=data.getContent()%>" required> <br>
		작성자: <input type="text" name="writer" value="<%=data.getContent()%>" readonly required> <br>
		조회수: <input type="number" name="cnt" value="<%=data.getCnt()%>" readonly required>
		<%
		if (!data.getWriter().equals("admin")) {
			%>
			<br>
			<input type="submit" value="글 정보 변경">
			<input type="button" value="글 삭제" onClick="del()">
			<%
		}
		%>
	</form>
	<hr>
	<a href="controller.jsp?action=main">메인으로 돌아가기</a>

</body>
</html>