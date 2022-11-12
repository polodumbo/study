package class01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간: ");
		int h = sc.nextInt();
		System.out.print("분: ");
		int m = sc.nextInt();

		if ((1 <= h && h <= 12) && (0 <= m && m < 60)) {
			System.out.print(h + "시 " + m + "분의 1시간 20분전 시간은 ");

			// 분 -20
			// 혹시 결과값이 0~59가 아니라면, +60
			m -= 20;
			if (m < 0) {
				m += 60;
				h--;
			}

			// 시 -1
			// 혹시 결과값이 1~12가 아니라면, +12
			h--;
			if (h < 1) {
				h += 12;
			}
			System.out.println(h + "시 " + m + "분입니다.");
		} else {
			System.out.println("올바른 입력이 아닙니다!");
		}
	}

}