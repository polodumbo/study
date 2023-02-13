package test;

public class KiwiPhone implements Phone {
	public KiwiPhone() {
		System.out.println("KiwiPhone 기본생성자");
	}

	@Override
	public void powerOn() {
		System.out.println("키위폰 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("키위폰 OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("키위폰 사운드 ++");
	}

	@Override
	public void volumeDown() {
		System.out.println("키위폰 사운드 --");
	}

	public void destroyMethod() {
		System.out.println("객체를 삭제할 때 호출할 수 있는 메서드");
		// close() 연결해제 로직 등을 호출할 때 사용
	}

	public void initMethod() {
		System.out.println("객체를 초기화할 때 호출할 수 있는 메서드");
	}

}
