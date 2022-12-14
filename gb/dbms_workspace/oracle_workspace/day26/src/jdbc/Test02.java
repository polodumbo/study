package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Test02 {
	public static void main(String[] args) {
		
		final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(DRIVERNAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		final String USER = "sh1208";
		final String PW = "1234";
		Connection conn = null;
		Statement stmt = null;
		ArrayList<MemberVO> members = new ArrayList<MemberVO>();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PW);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBER");
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt("NUM"));
				vo.setName(rs.getString("NAME"));
				vo.setAge(rs.getInt("AGE"));
				members.add(vo);
			}
			System.out.println("\t로그: 멤버 데이터 추가 완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		for (MemberVO v : members) {
			System.out.println(v);
		}
		
		
	}
}
