package class04;

class Po {
	String name;
	int lv;

	void hello() {
		System.out.println("울음소리");
	}

	Po(String name) {
		this.name = name;
		this.lv = 5;
	}
}

class Pika extends Po {
	@Override
	void hello() {
		System.out.println("피카피카");
	}

	void func() {
		System.out.println("피카츄만의 행동!");
	}

	Pika() {
		super("피카츄");
	}
}

class Charm extends Po {
	@Override
	void hello() {
		System.out.println("파아~~~");
	}

	Charm() {
		super("파이리");
	}
}

public class Test02 {
	public static void main(String[] args) {
		Po[] arData = new Po[2];
		arData[0] = new Pika();
		arData[1] = new Charm();

		for (Po v : arData) {
			v.hello();
			// "오버라이딩되어있는 메서드가 자동 수행된다."
			// => ★ 동적바인딩 : 다형성
		}

	}
}