package class02;

// [Wrapper 클래스]
public class Test01 {
	public static void main(String[] args) {
		
		int num1 = 10;
		Integer num2 = new Integer(20); // 박싱(취소선) : 원시타입으로도 쓸 수 있는 것을 굳이 쓰는 것
		int num3 = num2.intValue(); // 언박싱
		
		Character ch1 = 'A'; // 오토 박싱
		char ch2 = ch1; // 오토 언박싱
		
		// 자료형을 변환하는 작업
		
		String str = "1234";
		int i = Integer.parseInt(str); // Integer.parseInt(str) : String > int
		System.out.println(i);
		
		str = String.valueOf(321); // String.valueOf(type) : type > String
		System.out.println(str);
	}
}
