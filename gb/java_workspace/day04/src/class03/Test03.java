package class03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

//		예제3)
//		정수 : 5
//		5 4 3 2 1 0

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		// 방법 1
		for (int i = 0; i <= num; i++) { // 0 1 2 ... n
			System.out.print((num - i) + " "); // 각 수를 num에서 빼면 num ... 3 2 1 0
		}
		System.out.println();
		
		// 방법 2
		for (int i = num; i >= 0; i--) { // n ... 2 1 0
			System.out.print(i + " ");
		}
	}

}
