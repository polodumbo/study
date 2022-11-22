package class02;

// 상속
class Point {
	int x;
	int y;
	
	void info() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	Point() {
		System.out.println("Point 클래스의 기본 생성자 호출됨");
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 클래스의 생성자 호출됨");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		p.info();

	}
}
