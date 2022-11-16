package class06;

// [메서드]
public class Test01 {
	
//	public static 리턴타입 메서드명(파라미터) { // 메서드 시그니처
//				  output   기능  intput
//	}
	
	// 함수를 "선언(정의)"했다.
	public static void hello() { // input X, output X
		int num = 10;
		num++;
		System.out.println("안녕하세요~~ " + num);
	}
	
	public static void func02(int a, int b) { // input O, output X
		a++;
		b++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	// 메인 메서드
	public static void main(String[] args) {
		// 함수를 "호출"하여 사용했다.
		hello();
		
		int a = 10, b = 20;
		func02(a, b); // 값에 의한 호출(call by value)
		System.out.println("main: a = " + a);
		System.out.println("main: b = " + b);
	}

}
