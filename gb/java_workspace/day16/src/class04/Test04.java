package class04;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			int num1 = 0, num2 = 0;
			
			// 정수1에 정수 외의 타입 입력 시
			try {
				System.out.print("정수 1) ");
				num1 = sc.nextInt();
			} catch (Exception e) {
//				System.out.println("제대로 입력하세요 ^^");
				sc.nextLine();
				continue;
			}
			// 정수2에 정수 외의 타입 입력 시
			try {
				System.out.print("정수 2) ");
				num2 = sc.nextInt();
			} catch (Exception e) {
//				System.out.println("제대로 입력하세요 ^^");
				sc.nextLine();
				continue;
			}
			// 정수2가 0이라면
//			if (num2 == 0) {
//				num2 = 1;
//				System.out.println("[정수2] 0 -> 1 변경");
//			}
			try {
				System.out.println(num1 / num2);
			} catch (Exception e) {
				System.out.println(num1);
			}
		}
	}
}
