package test;

public class ApplePhone implements Phone {
	public ApplePhone() {
		System.out.println("ApplePhone 기본생성자");
	}

	@Override
	public void powerOn() {
		System.out.println("애플폰 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("애플폰 OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("애플폰 사운드 ++");
	}

	@Override
	public void volumeDown() {
		System.out.println("애플폰 사운드 --");
	}

	public void initMethod() {
		System.out.println("객체를 초기화할 때 호출할 수 있는 메서드");
	}
}
