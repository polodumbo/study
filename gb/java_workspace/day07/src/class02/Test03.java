package class02;

public class Test03 {
	public static int f(int a, int b) {
		return 1;
	}
	public static int f(double a, double b) {
		return 2;
	}
	public static int f(int a, int b, int c) {
		return 3;
	}

	public static void main(String[] args) {
		System.out.println(f(1, 2, 3)); // 3
		System.out.println(f(9, 9.1)); // 2
		System.out.println(f(2,2)); // 1

	}

}
