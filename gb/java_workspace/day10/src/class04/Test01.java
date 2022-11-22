package class04;

//	Shape
//		String name;
//		double area;
//		void draw()
//			// 그림그리는중...
//	main(){
//		Shape s=new Shape("모양이름");
//			// 모양이름: 0.0
//		Shape s=new Shape("모양이름",12.3);
//			// 모양이름: 12.3
//	}
//	
//	Circle
//		String name;
//		int radius;
//		double PI;
//			// 모든 원 객체들이
//			// 3.14로 동일함
//		double area;
//		void drawCircle()
//			// 원그리는중...
//	main(){
//		Circle=new Circle(1);
//			// 원: 3.14
//	}
//	
//	Rectangle
//		String name;
//		int x;
//		int y;
//		double area;
//		void drawRectangle()
//			// 사각형그리는중...
//	main(){
//		Rectangle=new Rectangle(3); // 가로,세로 길이가 동일함
//			// 사각형: 9.0
//		Rectangle=new Rectangle(2,3);
//			// 사각형: 6.0
//	}
class Shape {
	String name;
	double area;
	
	void draw() {
		System.out.println("그림 그리는 중...");
	}
	
	void info() {
		System.out.println(this.name + ": " + this.area);
	}
	
	Shape(String name) {
		this(name, 0.0);
	}
	
	Shape(String name, double area) {
		this.name = name;
		this.area = area;
	}
}

class Circle extends Shape {
	int radius;
	static double PI = 3.14;
	
	// 오버라이딩
	void draw() {
		System.out.println("원 그리는 중...");
	}
	
	// 넓이가 먼저(뭔가 이상하다!)
//	Circle(int radius) {
//		super("원", radius * radius * PI);
//		this.radius = radius;
//	}
	
	// 논리적으로 정석
	Circle(int radius) {
		super("원");
		this.radius = radius;
		this.area = this.radius * this.radius * Circle.PI;
	}
	
}

class Rectangle extends Shape {
	int x;
	int y;
	
	// 오버라이딩
	void draw() {
		System.out.println("사각형 그리는 중...");
	}
	
//	Rectangle(int x) {
//		super("정사각형");
//		this.x = x;
//		this.y = x;
//		this.area = this.x * this.y;
//	}
	
	Rectangle(int x) {
		this(x, x);
		this.name = "정사각형";
	}
	
//	Rectangle(int x, int y) {
//		super("사각형", x * y);
//		this.x = x;
//		this.y = y;
//	}
	
	Rectangle(int x, int y) {
		super("사각형");
		this.x = x;
		this.y = y;
		this.area = this.x * this.y;
	}
	
}

public class Test01 {

	public static void main(String[] args) {
		Shape s1 = new Shape("점");
		Shape s2 = new Shape("삼각형", 4.5);
		
		s1.draw();
		
		s1.info();
		s2.info();
		
		Circle c = new Circle(1);
		
		c.draw();
		
		c.info();
		
		Rectangle r1 = new Rectangle(3);
		Rectangle r2 = new Rectangle(2, 3);
		
		r1.draw();
		
		r1.info();
		r2.info();
	}

}
