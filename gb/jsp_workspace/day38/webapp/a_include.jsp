<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 페이지 지시어 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include 지시어</title>
</head>
<body>
	<div id="header">
		<%@ include file="a_header.jsp" %>
	</div>
	
	<div id="wrap">
		include 지시어는 다른 페이지들을 내 페이지에 포함시킬 때에 사용한다.
	</div>
	
	<div id="footer">
		<%@ include file="a_footer.jsp" %>
	</div>
</body>
</html>