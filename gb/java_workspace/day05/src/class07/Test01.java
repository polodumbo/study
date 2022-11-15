package class07;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 자료구조(배열)
		//    &
		// 알고리즘(교환, 최대값 찾기)

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num = 0;
		int[] arScore = null;
		int max = 0;
		int maxIndex = 0;

		System.out.print("학생수 입력 : ");
		num = sc.nextInt();

		arScore = new int[num];

		for (int i = 0; i < arScore.length; i++) {
			arScore[i] = rand.nextInt(101); // 0~100
		}
		for (int i = 0; i < arScore.length; i++) {
			System.out.println("학생" + (i + 1) + " 성적 : " + arScore[i] + "점");
		}
		
		// 최대값 찾기 알고리즘
		// 일단, [0]값을 max라고 단정짓기
		max = arScore[0];
		maxIndex = 0;
		// 그 다음, [1]~끝 돌면서 max가 정말인지 체크
		for (int i = 0; i < arScore.length; i++) {
			if (max < arScore[i]) {
			// 혹시 아니라면 max 교체
				max = arScore[i];
				maxIndex = i;
			}
		}
		System.out.println("max = " + max);
		System.out.println("maxIndex = " + maxIndex);

		/*
		 * [46 18 58 67 63]
		 * max	mI	i	m<d
		 * ----------------
		 * 46	0	1	F
		 * 			2	T
		 * 58	2	3	T
		 * 67	3	4	F
		 * 			5
		*/
		
	}

}
