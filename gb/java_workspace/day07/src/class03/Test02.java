package class03;

public class Test02 {
	
// 1234 > 4 3 2 1
	public static void printNumDESC(int num) {
		System.out.print(num % 10 + " "); // 일의 자리
		
		if (num / 10 != 0) { // 종료조건
			printNumDESC(num / 10); // 나머지 자리
		}
	}
// 1234 > 1 2 3 4
	public static void printNumASC(int num) {
		if (num / 10 != 0) { // 종료조건
			printNumASC(num / 10); // 나머지 자리
		}

		System.out.print(num % 10 + " "); // 일의 자리
		
	}

	public static void main(String[] args) {
		printNumDESC(1234); // 4 3 2 1
		System.out.println();
		printNumASC(1234); // 1 2 3 4
	}

}
