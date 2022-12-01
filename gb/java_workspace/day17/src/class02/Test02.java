package class02;

class Person implements Runnable {
	Ticketting t = new Ticketting();
	
	@Override
	public void run() {
		t.pay();
	}
}

class Ticketting {
	static int ticket = 2; // 공유자원(클래스변수)
	
	synchronized void pay() {
		if (ticket > 0) {
			ticket--;
			System.out.println(Thread.currentThread().getName() + ": 구매 성공!"); // Thread.currentThread().getName() : 현재 작업 중인 스레드명 반환
		} else {
			System.out.println(Thread.currentThread().getName() + ": 이미 선택된 좌석입니다...");
		}
		System.out.println(("남은 티켓: " + ticket + "장"));
		System.out.println();
	}
}

public class Test02 {
	public static void main(String[] args) {
		Person p = new Person();
		Thread t1 = new Thread(p, "홍길동");
		Thread t2 = new Thread(p, "임꺽정");
		Thread t3 = new Thread(p, "티모");
		
		t1.start();
		t2.start();
		t3.start();
		
		// 2장 밖에 없는데 전부 구매 성공하는 원인
		// 		공유자원에 여러 스레드의 동시 접속을 허용하고 있었기 때문
		// 		해결방안 : 하나의 스레드가 공유자원을 점유하고 있다면, '블록'해야 함 => 동기화
		//			동기화 : 공유자원을 특정 스레드가 점유하고 있을 때, 다른 스레드의 접근을 막는 것
		//			(데드락, 교착상태 주의)
	}
}
