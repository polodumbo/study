package class01;

import java.util.ArrayList;

class Student {
	private int num; // 멤버변수
	private String name;
	private int age;

	// '캡슐화'
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 생성자: 멤버변수를 초기화하는 역할 (함수 O)
	Student(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
}

class Shape {
	String name;

	Shape(String name) {
		this.name = name;
	}
}

class Circle extends Shape {
	Circle() {
		super("원");
	}
}

// '추상화'
// 추상클래스: 객체화 xxx
abstract class Pokemon {
	// 추상메서드: 오버라이딩을 강제
	abstract void attack();
}

class Elec extends Pokemon {
	@Override
	void attack() {
		// TODO Auto-generated method stub

	}
}

class Water extends Pokemon {
	@Override
	void attack() {
		// TODO Auto-generated method stub
	}
}

public class Test01 {
	public static void main(String[] args) {

		int num = 123; // 변수 선언,정의 및 초기화
		Student student = new Student(101, "홍길동", 20);
		// 객체를 생성 == 객체화(인스턴스화)

		Pokemon[] datas = new Pokemon[5];
		ArrayList<Pokemon> datas2 = new ArrayList<Pokemon>();
		// 크기가 정해짐 vs 정해지지않음
		// 삽입,삭제 불리 vs 유리
		// 공통점: Index를 사용 (접근 용이)

		for (Pokemon v : datas) {
			v.attack();
		}
		// 동적바인딩
		// : '다형성' 실현됨
		// : 실제 객체의 오버라이딩된 메서드가 수행되는 현상

	}
}