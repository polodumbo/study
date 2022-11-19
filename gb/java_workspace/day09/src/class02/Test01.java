package class02;

class ColorPoint {
	String color;
	int x;
	int y;
	
	void info() {
		System.out.println(this.color + "(" + this.x + ", " + this.y + ")");
	}
	
	ColorPoint() {
		this("검정", 0, 0); // 먼저 호출되어야 한다.
		System.out.println("기본 생성자 호출");
	}

	ColorPoint(String color) {
		this(color, 0, 0);
		System.out.println("인자가 String인 호출");
	}
	
	ColorPoint(int x) {
		this("검정", x, x);
		System.out.println("인자가 int인 호출");
	}
	
	ColorPoint(int x, int y) {
		this("검정", x, y);
		System.out.println("인자가 2개인 생성자 호출");
	}
	
	public ColorPoint(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
		System.out.println("인자가 가장 많은 생성자 호출");
	}
	
}

public class Test01 {

	public static void main(String[] args) {
		ColorPoint cp1 = new ColorPoint("분홍", 1, 2);
		System.out.println("======================");
		ColorPoint cp2 = new ColorPoint("빨강");
		System.out.println("======================");
		ColorPoint cp3 = new ColorPoint(10);
		System.out.println("======================");
		ColorPoint cp4 = new ColorPoint(100, 200);
		System.out.println("======================");
		ColorPoint cp5 = new ColorPoint();

	}

}
