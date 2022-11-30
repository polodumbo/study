package class05;

// [예외처리 미루기]
public class Test01 {
	// throws : 사용자 측에서 예외처리를 해야만 사용할 수 있게 됨
	// => 예외처리를 강제하는 키워드
	public static void func(int a, int b) throws Exception {
		int num = a / b;
		System.out.println("num: " + num);
	}
	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		
		try {
			func(num1, num2); // throws로 예외처리를 강제하여 try~catch를 사용해야만 한다.
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}
}
