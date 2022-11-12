package class03;

public class Test01 {

	public static void main(String[] args) {
		
		int a = 10, b = 2, c = -30;
		
		// 스도코딩
		/*
		if (a < b && a < c) {
			System.out.println("a: " + a);
		}
		if (b < a && b < c) {
			System.out.println("b: " + b);
		}
		if (c < a && c < b) {
			System.out.println("c: " + c);
		}
		*/
		
		// a > b -> T  : b > c
		// a > b -> F  : a > c
		if (a > b) {
			if (b > c) {
				System.out.println("c: " + c);
			} else {
				System.out.println("b: " + b);
			}
		} else {
			if (a > c) {
				System.out.println("c: " + c);
			} else {
				System.out.println("a: " + a);
			}
		}
		
		
		
		
		
		
		
	}

}
