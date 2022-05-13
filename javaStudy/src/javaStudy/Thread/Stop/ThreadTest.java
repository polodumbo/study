package javaStudy.Thread.Stop;

public class ThreadTest implements Runnable {
	
	@Override
	public void run() {
		while (true) {
			System.out.println("실행 중...");
//			try {Thread.sleep(500);} catch (InterruptedException e) {break;}
			
			if (Thread.interrupted()) {
				break;
			}
		}
	}
	
}
