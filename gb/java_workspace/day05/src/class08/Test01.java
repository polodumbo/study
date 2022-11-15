package class08;

import java.util.Random;

// [버블정렬]
public class Test01 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int[] arData = new int[5];
		for (int i = 0; i < arData.length; i++) {
			arData[i] = rand.nextInt(100) + 1;
		}
		
		// 데이터 개수만큼 반복 {
		//		[0][1] 비교
		//		만약, 뒤의 데이터가 더 커야 하는데 앞의 데이터가 더 크다면 "교환"
		//		[3][4]까지
		//		> 1회전 정렬
		// }
		for (int j : arData) {
			System.out.print(j + " ");
		}
		System.out.println("\n");
		
		for (int i = 0; i < arData.length; i++) {
			// 1회전 정렬
			for (int j = 0; j < arData.length - 1; j++) { // ㅁㅁㅁㅁㅁ : 4번
				if (arData[j] > arData[j + 1]) {
					int tmp = arData[j + 1];
					arData[j + 1] = arData[j];
					arData[j] = tmp;
				}
			}
			for (int j : arData) {
				System.out.print(j + " ");
			}
			System.out.print(i + 1 + "회전 정렬\n");
		}
		
		System.out.println();
		
		for (int i : arData) {
			System.out.print(i + " ");
		}
		
	}

}
