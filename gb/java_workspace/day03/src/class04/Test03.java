package class04;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		// ===메뉴===
		// 1. 커피 2. 아이스트 3. 라떼 0. 종료
		// 1~3 > 메뉴 출력
		// 0 > 종료

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===메뉴===");
			System.out.println("1. 커피 / 2. 아이스트 / 3. 라떼 / 0. 종료");
			System.out.print("입력 : ");
			int num = sc.nextInt();

			if (num == 0) {	// 종료 조건
				break;
			} else if (num >= 1 && num <= 3) {
				System.out.println("메뉴 출력");
			} else {	// 잘못 입력했다면 == 유효성 검사
				System.out.println("없는 메뉴입니다!");
			}
		}

	}

}
