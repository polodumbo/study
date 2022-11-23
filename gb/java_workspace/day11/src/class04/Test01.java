package class04;

// [캐스팅]
class A {
	int aaa;

	void funcA1() {
		System.out.println("A1");
	}
	
	void funcA2() {
		System.out.println("A2");
	}
}

class B extends A {
	int bbb;
	
	@Override
	void funcA1() {
		System.out.println("A1 오버라이딩함");
	}

	void funcB() {
		System.out.println("B");
	}
}

public class Test01 {
	public static void main(String[] args) {

		int i = (int)3.14; // 3, 명시적 형변환
		double d = 3; // 3.0, 자동 형변환
		
		A a = new B(); // 업 캐스팅
//		B b = (B)new A(); // 다운 캐스팅
		
		a.funcA1();
		// 오버라이딩한 메서드가 자동 호출
		// 		동적바인딩 -> 다형성
		a.funcA2();
		
		B b = null;
		
		if (a instanceof A) {
			b = (B)a; // 다운 캐스팅
		}
		
		b.funcB();
	}
}
