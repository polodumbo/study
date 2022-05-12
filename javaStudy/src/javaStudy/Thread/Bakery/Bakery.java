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
		
		//이미지 넣기
		ImageIcon icon = new ImageIcon("src/img/bakery.gif");
		
		makerThread.start();
		
		while (true) {
			choice = JOptionPane.showOptionDialog(null, "", "동석이네 빵집", JOptionPane.DEFAULT_OPTION, 
			JOptionPane.PLAIN_MESSAGE, icon, btns, null);
			
			if (choice == 0) {
				plate.eatBread();
			} else {
				// 쓰레드가 실행 중에 종료시키면 비정상 종료가 되므로
				// 멈춘 상태에서 종료시키는 기술이 필요하다.
//				maker.setExit(true);
//				makerThread.interrupt();	// wait()에서 안 멈춤...
				System.exit(0);	// 전체 프로세스 종료
				break;	// break;만 쓴다면 입력창만 꺼짐, try-catch에서 
			}
		}
	}
}
