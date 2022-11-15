package class05;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

//		예제 2) // 유효성 검사 X
//		학생수 입력: 2
//		학생1 점수 : 100
//		학생2 점수 : 20

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num = 0;
		int[] arScore = null;

		System.out.print("학생수 입력 : ");
		num = sc.nextInt();

		arScore = new int[num];

		for (int i = 0; i < arScore.length; i++) {
			arScore[i] = rand.nextInt(101); // 0~100
		}
		for (int i = 0; i < arScore.length; i++) {
			System.out.println("학생" + (i + 1) + " 성적 : " + arScore[i] + "점");
		}

	}

}
