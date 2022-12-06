package class06.view;

import java.util.Scanner;

public class StudentView {
	public int action;

	public void startView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생부 프로그램입니다.");
		System.out.println("1. 이름출력");
		System.out.println("2. 성적변경");
		System.out.println("3. 종료하기");
		System.out.print(">>> ");
		action = sc.nextInt();
	}

	public void func1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번의 성적을 변경할까요?");
		System.out.print(">>> ");
		action = sc.nextInt();
	}

	public void func2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 성적을 입력하세요.");
		System.out.print(">>> ");
		action = sc.nextInt();
	}
}