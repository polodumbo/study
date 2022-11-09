package class08;

public class Test01 {

	public static void main(String[] args) {
//		비트 연산자
		/*
		 * int a = 10; // 1010 int b = 11; // 1011
		 * 
		 * int c = a & b; // 비트 연산자 AND // & : 둘 다 참이어야 참
		 * 
		 * System.out.println(c);
		 * 
		 * int d = a | b; // 비트 연산자 OR // | : 둘 중 하나라도 참이라면 참
		 * 
		 * System.out.println(d);
		 */
		
		int a = 10;	// 1010
		int b = 3;	// 0011
		int c = a & b;
		int d = a | b;
		
		System.out.println(c);	// 0010 = 2
		System.out.println(d);	// 1011 = 11
		
//		시프트 연산자
		a = 10;	// 00001010
		a = a << 2;	// 00101000
		
		System.out.println(a);	// 40
		
		a = a >> 4;	// 00000010
		
		System.out.println(a);	// 2
	}

}
