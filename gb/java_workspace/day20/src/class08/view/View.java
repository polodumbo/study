package class08.view;

import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);

	public int getInt() {
		System.out.print("정수 입력) ");
		int num = sc.nextInt();
		return num;
	}

	public String getString() {
		System.out.print("문자열 입력) ");
		String str = sc.next();
		return str;
	}

	public int printMenu() {
		System.out.println("학생부 프로그램입니다.");
		System.out.println("1. 학생 추가");
		System.out.println("2. 목록 출력");
		System.out.println("3. 학생 출력");
		System.out.println("4. 성적 변경");
		System.out.println("5. 학생 삭제");
		System.out.print("입력) ");
		int act = sc.nextInt();
		return act;
	}

	public void printInfo(Object obj) {
		// 받아올 데이터가 학생 전체인 ArrayList일지 학생 하나인 객체인지 알 수 없기 때문에
		// 최상위 클래스인 Object로 파라미터 설정
		System.out.println("===결과화면===");
		System.out.println(obj);
		System.out.println();
	}

}
