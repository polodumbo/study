package class01;

// [추상클래스]
abstract class Po {
	// 포켓몬 클래스라면 ~~게 생겨야 해!라고 정의하고 싶음
	// 객체를 만들고 싶은 것이 아님
	// => 추상클래스
	String name;
	int lv;
	int exp;

	void attack() {
		// 모든 포켓몬들이 공통적으로 수행
		// => 공통적이므로, 추상클래스에서 구현하는 것이 이득
	}

	// 추상 메서드
	abstract void hello();
//		System.out.println("A"); // 모든 하위 클래스에서 재정의 될 메서드는 어차피 사용할 수 없다. 비워두자. 
		// 각 포켓몬 클래스들이 모두 다름
		// => 모두 다 다르기 때문에, 하위클래스에서 구현하는 것이 옳음
	
}

class Pi extends Po {
	void hello() {
		System.out.println("B");
	}
}

class Ggo extends Po {
	void hello() {
		System.out.println("C");
	}
}
public class Test01 {
	public static void main(String[] args) {
//		Pp po = new Po(); // 추상클래스는 객체 생성 안 됨
	}
}
