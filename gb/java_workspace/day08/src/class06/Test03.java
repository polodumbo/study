package class06;

//	예제)
//	Circle 클래스를 만들고, 객체 c1, c2, c3 3개 생성
//	
//	Cicle 클래스 요구조건
//	1. 멤버변수
//		String name
//		int radius
//		double area
//	2. 메서드
//		void info()
//			: ㅁㅁ 넓이가 ㅁㅁ.ㅁㅁ입니다.
//	3. 생성자
//	
//	main() {
//		Circle c1 = new Circle("도넛"); // 도넛 넓이가 3.14입니다.
//		Circle c2 = new Circle(1); // 원 넓이가 314.0입니다.
//		Circle c3 = new Circle("피자", 10); // 피자 넓이가 31400.0입니다.
//	}

class Circle {
	String name;
	int radius;
	double area;
	void info() {
		System.out.println(this.name + " 넓이가 " + this.area +"입니다.");
	}
	Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
		this.area = radius * radius * 3.14;
	}
	Circle(String name) {
		this(name, 1);
	}
	Circle(int radius) {
		this("원", radius);
	}
}

public class Test03 {

	public static void main(String[] args) {
		Circle c1 = new Circle("도넛"); // 도넛 넓이가 3.14입니다.
		Circle c2 = new Circle(10); // 원 넓이가 314.0입니다.
		Circle c3 = new Circle("피자", 100); // 피자 넓이가 31400.0입니다.
		
		c1.info();
		c2.info();
		c3.info();
	}

}
