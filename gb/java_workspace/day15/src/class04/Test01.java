package class04;

abstract class A {
	// 객체화 xxx
	// 추상메서드: 오버라이딩 강제
	abstract void funcA();
}

class B extends A {
	@Override
	void funcA() {
		System.out.println("B 클래스");
	}
}

class C extends B {
	@Override
	void funcA() {
		System.out.println("C 클래스");
	}
}

public class Test01 {
	public static void main(String[] args) {

		A[] datas = new A[2];
		datas[0] = new B();
		datas[1] = new C();

		for (A v : datas) {
			v.funcA();
		}

	}
}