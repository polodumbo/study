package javaStudy.Thread.Test3;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arInput = new int[3];
		Thread[] arThread = new Thread[3];
		
		// 사실상 Runnable타입
		ThreadTask tt = new ThreadTask();
		
		for (int i = 0; i < arThread.length; i++) {
			arThread[i] = new Thread(tt);
		}
		System.out.print("입력 : ");
		for (int i = 0; i < arInput.length; i++) {
			arInput[i] = sc.nextInt();
			arThread[i].setName(arInput[i] + "");
		}
		
		for (int i = 0; i < arThread.length; i++) {
			arThread[i].start();
			try {arThread[i].join();} catch (InterruptedException e) {;}
		}
		
	}
}