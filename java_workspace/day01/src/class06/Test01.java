package class06;

public class Test01 {

	public static void main(String[] args) {

		int proA = 1000;
		int proB = 1500;
		int cntA = 2;
		int cntB = 3;
		int sum = proA * cntA + proB * cntB;
		
		// A는 2개, B는 3개 주문했습니다.
		// 총 금액은 ???원입니다.
		System.out.println("A는 " + cntA + "개, B는 " + cntB + "개 주문했습니다.");
		System.out.println("총 금액은 " + sum + "원입니다.");
		
	}
}