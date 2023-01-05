<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="data" class="board.BoardVO" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>

<form action="controller.jsp" method="post">
<input type="hidden" name="action" value="insert">
제목: <input type="text" name="title" required> <br>
내용: <input type="text" name="content" required> <br>
작성자: <input type="text" name="writer" required> <br>
<input type="submit" value="게시글 등록">
</form>
<hr>
<a href="controller.jsp?action=main">메인으로 돌아가기</a>

</body>
</html>