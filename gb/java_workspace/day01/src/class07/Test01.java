package class07;

public class Test01 {

	public static void main(String[] args) {
		
		// 비교 연산자
		int a = 10;
		int b = 20;
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);	// ! NOT 부정
		
		int num1 = 10;
		int num2 = 20;
		// && : ~~하고, ~~이고, ~~면서 동시에, 그리고 -> AND
		System.out.println(num1 > 1 && num2 > 2);
		System.out.println(num1 < 1 && num2 > 2);
		// || : ~~이거나, ~~혹은, 또는 -> OR
		System.out.println(num1 > 1 || num2 > 2);
		System.out.println(num1 < 1 || num2 > 2);
		
		// ! : NOT
		boolean result = !(10 > 20);	// !(false) = true
		System.out.println(result);	// true
	}
}
