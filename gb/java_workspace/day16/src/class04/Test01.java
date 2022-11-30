package class04;

// [예외처리]
public class Test01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println("로그 A");
			System.out.println(a / b);
			System.out.println("로그 B");
		} catch (Exception e) {
			System.out.println("로그 C");
			e.printStackTrace();
		}
		// 실행 전에는 정수가 저장되어 있기 때문에 예외가 발생하지 않음
		// 실행 후에는 b에 0이 저장되어 나누기 불가능
		System.out.println("수행해야 하는 문장");
	}
}
