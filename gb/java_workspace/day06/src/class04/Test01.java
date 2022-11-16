package class04;

import java.util.Scanner;

// [검색 알고리즘]
// "이진 탐색"
public class Test01 {

	public static void main(String[] args) {
		
		int[] data = new int[10];
		for (int i = 0; i < data.length; i++) {
			data[i] = i + 1;
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 정수 입력: ");
		int num = sc.nextInt();
		
		// 비효율의 극치
//		for (int i = 0; i < data.length; i++) {
//			if (num == data[i]) {
//				System.out.println("i = " + i);
//				break;
//			}
//		}
		
		// 이진탐색
		int L = 0; // Low, Left, Start
		int H = data.length - 1; // High, Right, End
		int M = 0;
		
		while (true) {
			M = (L + H) / 2;
			System.out.println("L : " + L);
			System.out.println("H : " + H);
			System.out.println("M : " + M);
			System.out.println();
			if (num == data[M]) { // 찾으면
				System.out.println("index : " + M);
				break;
			} else if (num > data[M]) { // 입력한 숫자가 더 작은 경우
				L = M + 1;
			} else { // 입력한 숫자가 더 큰 경우
				H = M - 1;
			}
			
			if (L > H) { // cross(교차)
				System.out.println(num + "은 없습니다...");
				break;
			}
		}
		
		/*
		 * num	L	H	M
		 * --------------
		 * 4	0	9	4
		 * 			3	1
		 * 			2	2
		 * 			3	3
		*/
		
	}

}
