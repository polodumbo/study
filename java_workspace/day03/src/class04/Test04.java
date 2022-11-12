package class04;

import java.util.Scanner;

// "변수 유효범위(scope)" ☆
public class Test04 {

	public static void main(String[] args) {

//		두 정수를 입력 받고 오름차순으로 출력
//		
//		정수1 : 10
//		정수2 : 14
//		10 11 12 13 14
//
//		정수1 : 4
//		정수2 : 1
//		1 2 3 4 출력
//
//		정수1 : 10
//		정수2 : 10
//		"다시 입력해주세요!" 출력

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;

		// 서로 다른 두 정수 입력 받기
		while (true) {
			System.out.print("정수1 : ");
			a = sc.nextInt();
			System.out.print("정수2 : ");
			b = sc.nextInt();

			if (a != b) {
				break;
			}
			System.out.println("다시 입력해주세요!");
		}
		
		// "교환" ★
		// "임시저장변수(tmp, temp)"
		if (a > b) {	// a가 b보다 크다면
			// a와 b를 교환해줘.
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		/*
		 * 대소비교 // 교환로직 배웠다! 
		 * int small = a < b ? a : b; 
		 * int big = a > b ? a : b;
		 */
				
		// 출력
		int i = a;
		while (i <= b) {
			System.out.print(i + " ");
			i++;
		}

	}

}
