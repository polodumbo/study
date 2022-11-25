package class02;

//	동물
//		종 이름
//		해당 동물 이름
//		나이
//		hello()
//		eat()
//		sleep()
//	
//	강아지
//		강아지("초코", 2);
//		멍멍
//		eat() // 냠냠
//		sleep()	// zzz...
//	
//	고양이
//		고양이("나르", 4);
//		야옹

abstract class Animal {
	private String type;
	private String name;
	private int age;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	abstract void hello();

	void eat() {
		System.out.println("냠냠");
	}

	void sleep() {
		System.out.println("zzz...");
	}
	
	
	@Override
	public String toString() {
		return this.type + " " + this.name + "는 " + this.age + "살";
	}
	
	Animal(String type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age = age;
	}

}

class Dog extends Animal {

	@Override
	void hello() {
		System.out.println("멍멍");
		
	}
	
	Dog(String name, int age) {
		super("강아지", name, age);
	}
	
}

class Cat extends Animal {

	@Override
	void hello() {
		System.out.println("야옹");
	}

	Cat(String name, int age) {
		super("고양이", name, age);
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Dog d = new Dog("초코", 2);
		Cat c = new Cat("나르", 4);
		
		System.out.println(d);
		d.hello();
		d.eat();
		
		System.out.println();
		
		System.out.println(c);
		c.hello();
		c.eat();
		
	}
}
