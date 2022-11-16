package class09;

import java.util.Random;

public class Test01 {

	// action(data); // 선 활용,후 정의
	public static void action(int[] arData) {
		// ☆ 참조에 의한 호출(call by reference)
		for (int i = 0; i < arData.length; i++) {
			if (arData[i] % 2 == 0) { // 짝수라면
				arData[i]++; // + 1
			}
		}
	}
	
	public static void sort(int[] arData) {
		for (int i = 0; i < arData.length; i++) {
			for (int j = 0; j < arData.length - 1; j++) {
				if (arData[j] > arData[j + 1]) {
					int tmp = arData[j + 1];
					arData[j + 1] = arData[j];
					arData[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arData = new int[5];
		Random rand = new Random();
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = rand.nextInt(100) + 1;
		}
		for (int i : arData) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		action(arData); // 선 활용, 후 정의
		// ★ 참조에 의한 호출
		
		sort(arData);
		
		for (int i : arData) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
