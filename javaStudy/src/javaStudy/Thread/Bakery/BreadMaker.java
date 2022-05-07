package javaStudy.Thread.Bakery;

public class BreadMaker implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			BreadPlate.getInstance().makeBread();
			try {Thread.sleep(500);} catch (InterruptedException e) {break;}
		}
		System.out.println("재료 소진 ㅠㅠ");
	}
}
