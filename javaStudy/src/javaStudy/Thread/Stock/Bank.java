package javaStudy.Thread.Stock;

import java.util.Random;

public class Bank implements Runnable {
	
	// 통장
	int money;
	// 변한 투자금(After)
	int stockMoney = 0;
	// 투자금(Before)
	int depositMoney = 0;
	
	public void deposit(int money) {
		this.money += money;
	}
	
	// 매도
	public void sell() {
		this.money += stockMoney;
	}
	
	// 주식 상장, 폐지
	public boolean stock() {
		Random r = new Random();
		int raiting = 0;
		
		if (r.nextInt(100) == 0) {
			stockMoney = 0;
			return false;
		}
		
		// 1~30
		raiting = r.nextInt(30) + 1;
		
		// 10% 확률로 하한가
		if (r.nextInt(10) == 0) {raiting *= -1;}
		
		// 원금에서 수익률만큼 갱신
		stockMoney *= (100 + raiting) * 0.01;
		
		return true;
	}
	
	@Override
	public void run() {
		
		money -= depositMoney;
		
		while (true) {
			if (!stock()) {System.out.println("상장이 폐지되었습니다. 바람을 쐬고 오세요..."); break;}
			System.out.print(stockMoney + "원(");
			System.out.println(String.format("%.2f", (stockMoney - depositMoney) / (double)depositMoney * 100) + "%)");
			try {Thread.sleep(500);} catch (InterruptedException e) {
				System.out.println("=====================================");
				System.out.println("주식 전 투자 금액 : " + depositMoney + "원");
				System.out.println("주식 후 투자 금액 : " + stockMoney + "원");
				System.out.println("수익률 : " + String.format("%.2f", (stockMoney - depositMoney) / (double)depositMoney * 100) + "%");
				System.out.println("=====================================");

			}
		}
	}
	
}
