package class01;

class Car {
	String name;
	int speed;
	static int max = 120; // 객체와 무관하게
	
	void speedUp() {
		this.speed += 30;
		if (Car.max < this.speed) {
			System.out.println("과속!");
			this.speed = Car.max;
		}
	}
	
	void sppedUp(int speed) {
		this.speed += speed;
		if (Car.max < this.speed) {
			System.out.println("과속!");
			this.speed = Car.max;
		}
	}
	
	Car(String name) { // 생성자는 멤버변수를 초기화하기 위해 사용
		this.name = name;
		this.speed = 0;
	}
	
}

class SuperCar extends Car {
	// 자식 클래스의 모든 생성자들은
	// "맨 처음"으로 부모 클래스의 기본 생성자를 필요로 한다!!
	//=> 부모클래스의 다른 생성자를 대신 사용해 보자!!

	void func1() {
		
	}
	
	void func2() {
		
	}
	
	void func3() {
		
	}
	
	SuperCar(String name) {
		super(name);
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Car car1 = new Car("홍길동");
		Car car2 = new Car("임꺽");
	}
}
