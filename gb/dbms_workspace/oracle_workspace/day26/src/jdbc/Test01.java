package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 입력) ");
//		String name = sc.next();
//		System.out.print("나이 입력) ");
//		int age = sc.nextInt();
		
		// [JDBC]
		// 1. DBMS에 맞는 드라이버 데이터를 로드(적재)
		// 2. DB에 연결
		// 3. DB 사용: 데이터를 read, write
		// 4. DB와의 연결을 해제 ★★
		
		
		// 1. DBMS에 맞는 드라이버 데이터를 로드(적재)
		final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVERNAME);
			// 해당 드라이버가 존재하지 않을 때 ClassNotFoundException 발생 가능
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("드라이버 로드 완료");
		}
		
		// 2. DB에 연결
		final String URL = "jdbc:oracle:thin:@localhost:1521:XE"; // Database Connections > properties
		final String USER = "sh1208";
		final String PW = "1234";
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PW);
			// 3. DB 사용: 데이터를 read, write
			stmt = conn.createStatement();
//			stmt.executeQuery("INSERT INTO MEMBER VALUES(101, '홍길동', 23)");
//			stmt.executeQuery("INSERT INTO MEMBER VALUES((SELECT NVL(MAX(NUM), 0) + 1 FROM MEMBER), '홍길동', 23)");
//			stmt.executeQuery("INSERT INTO MEMBER VALUES((SELECT NVL(MAX(NUM), 0) + 1 FROM MEMBER), '임꺽정', 30)");
//			stmt.executeQuery("INSERT INTO MEMBER VALUES((SELECT NVL(MAX(NUM), 0) + 1 FROM MEMBER), " + age + ", 23");
//			stmt.executeQuery("INSERT INTO MEMBER VALUES((SELECT NVL(MAX(NUM),0)+1 FROM MEMBER),'" + name + "'," + age + ")");
			System.out.println("\t로그: INSERT 성공");
		} catch (SQLException e) {
			System.out.println("\t로그: INSERT 실패");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 무슨일이 있어도 연결을 해제 하겠다!
			// 4. DB와의 연결을 해제 ★★
			try {
				stmt.close();
				conn.close(); // Connection이 먼저 생성되었기 때문에 나중에 종료
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
