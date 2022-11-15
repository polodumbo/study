package class07;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		
//		예제 심화)
//		1~10 랜덤으로 정수를 생성
//		5개 저장
//	
//		[1 1 2 2 1]
//		가장 작은 수는 1이며,
//		1, 2, 5번째에 저장되어 있습니다.

		
		Random rand = new Random();
		int[] arData = new int[5];
		
		for (int i = 0; i < arData.length; i++) {
			arData[i] = rand.nextInt(10) + 1; // 1~10
		}
		
		int min = arData[0];
		int minIndex = 0;
		
		System.out.print("[ ");
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i] + " ");
			if (min > arData.length) {
				min = arData[i];
				minIndex = i;
			}
		}
		System.out.print("]\n");
		
		System.out.print("가장 작은 수는 " + min + "이며, ");
		for (int i = 0; i < arData.length; i++) {
			if (arData[i] == min) {
				System.out.print(("[" + (i + 1) + "]"));
				
			}
		}
		System.out.print("번째에 저장되어 있습니다.");
		
	}

}
