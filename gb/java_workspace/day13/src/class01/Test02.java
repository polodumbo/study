package class01;

abstract class Shape {
	String name;
	double area;

	void draw() {
		System.out.println(this.name + " 그림 그리는 중...");
	}

	abstract void setArea(); // 내 하위클래스들이 꼭 오버라이딩했으면...
//		this.area = ???

	@Override
	public String toString() {
		return this.name + "의 넓이: " + this.area;
	}

	Shape(String name) {
		this.name = name;
	}
}

class Circle extends Shape {
	// 1. 추상메서드가 오버라이딩을 강제
	// 2. 부모클래스에게 기본생성자가 없는 상태
	int radius;


	@Override
	void setArea() {
		this.area = this.radius * this.radius * 3.14;
		
	}
	
	Circle(int radius) {
		super("원");
		this.radius = radius;
		this.setArea();
	}
}

class Rect extends Shape {
	int x;
	int y;
	
	@Override
	void setArea() {
		this.area = this.x * this.y;
	}
	
	Rect(int x, int y) {
		super("사각형");
		this.x = x;
		this.y = y;
		this.setArea();
	}

}

public class Test02 {
	public static void main(String[] args) {
		Circle c = new Circle(1);
		c.draw();
		System.out.println(c);
		
		Rect r = new Rect(10, 20);
		r.draw();
		System.out.println(r);
	}
}
