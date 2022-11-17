package class03;

public class Test03 {
	
//	main() {
//		showNum(10);
//	}
//
//	console : 10 9 8 7 6 5 4 3 2
	
	public static void showNum(int num) {
		// for문
//		for (int i = 0; i < num - 1; i++) {
//			System.out.print(num - i + " ");
//		}
		
		// 재귀함수
		System.out.print(num + " "); // 현재 숫자 출력
		if (num > 2) { // 2보다 크다면
			showNum(num - 1); // 1씩 차감하며 반복
		}
	}

	public static void main(String[] args) {
		showNum(10);
	}
	
	/*
	 * num	num >= 2	num - 1
	 * ----------------------------
	 * 3	T			2		3
	 * 2	T			1		2
	 * 1	F			종료
	*/

}
