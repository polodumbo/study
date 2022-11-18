package class05;

class Circle {
	String name;
	int radius;
	void info() {
		System.out.println(this.name + ": " + this.radius);
	}
	
	// 생성자 오버로딩
	Circle() {
		System.out.println("기본 생성자");
	}
	
	Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
		System.out.println("내가 정의한 생성자");
	}
}

public class Test02 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle("피자", 20);
		Circle c3 = new Circle("도넛", 10);
		
		c1.info();
		c2.info();
		c3.info();
	}

}
