package class08;

public class Test01 {

	public static int f1(int num1, int num2) {
		if (++num1 > 10 || ++num2 > 10) {
			return num2;
		} else {
			return num1;
		}
	}

	public static void main(String[] args) {

		int num1 = 10, num2 = 20;
		num1 = f1(num1, num2);
		if (++num1 == 11 && ++num2 == 21) {
			System.out.println("확인!");
		}
		System.out.println("num1 : " + num1);
		System.out.println("num1 : " + num2);
	}
	
	/*
	 * num1	num2	++num1 > 10		++num2 > 10		return
	 * ------------------------------------------------------
	 * 10	20		T(11 > 10)		T(21 > 10)		num2(21)
	 * 21
	 * 
	 * num1 = 21, num2 = 20		
	*/
	
}
