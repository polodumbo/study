package class01;

import java.util.Random;
import java.util.Scanner;

// [클래스 복습]
abstract class A {
	// 멤버변수는 접근제어자를 private으로 지정하는 습관 
	private int a; // 멤버변수, 속성(attribute), 필드(field)
	private int b;

	// getter, setter
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	abstract void funcA(); // 추상 메서드 : 오버라이딩을 강제하고 싶을 때 > abstract

//	A() {
//		this(0, 0); // 생성자 오버로딩
//	}

	A(int a, int b) { // 생성자 : 멤버변수를 초기화하는 데 그 목적이 있다
		this.a = a;
		this.b = b;
	}
}

class B extends A {


	@Override
	void funcA() {
		System.out.println("B클래스에서 정의한 funcA()");
	}

	// 자식 클래스는 부모의 기본상속자를 상속 받아야 하나 부모의 기본 생성자가 없을 때는 상속 받은 생성자를 작성해줘야 한다.
	B() {
		super(0, 0);
	}
}

public class Test01 {
	public static void main(String[] args) {
		System.out.println("오버로딩");
		// 메서드 시그니처가 다르기 때문에
		// 같은 함수명 선언을 허용했구나!

		Scanner sc = new Scanner(System.in);

		// 클래스 객체명 = new생성자();
		// 객체화(인스턴스화)

		Random rand = new Random();
		
		A[] datas = new A[2];
		datas[0] = new B();
		datas[1] = new B();
//		datas[0] = new A(1, 1); // error, 추상 클래스는 객체화가 불가능
		for (A v : datas) {
			v.funcA();
			// 동적 바인딩 : 실제 객체의 오버라이딩된 메서드로 자동 호출되는 현상
			// => 다형성이 실현됨
		}
	}
}
