package class01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력: ");
		String msg = sc.next();

		String msg1 = "안녕하세요!";
		String msg2 = "ㅠㅠ";
		if (msg.equals(msg1)) {
			System.out.println("반갑습니다~~");
		} else if (msg.equals(msg2)) {
			System.out.println("프로그램을 종료합니다...");
		} else {
			System.out.println("?");
		}

	}

}
