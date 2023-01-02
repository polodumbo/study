<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Map" import="java.util.HashMap"%>
<%
request.setCharacterEncoding("UTF-8");

Map<String, Integer> map = new HashMap<String, Integer>();

map.put("아메리카노", 2500);
map.put("카푸치노", 3000);
map.put("프라푸치노", 6000);

String product = request.getParameter("product");
int number = Integer.parseInt(request.getParameter("number"));
int res = map.get(product) * number;
session.setAttribute("product", product);
session.setAttribute("number", number);
session.setAttribute("res", res);


response.sendRedirect("z_index.jsp");
%>