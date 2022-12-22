package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// Util 클래스
//  : 객체 생성 xxx --->> "객체와 무관하게" == static
//  : 메서드(로직)를 제공하는 것이 목표!
public class JDBCUtil {
	static final String driverName = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String user = "sh1208";
	static final String passwd = "1234";

	public static Connection connect() {
		Connection conn = null;
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, passwd);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("   로그: connect() 수행완료");
		}
		return conn;
	}

	public static void disconnect(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("   로그: disconnect() 수행완료");
		}
	}

}
