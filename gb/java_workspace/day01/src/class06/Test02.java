package class06;

public class Test02 {

	public static void main(String[] args) {
		
		int cnt = 10;
		cnt = cnt + 1;
		cnt += 1;
		cnt++;	// 후위 증감연산자 : 다음 열부터 적용
		cnt--;
		++cnt;	// 전위 증감연산자 : 현재 열부터 적용
		--cnt;
		
		// 둘음 연산자 우선순위가 다름!!!
		System.out.println("=============================");
		
//		int a = 10;
//		int b = 20;
//		int c = ++a;	// 전위 증감연산자는 우선순위가 매우 높음!
//		int d = b++;	// 후위 증감연산자는 우선순위가 매우 낮음!
		
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//		System.out.println("c: " + c);
//		System.out.println("d: " + d);

		System.out.println("=============================");
		
		int a = 10;
		int b = ++a;
		int c = b++;
		
//		★★★디버깅표★★★
//				
//		a	b	c
//		-----------
//		10
//		11	11
//			12	11
		
		System.out.println("a: " + a);	// 11
		System.out.println("b: " + b);	// 12
		System.out.println("c: " + c);	// 11
		
		System.out.println("=============================");
		
		int num1 = 10;
		int num2 = num1++;
		int num3 = ++num1 - ++num2;
		int num4 = num1++ + ++num3;
		
//		★★★디버깅표★★★
//		
//		num1	num2	num3	num4
//		----------------------------
//		10
//		11		10
//		12		11		1
//		13				2		14
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);
		
	}

}
