package test;

public class B_Calc {
	private int res;

	public int getRes() {
		return res;
	}

	public B_Calc(int num1, int num2, String op) {
		if (op.equals("+")) {
			res = num1 + num2;
		} else if (op.equals("-")) {
			res = num1 - num2;
		} else if (op.equals("x")) {
			res = num1 * num2;
		} else {
			res = num1 / num2;
		}
	}
	public static void main(String[] args) {
		System.out.println();
	}
}
