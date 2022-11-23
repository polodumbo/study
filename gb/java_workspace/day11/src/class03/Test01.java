package class03;

//	Point
//		int x
//		int y
//	
//	ColorPoint
//		String color
//		int x
//		int y
//	
//	main()
//		Point p = new Point(10, 20)
//			// (10, 20)
//		ColorPoint cp1 = new ColorPoint(1, 2);
//			// 검정(1, 2)
//		ColorPoint cp2 = new ColorPoint("분홍");
//			// 분홍(0, 0)
//		ColorPoint cp3 = new ColorPoint("파랑", 3, 4);
//			// 파랑(3, 4)
//	
//		p.move(); // (11, 21)
//		cp2.move(); // 분홍(1, 1)
//		cp3.move(-1, -2); // 파랑(2, 2)
class Point {
	int x;
	int y;

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	void move() {
		this.move(1, 1);
	}

	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println("x축: " + x + ", y축: " + y + " 만큼 이동" + " => (" + this.x + ", " + this.y + ")");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) { // instanceof : 캐스팅이 가능하니?
			Point p = (Point)obj; // 다운 캐스팅
			if (p.x == this.x && p.y == this.y) { // 비교대상의 x == this.x && 비교대상의 y == this.y
				return true;
			}
		}
		return false;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class ColorPoint extends Point {
	String color;

	@Override
	public String toString() {
		return this.color + "(" + this.x + ", " + this.y + ")";
	}

	void move() {
		this.move(1, 1);
	}

	@Override
	void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println(
				"x축: " + x + ", y축: " + y + " 만큼 이동" + " => " + this.color + "(" + this.x + ", " + this.y + ")");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ColorPoint) {
			ColorPoint cp = (ColorPoint)obj; // 다운 캐스팅
			if (cp.color == this.color) {
				if (cp.x == this.x && cp.y == this.y) {
					return true;
				}
			}
		}
		return false;
	}

	ColorPoint(int x, int y) {
		this("검정", x, y);
	}

	ColorPoint(String color) {
		this(color, 0, 0);
	}

	ColorPoint(String color, int x, int y) {
		super(x, y);
		this.color = color;
	}
}

public class Test01 {
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		ColorPoint cp1 = new ColorPoint(1, 2);
		ColorPoint cp2 = new ColorPoint("파랑");
		ColorPoint cp3 = new ColorPoint("파랑", 3, 4);

		System.out.println(p);
		System.out.println(cp1);
		System.out.println(cp2);
		System.out.println(cp3);

		p.move(); // (11, 21)
		cp1.move(); // 검정(2, 3)
		cp2.move(2, 2); // 파랑(2, 2)
		cp3.move(-1, -2); // 파랑(2, 2)

		if (cp2.equals(cp3)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}
}
