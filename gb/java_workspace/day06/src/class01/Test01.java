package class01;

import java.util.Random;

// [버블정렬 로직]
public class Test01 {

	public static void main(String[] args) {

//		for (데이터 개수) { // "1회전 정렬"을 반복
//			for (데이터 개수 - 1) { // 앞뒤의 데이터를 비교, 
//				if (앞 데이터 > 뒤 데이터) {
//					둘을 "교환"
//				}
//			}
//		}
		
		Random rand = new Random();
		int[] arData = new int[5];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = rand.nextInt(100) + 1;
		}
		for (int i : arData) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arData.length; i++) { // "1회전 정렬"을 반복
			for (int j = 0; j < arData.length - 1; j++) { // 앞뒤의 데이터를 비교, 
				if (arData[j] > arData[j + 1]) {
					int tmp = arData[j];
					arData[j] = arData[j + 1];
					arData[j + 1] = tmp;
				}
			}
			System.out.println("\t" + (i + 1) + "회전 정렬 완료");
			for (int j : arData) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
