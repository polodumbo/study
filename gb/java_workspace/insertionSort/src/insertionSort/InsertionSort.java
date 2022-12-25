package insertionSort;

import java.util.Random;
import java.util.Scanner;

// [삽입 정렬]
public class InsertionSort {

	public static void main(String[] args) {
		
		// [3 1 5 4 2]
		// [(3) 1 5 4 2] 초기 상태
		// [(1 3) 5 4 2] [1]인 1
		// [(1 3 5) 4 2] [2]인 5
		// [(1 3 4 5) 2] [3]인 4
		// [(1 2 3 4 5)] [4]인 2
		// [(1 2 3 4 5)] 최종 상태
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int length = 0; // 입력 받을 배열의 길이
		int[] arData = null;

		System.out.println("1~100 삽입 정렬");
		System.out.print("배열 크기(정수 입력) : ");
		length = sc.nextInt();

		arData = new int[length]; // 배열 생성

		for (int i = 0; i < arData.length; i++) {
			arData[i] = rand.nextInt(100) + 1;
		}

		// 정렬 전 출력
		System.out.print("[ ");
		for (int v : arData) {
			System.out.print(v + " ");
		}
		System.out.print("]");
		System.out.println();

		int tmp = 0;

		// 첫 번째 수는 그냥 제일 작다고 생각
		for (int i = 1; i < arData.length; i++) { // 두 번째 인덱스부터 시작
			int j = i;
			tmp = arData[i]; // 현재 차례인 정수 임시 저장
			while (j > 0 && arData[j - 1] > tmp) { // 삽입할(정렬대상보다 작은 정수~큰 정수가 들은 인덱스의) 위치 탐색 >
				// 크다면 한 칸씩 밀기
				arData[j] = arData[j - 1];
				j--;
			}
			// [작은 수 < 정렬대상 < 큰 수] 삽입
			arData[j] = tmp;
			// 회전 끝날 때마다 출력
			System.out.print("[ ");
			for (int v : arData) {
				System.out.print(v + " ");
			}
			System.out.print("] > " + i + "회전 정렬\n");
		}

		// 정렬 후 출력
		System.out.print("[ ");
		for (int v : arData) {
			System.out.print(v + " ");
		}
		System.out.print("]");

		sc.close();
		
		/*
		 * [3 1 5 4 2]
		 * 
		 * [(3) 1 5 4 2]
		 * i	j	arData[i]	arData[i - 1]		while
		 * 			arData[j]	arData[j - 1]
		 * -----------------------------------------------
		 * 1	1	1			3					T		> [(  3) 5 4 2] tmp = 1
		 * 		0	3			-					F		> [(1 3) 5 4 2]
		 * 
		 * 2	2	5			3					F		> [(1 3 5) 4 2] tmp = 5
		 * 
		 * 3	3	4			5					T		> [(1 3   5) 2] tmp = 4
		 * 		2	5			3					F		> [(1 3 4 5) 2]
		 * 
		 * 4	4	2			5					T		> [(1 3 4   5)] tmp = 2
		 * 		3	5			4					T		> [(1 3   4 5)]
		 * 		2	4			3					T		> [(1   3 4 5)]
		 * 		1	3			1					F		> [(1 2 3 4 5)]
		 */
		
	}

}
