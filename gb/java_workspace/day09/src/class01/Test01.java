package class01;

// 점
// x, y 좌표
// info(), move()
class Point {
	int x;
	int y;
	
	void info() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	void move() {
		this.x += 10;
		this.y += 10;
	}
	
	void move(int num) {
		this.x += num;
		this.y += num;
	}
	
	void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	Point() {
		this(0, 0);
	}
	
	Point(int x) {
		this(x, x);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Test01 {

	public static void main(String[] args) {
		Point p1 = new Point(); // 0, 0
		Point p2 = new Point(10); // 10, 10
		Point p3 = new Point(1, 2); // 1, 2
		
		p1.info();
		p2.info();
		p3.info();
		
		p1.move();
		p2.move(-5);
		p3.move(1, 2);
		
		System.out.println();
		p1.info();
		p2.info();
		p3.info();
	}

}
