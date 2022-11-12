package task;

import java.util.Scanner;

// 최대공약수 역방향
public class Task02_t2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		while (true) {
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
		
		if (num1 > num2) { // 교환 로직
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		int i = num1;
		int gcm = 0, lcm = 0;
		while (i >= 1) { // 둘 중 작은 정수에서 -1씩 검색
			if (num1 % i == 0 && num2 % i == 0) { // i가 공약수라면
				gcm = i;
				break;	// 즉시 종류
			}
			i--;
		}
		lcm = num1 * num2 / gcm;
		System.out.println(num1 + "(과)와 " + num2 + "의 최대공약수는 " + gcm + "(이)고, 최소공배수는 " + lcm + "입니다.");
	}

}
