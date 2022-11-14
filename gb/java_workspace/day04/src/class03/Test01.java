package class03;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

//		예제1)
//		정수1 : 14
//		정수2 : 10
//		10 11 12 13 14
//		합: 60
//		평균: 12.0
//		합과 평균 구하기

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		int sum = 0;
		double avg = 0.0;

		// 교환 로직
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}

		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " "); // i(num1)~num2 출력
			sum += i; // 합계
		}
		System.out.println("");

		avg = sum * 1.0 / (num2 - num1 + 1); // 평균

		System.out.println("합: " + sum + "\n평균: " + avg + "\n");

	}

}
