package class08;

import java.util.Scanner;

public class Test02 {
	
	// 선 구현, 후 활용
	public static boolean checkAge(int age) {
		if (age <= 0 || age >= 200) {
			System.out.println("올바른 나이값이 아닙니다.");
			return false;
		}
		return true;
	}
	
	// 선 활용, 후 구현
	public static int checkPrice(int age) {
		// 복습할 때 switch로도 한 번 해 보자
		int price = 0;
		if (age > 8 && age < 20) {
			price = 1000;
		} else if (age > 19 && age < 66) {
			price = 2000;
		}
		return price;
	}

	public static void main(String[] args) {
		
		// 나이를 입력하면
		// 요금 출력
		// 8살 이하 0원, 9~19살 1000원, 20~65살 2000원, 66 이상 0원

		Scanner sc = new Scanner(System.in);
		int age = 0;
		int price = 0;
		
		while (true) {
			System.out.print("나이 입력: ");
			age = sc.nextInt();
			
			if (checkAge(age)) {
				break;
			}
		}
		
		price = checkPrice(age);
		System.out.println("나이: " + age + "살");
		System.out.println("요금: " + price + "원");
		
	}

}
