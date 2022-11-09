package class05;

public class Test02 {

	public static void main(String[] args) {
		
		// 연산자(산술, 대입, 복합대입, 비교, 논리, 조건, ...)

		// ★우선순위★
		// 대입 연산자는 연산자 우선순위가 낮다!
		
		// 산술 연산자
		int a = 10 / 3;	// 나누기 INT
		int b = 10 % 3;	// 나머지 MOD
		System.out.println(a);
		System.out.println(b);
		
		int total = 0;
		int price1 = 100;
		int price2 = 1000;
		int price3 = 3100;

		total = total + price1;
//		total += price1; 위와 같다
		total += price2;
		total = total + price3;
		
		System.out.println("총 금액: " + total + "원입니다.");
	}

}
