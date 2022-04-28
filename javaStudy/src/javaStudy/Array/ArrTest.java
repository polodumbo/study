package javaStudy.Array;

public class ArrTest {
	public static void main(String[] args) {
		// 3행 4열의 2차원 배열
		int[][] arrData = {
				{3, 4, 5, 6},
				{8, 9, 0, 9},
				{1, 2, 3, 4}
		};
		int length = arrData.length * arrData[0].length;
		
		// 1부터 12까지 각 방에 순서대로 대입한다.
		// 2중 for문을 사용해서 해결한다.
//		for (int i = 0; i < arrData.length; i++) {
//			for (int j = 0; j < arrData[i].length; j++) {
//				arrData[i][j] = i * 4 + (j + 1);
//			}
//		}
		int count = 0;
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[0].length; j++) {
				arrData[i][j] = ++count;
				//%02d : 두 자리수로 간격을 맞춰주고, 두 자리수가 아니라면 앞에 0을 붙여준다.
				System.out.printf("%02d ", arrData[i][j]);
			}
			System.out.println("");
		}
		
//		System.out.println(arrData);
//		System.out.println(arrData[0]);
//		System.out.println(arrData[0][0]);

//		System.out.println(arrData.length);	// 행의 길이
//		System.out.println(arrData[0].length);	// 열의 길이
//		System.out.println(length);	// 전체 길이
		
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.print(arrData[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < length; i++) {
//			{3, 4, 5, 6} 0123
//			{8, 9, 0, 9} 4567
//			{1, 2, 3, 4} 891011
			// 0000 1234
			// 1111 1234
			// 2222 1234
			System.out.print(arrData[i / 4][i % 4] + " ");
			if ((i + 1) % 4 == 0) {System.out.println("");}
		}
		
	}
}
