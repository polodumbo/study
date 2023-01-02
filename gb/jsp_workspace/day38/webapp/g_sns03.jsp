<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%
request.setCharacterEncoding("UTF-8");

String msg = request.getParameter("msg");
String name = (String)session.getAttribute("name");
ArrayList<String> posts = (ArrayList)application.getAttribute("posts");
// 게시글 목록
if (posts == null) {
	posts = new ArrayList<String>();
	application.setAttribute("posts", posts);
}
posts.add("[" + name + "] [" + msg + "] [" + new Date() + "]");

response.sendRedirect("g_sns02.jsp");
%>