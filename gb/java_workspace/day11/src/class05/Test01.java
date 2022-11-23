package class05;

class Person {
	String name;
	
	@Override
	public String toString() {
		return this.name + "님";
	}

	Person(String name) {
		this.name = name;
	}
}

class Card extends Person {
	int bal;
	
	boolean checkBal(int money) {
		if (money > this.bal) {
			System.out.println("잔액 부족...");
			return false;
		}
		return true;
	}
	
	void pay(int money) {
		if (this.checkBal(money)) {
			this.bal -= money;
			System.out.println(money + "원 결제되었습니다. 잔액: " + this.bal);
		}
	}

	@Override
	public String toString() {
		return this.name + "님 카드 잔액 " + this.bal + "원";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card) {
			Card c = (Card)obj;
			if (c.name.equals(this.name)) {
				System.out.println("같은 카드입니다.");
				return true;
			}
			System.out.println("다른 카드입니다.");
			return false;
		}
		System.out.println("올바르지않습니다...");
		return false;
	}

	Card(String name, int bal) {
		super(name);
		this.bal = bal;
	}
}

class Credit extends Card {
	int limit;

	@Override
	void pay(int money) {
		if (this.checkBal(money)) {
			if (money > limit) {
				System.out.println("결제 한도 초과...");
				return;
			}
			this.bal -= money;
			System.out.println(money + "원 결제되었습니다.");
		}
	}
	
	@Override
	public String toString() {
		return this.name + "님 신용카드 잔액 " + this.bal + "원 한도 " + this.limit + "원";
	}
	
	Credit(String name, int bal) {
		this(name, bal, 100);
	}

	Credit(String name, int bal, int limit) {
		super(name, bal);
		this.limit = limit;
	}
}

class Check extends Card {
	int point;

	@Override
	void pay(int money) {
		if (this.checkBal(money)) {
			super.pay(money);
			this.point += (money / 2);
			System.out.println((money / 2) + "포인트 적립 완료. 현재 포인트: " + this.point);
		}
	}
	
	@Override
	public String toString() {
		return this.name + "님 체크카드 잔액 " + this.bal + "원 포인트 " + this.point + "원";
	}

	Check(String name, int bal) {
		super(name, bal);
		this.point = 0;
	}
}

class Bus extends Card {
	int age;
	
	void pay() {
		int fee = 0;
		if (this.age >= 10 && this.age <= 19) {
			fee = 1000;
		} else if (this.age >= 20 && this.age <= 69) {
			fee = 2000;
		}
		if (this.checkBal(fee)) {
			this.bal -= fee;
			System.out.println(this.age + "세, " + fee + "원이 결제되었습니다. 잔액: " + this.bal);
		}
	}
	
	@Override
	public String toString() {
		return this.name + "님 버스카드 잔액 " + this.bal + "원 나이 " + this.age + "세";
	}

	Bus(String name, int bal) {
		this(name, bal, 20);
	}
	
	Bus(String name, int bal, int age) {
		super(name, bal);
		this.age = age;
	}
} 

public class Test01 {
	public static void main(String[] args) {
		Person p = new Person("홍길동");
		Credit c1 = new Credit("홍길동",10000,20000);
		Credit c2 = new Credit("홍길동",10000);
		Check c3 = new Check("홍길동",10000);
		Bus c4 = new Bus("홍길동",10000,11);
		Bus c5 = new Bus("홍길동",1000);
		Bus c6 = new Bus("임꺽정",10000);
		Card[] arData = {c1, c2, c3, c4, c5};
		
		for (Card v : arData) {
			System.out.println(v);
		}
		
		arData[0].pay(5000); // 결제 성공
		arData[0].pay(20000); // 잔액 부족
		arData[1].pay(1000); // 한도 초과
		arData[2].pay(5000); // 결제 성공, 포인트 2500 적립
//		arData[3].pay();
//		arData[4].pay();
		c4.pay(); // 11세, 1000원 결제
		c5.pay(); // 잔액 부족
		
		arData[0].equals(arData[1]); // 이름이 같은 카드
		arData[0].equals(c6); // 이름이 다른 카드
		arData[0].equals(p); // 카드가 아닌 것과 비교
		
	}
}
