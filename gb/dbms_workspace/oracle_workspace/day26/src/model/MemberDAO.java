package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
	public boolean insert(MemberVO mvo) {
		final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVERNAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("드라이버 로드 완료");
		}

		final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		final String USER = "sh1208";
		final String PW = "1234";
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PW);
			stmt = conn.createStatement();
			stmt.executeQuery("INSERT INTO MEMBER VALUES((SELECT NVL(MAX(NUM),0)+1 FROM MEMBER),'" + mvo.getName()
					+ "'," + mvo.getAge() + ")");
			System.out.println("\t로그: INSERT 성공");
		} catch (SQLException e) {
			System.out.println("\t로그: INSERT 실패");
			e.printStackTrace();
			return false;
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public boolean update(MemberVO mvo) {
		final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVERNAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("드라이버 로드 완료");
		}

		final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		final String USER = "sh1208";
		final String PW = "1234";
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PW);
			stmt = conn.createStatement();
			stmt.executeQuery("UPDATE MEMBER SET NUM =" + mvo.getNum() + ", AGE =" + mvo.getAge() + " WHERE NUM = "
					+ mvo.getNum());
			System.out.println("\t로그: UPDATE 성공");
		} catch (SQLException e) {
			System.out.println("\t로그: UPDATE 실패");
			e.printStackTrace();
			return false;
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;

	}

	public boolean delete(MemberVO mvo) {
		final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVERNAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("드라이버 로드 완료");
		}

		final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		final String USER = "sh1208";
		final String PW = "1234";
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PW);
			stmt = conn.createStatement();
			stmt.executeQuery("DELETE FROM MEMBER WHERE NUM = " + mvo.getNum());
			System.out.println("\t로그: DELETE 성공");
		} catch (SQLException e) {
			System.out.println("\t로그: DELETE 실패");
			e.printStackTrace();
			return false;
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

}
