package javaStudy.Thread.ATM;

public class CU {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		// 여러 쓰레드가 하나의 자원을 공유하기 때문에 박살이 난다.
		// 때문에 동기화를 통해 막아준다.
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		mom.start();
		son.start();
	}
}
