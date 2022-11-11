package class08;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int num = rand.nextInt(10);	// 0~9, 10개의 정수 중에서 무작위로 삽입
		System.out.println("num = " + num);

		System.out.println("===============================");
		
//		int d1 = rand.nextInt(6);	// 0~5
		int d1 = rand.nextInt(6) + 1;	// 1~6
		int d2 = rand.nextInt(6) + 1;
		System.out.println("[" + d1 + "][" + d2 + "]");
		
		if (d1 == d2) {
			System.out.println("더블!");
		}

		System.out.println("===============================");
		
		int s1 = rand.nextInt(101);	// 0~100
		int s2 = rand.nextInt(101);
		int s3 = rand.nextInt(101);
		System.out.println("1과목 : " + s1 + "점");
		System.out.println("2과목 : " + s2 + "점");
		System.out.println("3과목 : " + s3 + "점");
		
		int sum = s1 + s2 + s3;
		double avg = sum * 1.0 / 3;
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		
//		if (avg >= 60.0) {
//			System.out.println("P");
//		} else {
//			System.out.println("F...");
//		}
		
		if (avg >= 80.0) {
			System.out.println("A");
		} else if (avg >= 60.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
			
		
	}
}
