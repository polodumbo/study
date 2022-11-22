package class02;

// 동일한 패키지 내에서 같은 이름을 가진 클래스를 생성할 수 없음
class ColorPoint extends Point {
	 String color;
	 
	 ColorPoint(String color) {
		 // 부모 클래스의 기본 생성자를 호출하는 코드, super()는 생략 가능
		 super(); // 부모 클래스의 기본 생성자
		 this.color = color;
		 System.out.println("CP 클래스의 생성자 호출됨");
	 }
	 
	 // 오버라이딩
	 void info() {
			System.out.println("(" + x + ", " + y + ") " + this.color);
	 }
}

public class Test02 {
	public static void main(String[] args) {
//		Point p = new Point(-1, -2);
//		p.info();
		
		// 자식 클래스 객체화 할 때 제일 먼저 부모의 기본생성자 호출
		ColorPoint cp = new ColorPoint("분홍");
		
		cp.x = -1;
		cp.y = -2;
		cp.info();
		
	}
}
