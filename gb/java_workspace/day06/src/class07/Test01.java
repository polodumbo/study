package class07;

public class Test01 {
	
	public static int func03() { // input X output O
		System.out.println("로그 1");
		return 100; // output을 반환하는 방법, output(리턴타입)은 return값과 일치해야 한다.
					// break, continue처럼 return을 만나는 순간 함수는 종료된다.
//		System.out.println("로그 2"); // unreachable code, dead code
	}
	
	public static double func04(int a, int b) { // input O output O
		double avg = (a + b) * 1.0 / 2;
		return avg;
	}

	public static void main(String[] args) { // input X output O
		// func03()
		System.out.println("main : " + func03());
		
		int num = func03();
		System.out.println("num = " + num);
		
		// func04()
		int a = 10, b = 11;
		System.out.println("main : " + func04(a, b));
		
		double avg = 0.0;
		
		avg = func04(a, b);
		System.out.println(avg);
	}

}
