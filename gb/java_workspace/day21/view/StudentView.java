package view;

import java.util.Scanner;

public class StudentView {
	private Scanner sc;
	public int action; // 일반변수 / private / public

	public StudentView() {
		sc = new Scanner(System.in);
	}

	public void printMenu() {
		System.out.println(" === 학생부 프로그램 ===");
		System.out.println("1. 학생추가");
		System.out.println("2. 목록출력");
		System.out.println("3. 학생정보출력");
		System.out.println("4. 학생이름변경");
		System.out.println("5. 학생성적변경");
		System.out.println("6. 학생삭제");
		System.out.println("7. 프로그램 종료");
		System.out.print(">>> ");
		this.action = sc.nextInt();
	}

	public void printData(Object obj) {
		System.out.println(" == 결과 화면 ==");
		System.out.println(obj);
	}

	public String getString() {
		System.out.print("문자열 입력 >> ");
		String str = sc.next();
		return str;
	}

	public int getInt() {
		System.out.print("정수 입력 >> ");
		int i = sc.nextInt();
		return i;
	}

}
