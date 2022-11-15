package class05;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

//		예제 1) // 유효성 검사 X
//		학생1 성적입력 : 100
//		학생2 성적입력 : 50
//		학생3 성적입력: 20
//		=> 총점 170점, 평균 __.__점입니다.

		Scanner sc = new Scanner(System.in);

		int[] arScore = new int[3];
		int sum = 0;
		double avg = 0.0;

		// for문
		for (int i = 0; i < arScore.length; i++) {
			System.out.print("학생" + (i + 1) + " 성적 입력 : ");
			arScore[i] = sc.nextInt();
		}
		
		// foreach문
		for (int i : arScore) {
			sum += i;
		}
		avg = sum * 1.0 / arScore.length;
		System.out.println("=> 총점 " + sum + "점, 평균 " + avg + "점입니다.");

	}

}
