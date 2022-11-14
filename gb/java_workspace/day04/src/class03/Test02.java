package class03;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

//		예제2)
//		정수 : 100
//		2 3 5 7 11 ...
//		1~100 중 소수는 총 __개입니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int total = 0;

		for (int i = 1; i <= num; i++) { // 1~num
			int cnt = 0;
			// 소수 구하기
			for (int j = 1; j <= i; j++) { // 1~i
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
				total++; // 개수 카운팅
			}
		}
		System.out.println("\n1~100 중 소수는 총 " + total + "개입니다.");

	}

}
