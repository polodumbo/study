package class06;

class Monster {
	String name;

	void attack() {
		System.out.println("기본 공격");
	}

	void hello() {
		System.out.println("ㅎㅇㅎㅇ");
	}

	Monster(String name) {
		this.name = name;
	}
}

class Pikachu extends Monster {
	void attack() { // 메서드 오버라이딩 == 함수 재정의
		System.out.println("백 만 볼트~~!");
	}
	
	void hello() {
		System.out.println("피카피카♡");
	}
	
	Pikachu() {
		super("피카츄");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Pikachu p = new Pikachu();
		p.hello();
		p.attack();
	}
}
