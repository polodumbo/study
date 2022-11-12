package class03;

public class Test03 {

	public static void main(String[] args) {
		
		// 세 정수를 비교하여 가장 작은 수 출력
		int a = 10, b = 2, c = -30;
		
		// 안 좋은 예
		if(a < b && a < c) {
			System.out.println("a: " + a);
		} if (b < a && b < c) {
			System.out.println("b: " + b);
		} if (c < a && c < b) {
			System.out.println("c: " + c);
		}
		
		// 좋은 예
		if (a < b && a < c) {
			System.out.println("a: " + a);
		} else if (b < a && b < c) {
			System.out.println("b: " + b);
		} else {
			System.out.println("c: " + c);
		}
		
	}

}
