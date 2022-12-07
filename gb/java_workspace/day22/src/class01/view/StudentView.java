package class01.view;

import java.util.Scanner;

public class StudentView {
	private Scanner sc;
//	public int action; // 일반변수 / private / public
	private int action;
	
	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public StudentView() {
		sc = new Scanner(System.in);
	}
	
	// action : 지역변수
//	public int printMenu() {
//		System.out.println("===학생부 프로그램===");
//		System.out.println("1. 학생 추가");
//		System.out.println("2. 목록 출력");
//		System.out.println("3. 학생 정보 출력");
//		System.out.println("4. 학생 이름 변경");
//		System.out.println("5. 학생 성적 변경");
//		System.out.println("6. 학생 삭제");
//		System.out.println("7. 프로그램 종료");
//		System.out.println("----------------");
//		System.out.print("입력) ");
//		action은 멤버변수로 하거나 반환하거나
//		int action = sc.nextInt();
//		return action;
//	}
	
	// action : 멤버변수
	public void printMenu() {
		System.out.println("===학생부 프로그램===");
		System.out.println("1. 학생 추가");
		System.out.println("2. 목록 출력");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 학생 검색");
		System.out.println("5. 학생 이름 변경");
		System.out.println("6. 학생 성적 변경");
		System.out.println("7. 학생 삭제");
		System.out.println("8. 프로그램 종료");
		System.out.println("----------------");
		System.out.print("입력) ");
		// action은 멤버변수로 하거나 반환하거나
//		action = sc.nextInt();
		this.action = sc.nextInt(); // action은 멤버변수로 하거나 뱉어주거나
	}
	
	public void printSearchMenu() {
		System.out.println("===학생 검색===");
		System.out.println("1. 이름으로 검색");
		System.out.println("2. 성적으로 검색");
		System.out.println("----------------");
		System.out.print("입력) ");
		this.action = sc.nextInt(); // action은 멤버변수로 하거나 뱉어주거나
	}
	
	public void printData(Object obj) {
		if (obj == null) {
			System.out.println("없습니다.");
			return;
		}
		System.out.println("===결과 화면===");
		System.out.println(obj);
	}
	
	public String getString() {
		System.out.print("문자열 입력) ");
		String str = sc.next();
		return str;
	}
	
	public String getName() {
		System.out.print("이름 입력) ");
		String str = sc.next();
		return str;
	}
	
	public int getScore() {
		System.out.print("성적 입력) ");
		int num = sc.nextInt();
		return num;
	}
	
	public int getAge() {
		System.out.print("나이 입력) ");
		int num = sc.nextInt();
		return num;
	}
	
	public int getNum() {
		System.out.print("번호 입력) ");
		int num = sc.nextInt();
		return num;
	}
	
	public void printSuccess() {
		System.out.println("성공");
	}
	
	public void printFailure() {
		System.out.println("실패");
	}
	
}
