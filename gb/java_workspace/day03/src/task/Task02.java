package task;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

//		과제2)
//		정수 2개 입력
//	
//		a : 12	1 2 3 4 6   12		
//		b : 16	1 2   4   8    16	
//		12와 16의 최대공약수는 4이고, 최소공배수는 48입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		// 유효성 검사
		while (true) {	// 양의 정수 입력
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			if (num1 > 0) {
				break;
			}
			System.out.println("양의 정수만 입력해주세요.");
		}
		while (true) {
			System.out.print("정수2 : ");
			num2 = sc.nextInt();
			if (num2 > 0) {
				break;
			}
			System.out.println("양의 정수만 입력해주세요.");
		}
		
		// 최대공약수(GCM), 최소공배수(LCM) 구하기
		// 두 정수의 곱 = 최대공약수 * 최소공배수
		int i = 1;
		int j = 1;
		int gcm = 0, lcm = 0;
		
		while (i <= num1) {	// num1의 약수
			if (num1 % i == 0) {	// i == 약수
				j = 1;	// 밑의 반복문이 끝날 때마다 j 초기화
				while (j <= num2) {	// num2의 약수
					if (num2 % j == 0) {	// j == 약수
						// 제일 큰 공약수 삽입
						if (i == j) {
							gcm = i;
						}
					}
					j++;
				}
			}
			i++;
		}
		lcm = num1 * num2 / gcm;
		System.out.println(num1 + "(과)와 " + num2 + "의 최대공약수는 " + gcm + "(이)고, 최소공배수는 " + lcm + "입니다.");
		
	}

}
