package class05;

// 인터페이스
class Galaxy implements Phone {
	String name;
	String type;

	public void powerOn() {
		System.out.println("파워ON");
	}

	public void powerOff() {
		System.out.println("파워OFF");
	}

	public void soundUp() {
		System.out.println("소리++");
	}

	public void soundDown() {
		System.out.println("소리--");
	}
}

class Apple implements Phone {
	String name;
	String type;

	void turnOn() {
		System.out.println("전원ON");
	}

	void turnOff() {
		System.out.println("전원OFF");
	}

	void volumeUp() {
		System.out.println("볼륨++");
	}

	void volumeDown() {
		System.out.println("볼륨--");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub

	}
}

public class Test01 {
	public static void main(String[] args) {

		Apple phone = new Apple();

		phone.turnOn();
		phone.volumeUp();
		phone.volumeDown();
		phone.turnOff();

		// 객체를 변경 > 모든 사용 중인 메서드도 변경
	}
}
