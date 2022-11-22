package class03;

class Person {
	String name;
	
	void hello() {
		System.out.println("안녕하세요!");
	}
	
	Person(String name) {
		this.name = name;
		System.out.println("Person 생성자 호출됨");
	}
}

class Student extends Person {
	int score;
	
	void info() {
		System.out.println(this.name + ": " + this.score + "점");
	}
	
	// 오버라이딩
	void hello() {
		System.out.println("안녕하세요! 저는 " + this.name + "입니다.");
	}
	
	// 부모 클래스인 Person에게 기본 생성자가 없기 때문에 부모 클래스의 다른 생성자를 만들어줘야 한다.
	Student(String name, int score) {
		super(name); // 부모 클래스의 생성자 호출
		this.score = score;
		System.out.println("Student 생성자 호출됨");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 100);
		s1.info();
		s1.hello();
	}
}
