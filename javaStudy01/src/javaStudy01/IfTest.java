package javaStudy01;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// 두 수를 입력 받아 대소 비교
		String n1Msg = "첫 번째 정수 : ", n2Msg = "두 번째 정수 : ";
		int num1 = 0, num2= 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(n1Msg);
		num1 = sc.nextInt();
		
		System.out.print(n2Msg);
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			result = "더 큰 값" + num1;
		} else if (num2 != num1) {	// num1 < num2이 아닌 이유 생긱
			result = "더 큰 값" + num2;
		} else {
			result = "두 수가 같습니다";
		}
		System.out.println(result);
	}
}
