package class05;

import java.util.Iterator;

// 구구단
public class Test01 {

	public static void main(String[] args) {

//		System.out.println("2 x 1 = 2");
//		System.out.println("2 x 2 = 4");
//		System.out.println("2 x 3 = 6");
//		... 언제 치고 있냐
		
		System.out.println("구구단을 외자 구구단을 외자");
		for (int i = 2; i <= 9; i++) {
			// 8번 반복
//			System.out.println("----" + i + "단----");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
				// 8번 * 9번 > 총 72번 반복
			}
			// 8번 반복
		}
		
		/*
		 * i	i <= 9	j	j <= 9
		 * ------------------------
		 * 2	   T	1	   T
		 *  	   T	2	   T
		 *  	   T	3	   T
		 *  			.
		 *  			.
		 *  	   T	9	   T
		 *  	   T	10	   F > 9번 줄에서 12번으로 이동
		 * 3	   T	1	   T
		 *  	   T	2	   T
		 *  	   T	3	   T
		 *  			.
		 *  			.
		 * 9	   T    10	   F > 12번으로 이동 후 종료
		*/ 
		
	}

}
