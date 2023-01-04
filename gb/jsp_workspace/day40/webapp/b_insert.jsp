<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="data" class="member.MemberVO" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="b_controller.jsp" method="post">
<input type="hidden" name="action" value="insert"> <!-- ?action=insert -->
아이디: <input type="text" name="id" required> <br>
비밀번호: <input type="password" name="pw" required> <br>
이름: <input type="text" name="name" required> <br>
<input type="submit" value="멤버등록">
</form>
<hr>
<a href="b_controller.jsp?action=main">메인으로 돌아가기</a>

</body>
</html>