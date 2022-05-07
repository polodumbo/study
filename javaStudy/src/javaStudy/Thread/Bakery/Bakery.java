package javaStudy.Thread.Bakery;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		
		// 소프트웨어 디자인 패턴 중 싱글톤(객체가 하나만 만들어저야 되는 패턴)
		
		BreadMaker maker = new BreadMaker();
		Thread makerThread = new Thread(maker);
		BreadPlate plate = BreadPlate.getInstance();
		
		String[] btns = {"빵 먹기", "나가기"};
		int choice = 0;
		
		// 이미지 넣기
		ImageIcon icon = new ImageIcon("src/javaStudy/Thread/Bakery/bakery.gif");
		
		makerThread.start();
		
		while (true) {
			choice = JOptionPane.showOptionDialog(null, "", "동석이네 빵집", JOptionPane.DEFAULT_OPTION, 
			JOptionPane.PLAIN_MESSAGE, icon, btns, null);
			
			if (choice == 0) {
				plate.eatBread();
			} else {
				makerThread.interrupt();
				break;	// break;만 쓴다면 입력창만 꺼짐, try-catch에서 
			}
		}
	}
}
