package class06;

import java.util.Scanner;

// [객체 배열]
class Point {
	int x;
	int y;
	
	void info() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Point[] data = new Point[5];
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("x좌표 : ");
			int x = sc.nextInt();
			System.out.print("y좌표 : ");
			int y = sc.nextInt();
			data[i] = new Point(x, y);
		}
		
		for (Point v : data) {
			v.info();
		}
		
	}
}
