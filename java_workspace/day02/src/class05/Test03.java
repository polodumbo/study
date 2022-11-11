package class05;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
//		문제)
//		주사위 2개(1~6)
//	
//		주사위1 : 정수
//		주사위2 : 정수
//	
//		1~6이 아닌 정수를 입력했다면
//		"잘못 입력하셨습니다." 출력
//	
//		두 주사위가 동일할 경우 "더블!" 출력
//	
//		더블이 아닐 때 "합 A, 평균 B" 출력
		
		int dice1 = 0;
		int dice2 = 0;
		int sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주사위1 : ");
		dice1 = sc.nextInt();
		System.out.print("주사위2 : ");
		dice2 = sc.nextInt();

		sum += dice1;
		sum += dice2;
		avg = sum * 1.0 / 2;
		
		System.out.println();
		
		if (dice1 < 1 || dice1 > 6 || dice2 < 1 || dice2 > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			if (dice1 == dice2) {
				System.out.println(dice1 + " 더블!");
			} else {
				System.out.println("합 : " + sum + ", 평균 : " + avg);
			}
		}
		
	}

}
