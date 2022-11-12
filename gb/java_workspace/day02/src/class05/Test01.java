package class05;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		// 정수 2개 입력
		// a 입력: ?
		// b 입력: ?
		// 10과 20 중 더 큰 수는 20입니다.
		// 두 수는 같습니다.
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int max = 0;
		
		System.out.print("정수 a 입력: ");
		a = sc.nextInt();
		System.out.print("정수 b 입력: ");
		b = sc.nextInt();
		
		if (a == b) {
			System.out.println(a + "와 " + b + "두 수는 같습니다.");
		} else {
			max = a > b ? a : b;
			System.out.println(a + "와 " + b + "중 더 큰수는 " + max + "입니다.");
		}
		
	}
}
