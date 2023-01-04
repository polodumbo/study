<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>

	<%
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/leedb";
	String username = "root";
	String passwd = "1234";

	Connection conn = null;
	PreparedStatement pstmt = null;

	String sql_INSERT = "INSERT INTO TEST VALUES(?,?)";
	String sql_SELECTALL = "SELECT * FROM TEST";

	try {
		Class.forName(driverName);

		conn = DriverManager.getConnection(url, username, passwd);

		pstmt = conn.prepareStatement(sql_INSERT);
		pstmt.setString(1, request.getParameter("name"));
		pstmt.setString(2, request.getParameter("phone"));
		if (request.getMethod().equals("POST")) {
			pstmt.executeUpdate();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>

	<form method="post">
		이름: <input type="text" name="name"> <br>
		전화번호: <input type="text" name="phone"> <br>
		<input type="submit" value="DB에 데이터 추가">
	</form>

	<hr>

	<%
	pstmt = conn.prepareStatement(sql_SELECTALL);
	ResultSet rs = pstmt.executeQuery();
	while (rs.next()) {
		out.println(rs.getString("NAME") + " | " + rs.getString("PHONE") + " <BR>");
	}

	try {
		rs.close();
		pstmt.close();
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>

</body>
</html>