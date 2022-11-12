package class05;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		점수1: 0~100
//		점수2:
//		잘못 입력하면 다시
//
//		총점 : , 평균 0.0
//
//		80이상 A
//		60이상 B
//		60미만 C > 다시
		
		int scr1, scr2;
		
		while (true) {
			// 점수 입력
			System.out.println("0~100 중 점수를 입력해주세요");
			while (true) {	// 범위 내 유효성 검사
				System.out.print("점수1 : ");
				scr1 = sc.nextInt();
				if (scr1 >= 0 && scr1 <= 100) {	// 종료조건
					break;
				}
				System.out.println("제대로 입력해주세요");
			}
			while (true) {
				System.out.print("점수2 : ");
				scr2 = sc.nextInt();
				if (scr2 >= 0 && scr2 <= 100 ) { // 종료조건
					break;
				}
				System.out.println("제대로 입력해주세요");
			}
			
			// 총점, 평균 계산
			int total = scr1 + scr2;
			double avg = total * 1.0 / 2;
			
			System.out.println("=========시험=========");
			System.out.println("점수1 : " + scr1 + ", 점수2 : " + scr2);
			System.out.println("총점 : " + total + "점, 평균 : " + avg + "점");
			
			// 학점 부여
			char grade = 'C';
			
			if (avg >= 80.0) {	// avg가 double 타입이니 비교대상과 자료형을 맞춰준다.
				grade = 'A';
			} else if (avg >= 60.0) {
				grade = 'B';
			}
			System.out.println("당신의 학점은 " + grade + "입니다.");
			
			// 종료 조건
			if (grade == 'A' || grade == 'B') {	// grade != 'C'로 하는 게 저 간결하다
				System.out.println("통과!");
				break;
			}
			System.out.println("재시험을 보세요!");
		}
		
	}

}
