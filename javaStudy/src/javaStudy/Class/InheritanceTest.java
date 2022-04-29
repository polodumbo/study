package javaStudy.Class;

class A {
	String nameA = "A";
	int data = 10;
	
	public A() {
		System.out.println("부모 생성자 호출");
	}
}

class B extends A {
	String nameB = "B";
	
	public B() {
//		super() : 부모필드의 주소값, 타입은 A타입이기 때문에 클래스이다. super는 부모클래스이다.
//		this() : 접근한 객체의 주소값, this는 자식클래스이다.
		super();
		System.out.println("자식 생성자 호출");
	}
	
	void printData() {
		System.out.println(data);
	}
}

//부모 클래스
class Human {
	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("자기");
	}
	
	void walk() {
		System.out.println("두 발로 걷기");
	}
}

//자식 클래스
class Monkey extends Human {
	void eatLouse() {
		System.out.println("냠냠");
	}
	
	@Override
	void walk() {
		//  부모의 메소드를 그대로 사용하고 싶다면 덮어 쓰기 전에 부모의 기능을 가져와 사용한다.
		super.walk();
		System.out.println("네 발로 걷기");
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		
		b.printData();
		System.out.println(b.nameA);
		System.out.println(b.nameB);
		

		Monkey kingkong = new Monkey();
		
		kingkong.eat();
		kingkong.sleep();
		kingkong.walk();	// 오버라이딩 한 walk()
		kingkong.eatLouse();
	
	}
}
