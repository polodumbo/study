package javaStudy.Thread.Test2;

public class Zoo {
	public static void main(String[] args) {
		// 마지막 동물은 다른 동물들이 다 운 뒤에 운다.
		String[] sounds = {"어흥", "꿱", "야옹"};
		Animal[] animals = new Animal[sounds.length];
		Thread[] threads = new Thread[sounds.length];
		
		for (int i = 0; i < animals.length; i++) {
			animals[i] = new Animal();
			threads[i] = new Thread(animals[i], sounds[i]);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			if(i != 0) {
				//이미 start()된 쓰레드는 join()의 영향을 받지 않는다.
				try {threads[i].join();} catch (InterruptedException e) {;}
			}
		}
	}
}
