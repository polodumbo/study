package class03;

//	예제)
//	Card
//		String name;
//		int bal;
//		int point;
//		void info()
//			ㅁㅁ님 카드: ㅁㅁ원 | ㅁㅁ포인트
//	
//	main()
//		Card c1 = new Card("홍길동");
//			// 0원, 0포인트
//		Card c2 = new Card("임꺽정", 10000);
//			// 10000원, 0포인트
//	
//	BusCard
//		String name;
//		int age;
//		int bal;
//		int point;
//		void printInfo()
//			ㅁㅁ님 카드: ㅁㅁ원 | ㅁㅁ포인트
//			ㅁㅁ세 요금 ㅁㅁ원
//				~10살, 60~살 0원
//				11~19살 1000원
//				20~59살 2000원
//		void pay()
//			계산로직
//	
//	main()
//		Bus b1 = new Bus("홍길동");
//			// 20세, 10000원, 0포인트
//		Bus b2 = new Bus("임꺽정", 19);
//			// 19세, 10000원, 0포인트
//		Bus b3 = new Bus("티모", 21, 20000)
//			// 21세, 20000원, 0포인트
class Card {
	String name;
	int bal;
	
	void info() {
		System.out.println(this.name + "님의 카드: " + this.bal + "원");
	}
	
	void pay(int money) {
		if (this.bal >= money) {
			this.bal -= money;
			System.out.println(this.name + "님의 카드에서 " + money + "원을 결제합니다.");
			System.out.println("잔액: " + this.bal + "원");
			return;
		}
		System.out.println("잔액 부족... 결제할 수 없습니다.");
	}
	
	Card(String name) {
		this(name, 0);
	}
	
	Card(String name, int bal) {
		this.name = name;
		this.bal = bal;
	}
}

class BusCard extends Card {
	int age;
	int fee;

//	int makeFee() {
//		int fee = 0;
//		if (11 <= this.age && this.age <= 19) {
//			fee = 1000;
//		} else if (20 <= this.age && this.age < 60) {
//			fee = 2000;
//		}
//		return fee;
//	}
	
//	void printInfo() {
	void info() {
//		this.info();
		super.info(); // ★
		System.out.println(this.age + "세 요금 " + this.fee + "원");
	}
	
	void pay() {
		this.pay(this.fee);
//		if (this.bal >= this.fee) {
//			this.bal -= this.fee;
//			System.out.println(this.name + "님의 카드에서 " + this.fee + "원을 결제합니다.");
//			System.out.println("잔액: " + this.bal + "원");
//		} else {
//			System.out.println("잔액 부족... 결제할 수 없습니다.");
//		}
	}
	
	BusCard(String name) {
		this(name, 20, 10000);
	}
	
	BusCard(String name, int age) {
		this(name, age, 10000);
	}
	
	BusCard(String name, int age, int bal) {
		super(name, bal);
		this.age = age;
		
		if (this.age >= 11 && this.age <= 19) {
			this.fee = 1000;
		} else if (this.age >= 20 && this.age <= 59) {
			this.fee = 2000;
		} else {
			this.fee = 0;
		}
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		Card c1 = new Card("홍길동");
		Card c2 = new Card("임꺽정", 10000);
		c1.info();
		c2.info();
		
		c1.pay(2000);
		c2.pay(2000);
		
		BusCard b1 = new BusCard("홍길동");
		BusCard b2 = new BusCard("임꺽정", 61);
		BusCard b3 = new BusCard("티모", 21, 20000);
		b1.info();
		b2.info();
		b3.info();
		
		b1.pay();
		b2.pay();
		b3.pay();
	}
}
