package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUtil {
	/*
	 * 오라클 설정
	 * static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
	 * static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	 * static final String USER = "sh1208";
	 * static final String PASSWD = "1234";
	 */
	static final String DRIVERNAME = "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost/leedb";
	static final String USER = "root";
	static final String PASSWD = "1234";

	public static Connection connect() {
		Connection conn = null;
		try {
			Class.forName(DRIVERNAME);
			conn = DriverManager.getConnection(URL, USER, PASSWD);
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
