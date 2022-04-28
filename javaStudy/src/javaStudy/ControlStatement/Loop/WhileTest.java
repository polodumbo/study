package javaStudy.ControlStatement.Loop;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		// 이름 10번 출력
		int index = 0;
		
		while (index != 10) {
			System.out.println(index + ".이성훈");
			index++;
		}
		
		// 무조건 한 번 실행해야 될 때 do~while문
		String msg = "1. 통신요금 조회\n2. 번호 이동\n3. 분실 신고\n0. 상담원 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println(msg);
			choice = sc.nextInt();
		} while (choice == 0);
	}
}
