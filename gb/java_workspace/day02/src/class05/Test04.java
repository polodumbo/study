package class05;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		// 이렇게 작성하면 6의 배수라는 조건식은 빛을 볼 수 없다.
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else if (num % 6 == 0) {
			System.out.println("6의 배수");
		} else {
			System.out.println("홀수");
		}

		// '적용 범위' 생각해서 배치할 것!
		if (num % 6 == 0) {
			System.out.println("6의 배수");
		} else if (num % 2 == 0) {
			System.out.println("짝수");
		} if (num % 6 == 0) {
			System.out.println("6의 배수");
		} else {
			System.out.println("홀수");
		}
		
	}

}
