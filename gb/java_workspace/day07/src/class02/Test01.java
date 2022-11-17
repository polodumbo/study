package class02;

public class Test01 {
	public static double func04(int a, int b) {
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
		return sum / 2.0;
	}

	public static void main(String[] args) {
		System.out.println(func04(10, 11));
		
		double res = func04(11, 12);
		System.out.println("res = " + res);

	}

}
