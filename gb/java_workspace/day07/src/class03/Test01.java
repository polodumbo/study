package class03;

public class Test01 {
	// 팩토리얼
	public static int fac(int N) {
		// "종료조건"이 필수적으로 필요함!!
		if (N <= 1) { // 재귀호출을 종료하는 조건
			return 1;
		}
		return N * fac(N-1);
	}
	
	public static void func() {
		System.out.println("안녕하세요.");
//		func();
	}

	public static void main(String[] args) {
		func();
		System.out.println(fac(5));
	}

}
