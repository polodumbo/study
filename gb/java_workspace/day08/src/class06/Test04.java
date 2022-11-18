package class06;

//	예제 2)
//	클래스 Car를 제작해주세요!~~
//	
//	클래스 Car 요구조건
//	1. 멤버변수
//		String name
//		int speed
//		int maxSpeed
//	2. 메서드
//		void speedUp()
//		void speedDown()
//		void info()
//	3. 생성자 2개
//	
class Car {
	String name;
	int speed;
	int maxSpeed;
	
	void speedUp() {
		this.speed +=50;
		System.out.println("부아아아앙!!!");
		if (this.speed > this.maxSpeed) {
			System.out.println("과속!!! 현재 속도는 최고속도인 " + this.maxSpeed + "입니다.");
			this.speed = this.maxSpeed;
		} 
	}
	
	void speedDown() {
		if (this.speed > 0) {
			this.speed -= 25;
			if (this.speed < 0) {
				this.speed = 0;
			}
			System.out.println("슈우웅... 현재 속도는 " + this.speed);
		} else {
			System.out.println("끼이이익!!! 이미 멈췄습니다...");
		}
	}
	
	void info() {
		System.out.println(this.name + "님의 차 [" + this.speed + "/" + this.maxSpeed +"]");
	}
	
	public Car(String name) {
		this(name, 120);
	}
	
	public Car(String name, int maxSpeed) {
		this.name = name;
		this.speed = 0; // 안 써도 0이라 써도 그만 안 써도 그만
		this.maxSpeed = maxSpeed;
	}
	
}

public class Test04 {
//	main(){
//	Car c1=new Car("홍길동");
//	Car c2=new Car("임꺽정",20);
//
//	c1.info();
//	 -> 홍길동님의 차 [0/120]
//	c2.info();
//	 -> 임꺽정님의 차 [0/20]
//
//	c1.speedDown();
//	 -> -25
//	 => 이미 멈췄습니다...
//	c2.speedUp();
//	 -> +50
//	 => 과속!!!
//
//	c1.info();
//	 -> 홍길동님의 차 [0/120]
//	c2.info();
//	 -> 임꺽정님의 차 [20/20]
//}
	public static void main(String[] args) {
		Car c1 = new Car("홍길동");
		Car c2 = new Car("임꺽정", 20);
		
		c1.info(); // [0/120]
		c2.info(); // [0/20]
		
		c1.speedUp(); // + 50 [50/120]
		c1.speedUp(); // + 50 [100/120]
		c1.speedDown(); // -25 [75/120]
		c2.speedUp(); // +50 [20/20]
		c2.speedDown(); // -25 [0/20]
		c2.speedDown(); // -25 [0/20]
		
		c1.info(); // [75/120]
		c2.info(); // [0/20]
	}

}
