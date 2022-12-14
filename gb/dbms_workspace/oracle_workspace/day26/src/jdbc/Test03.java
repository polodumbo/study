package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
			
			// 1. 현재 전체목록 출력
			System.out.println("1. 현재 전체목록 출력");
			ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBER");
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNum(rs.getInt("NUM"));
				vo.setName(rs.getString("NAME"));
				vo.setAge(rs.getInt("AGE"));
				members.add(vo);
			}
			for (MemberVO v : members) {
				System.out.println(v);
			}
			System.out.println();
			
			// 2. 101번의 나이를 32세로 변경
			System.out.println("2. 101번의 나이를 32세로 변경");
			stmt.executeQuery("UPDATE MEMBER SET AGE = 32 WHERE NUM = 101");
			
			// 3. 102번 데이터는 삭제
			System.out.println("3. 102번 데이터는 삭제");
			stmt.executeQuery("DELETE FROM MEMBER WHERE NUM = 102");
			
			// 4. 이름과 나이를 입력한대로 113번 데이터를 추가
			System.out.println("4. 이름과 나이를 입력한대로 113번 데이터를 추가");
			System.out.print("이름 입력) ");
			String name = sc.next();
			System.out.print("나이 입력) ");
			int age = sc.nextInt();
			stmt.executeQuery("INSERT INTO MEMBER VALUES(113,'" + name + "'," + age + ")");
			
			stmt.executeQuery("INSERT INTO MEMBER VALUES((SELECT NVL(MAX(NUM),0)+1 FROM MEMBER),'" + name + "'," + age + ")");
			
			// 5. PK를 입력하면, 해당 PK를 가진 사람의 데이터를 출력
			System.out.println("5. PK를 입력하면, 해당 PK를 가진 사람의 데이터를 출력");
			System.out.print("검색할 번호 입력) ");
			int num = sc.nextInt();
			ResultSet rs2 = stmt.executeQuery("SELECT * FROM MEMBER WHERE NUM = " + num);
			members.clear();
			while (rs2.next()) {
				MemberVO vo = new MemberVO();
				vo.setNum(rs2.getInt("NUM"));
				vo.setName(rs2.getString("NAME"));
				vo.setAge(rs2.getInt("AGE"));
				members.add(vo);
			}
			for (MemberVO v : members) {
				System.out.println(v);
			}
			
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
		
		
		
	}
}
