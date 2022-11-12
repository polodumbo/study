package class04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 사용자가 제대로 입력할 때까지 계속
		// ☆ 반복구간 설정
		
		Scanner sc = new Scanner(System.in);
		
		int m = 0;	// while문 사용 시 초기화할 값에 유의
		
		while (m < 1 || m > 12) {
			System.out.print("월 입력 : ");
			m = sc.nextInt();
		}
		System.out.println("입력한 월은 " + m + "월입니다.");
		
	}

}
