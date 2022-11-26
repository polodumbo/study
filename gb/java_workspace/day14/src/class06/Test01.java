package class06;

class TV implements USETV {
	String name;
	int price;
	Remote remote; // 특정 클래스가 다른 클래스를 멤버변수로 가질 수 있다!

	@Override
	public void changeCH() {
		remote.changeCH();
	}

	@Override
	public void powerON() {
		remote.powerON();
	}

	@Override
	public void powerOFF() {
		remote.powerOFF();
	}

	TV(String name) {
		this.name = name;
		this.price = 1000000;
		this.remote = new Remote();
	}

}

class Remote implements USETV {

	@Override
	public void changeCH() {
		System.out.println("채널 변경");
	}

	@Override
	public void powerON() {
		System.out.println("전원 ON");
	}

	@Override
	public void powerOFF() {
		System.out.println("전원 OFF");
	}

}

public class Test01 {
	public static void main(String[] args) {

		TV tv = new TV("홍길동");
		tv.powerON();
		tv.changeCH();
		tv.powerOFF();
	}
}