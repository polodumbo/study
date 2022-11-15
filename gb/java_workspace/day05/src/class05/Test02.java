package class05;

import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {
		
		// 배열 관리
		// 1) 특정 변수 사용
		// 2) 배멸명.length 사용
		
		int[] arData = new int[10];
		// new == 힙 메모리(개발자 영역)을 사용하겠다!
		
//		arData[0] = 10;
//		arData[1] = 20;
//		arData[2] = 30;
//		arData[3] = 40;
//		arData[4] = 50;
//		arData[i] = (i + 1) * 10;
		
		System.out.println(arData); // 주소값 출력
		
		for (int i = 0; i < arData.length; i++) { // 배열의 길이
			arData[i] = (i + 1) * 10; // 10, 20, 30, ...
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		System.out.println("-------");
		for (int i : arData) { // 10, 20, 30, ...
			System.out.println(i);
		}
		
		for (int i : arData) { // 11, 21, 31, ...
			i++;
			System.out.println(i);
		}
		
	}
	
}
