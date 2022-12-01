package class02;

// [스레드]
// 스레드 객체를 생성하는 방식
// 1) 클래스 상속 > 다양한 필드 제공
// 2) 인터페이스 구현 > 인터페이스가 가지는 강제성은 개발을 용이하게 함!
class Th1 extends Thread { // Thread : 스레드의 부모

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("클래스로 만든 스레드 " + (i + 1));
		}
	}
	
}

class Th2 implements Runnable { // Runnable : 스레드의 인터페이스

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("인터페이스로 만든 스레드 " + (i + 1));
		}
	}
}

public class Test01 {
	public static void main(String[] args) {
		Th1 th1 = new Th1(); // Thread를 상속 받았기 때문에 명확히 Thread 클래스
		
		Th2 th2 = new Th2(); // Thread의 역할은 하지만 스레드는 아님
		Thread th3 = new Thread(th2); // 상속 시 강제성이 없었고 인자를 받는 생성자도 있으니 Thread의 생성자는 오버로딩 되어 있는 걸 알 수 있다.
		
		th1.start(); // start()	: run() 메서드를 실행하여 알아서 수행
		th3.start();
		
		// 1) 스레드 객체는 생성 시 run() 메서드를 가지고 있음
		// 2) run() 메서드에는 본인의 작업이 구현되어 있음
		// 3) start() 수행 시, 등록되어 있던 run()을 자체적으로 수행
		
		// 스레드의 생명주기(라이프사이클)
		//		생성 > 대기 > 수행 > 데드
		// 		블록(자원을 할당받지 못 하게 막아두는 상태)
		for (int i = 0; i < 5; i++) {
			System.out.println("메인 " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
