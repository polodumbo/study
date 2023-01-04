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
	<script type="text/javascript">
		function del() {
			ans = confirm("정말 삭제하시겠습니까?");
			if (ans == true) {
				// documnet의 .form의 action값을 delete로 설정
				document.form.action.value = "delete";
				// .from 째로 전송
				document.form.submit();
			} else {
				return;
			}
		}
	</script>

	<form action="b_controller.jsp" method="post" name="form">
		<%-- post는 get과 달리 url에 ?를 붙일 수 없기에 input태그 hidden에 action값을 넣어 전송 --%>
		<input type="hidden" name="action" value="update">
		아이디: <input type="text" name="id" value="<%=data.getId()%>" readonly> <br>
		비밀번호: <input type="password" name="pw" required> <br>
		이름: <input type="text" name="name" value="<%=data.getName()%>" readonly> <br>
		<input type="submit" value="멤버정보변경">
		<input type="button" value="멤버삭제" onClick="del()">
	</form>
	<hr>
	<a href="b_controller.jsp?action=main">메인으로 돌아가기</a>

</body>
</html>