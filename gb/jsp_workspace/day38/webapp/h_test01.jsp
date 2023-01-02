<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// forward 액션 방식으로 데이터 전송
	request.setCharacterEncoding("UTF-8");
%>

<jsp:forward page="h_end.jsp">
	<jsp:param value="21" name="age"/>
</jsp:forward>