package class04;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		// "출력" > "입력"
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);	// import 안 하면 이렇게 사용
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("로그 1");	// ★
		
		System.out.print("정수를 입력하세요: ");	// UI/UX > 사용자의 편의성을 충분히 고려해야 함 ★
		num = sc.nextInt();
		
		System.out.println("로그 2");
		
		if (num < 0) {
			System.out.println("음수");
		} else if (num == 0) {
			System.out.println("0");
		} else {
			System.out.println("양수");
		}
		
		System.out.println("로그 3");
		
	}

}
