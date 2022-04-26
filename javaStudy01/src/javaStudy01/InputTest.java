package javaStudy01;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		// 자동 임포트 단축키 : Ctrl + Shift + O
		// 변수명 한 번에 변경 : Alt + Shift + R
		
		// next() : 사용자가 입력한 문자열 값(공백 또는 줄바꿈은 다음 값으로 입력 받는다.)
		Scanner scan = new Scanner(System.in);
		String lastName = "";
		String firstName = "";
		
		System.out.print("이름 : ");
		lastName = scan.next();
		firstName = scan.next();
		System.out.println(lastName + firstName + "님 안녕하세요.");
		
		// nextLine() : 사용자가 입력한 문자열 값
		String name = "";
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.println(name + "님 환영합니다.");
		
		// nextInt() : 사용자가 입력한 정수값
		// 예제
		// 한 번에 두 개의 정수를 입력 받는다.
		// 입력 예) 1 2
		// 출력 예) 1 * 2 = 2
		String format = "%d * %d = %d";
		int num1 = 0, num2 = 0, result = 0;
		
		System.out.println("곱할 두 정수를 예시와 같이 입력하세요 : \n예) 13 24");
		num1 = scan.nextInt();	// nextInt() : 사용자가 입력한 정수값
		num2 = scan.nextInt();
		
		result = num1 * num2;
		
		System.out.printf(format, num1, num2, result);
	}
}
