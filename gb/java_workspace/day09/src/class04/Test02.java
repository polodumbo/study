package class04;

import java.util.Scanner;

//	예제)
//	Account
//		String card;
//		int bal; // 공유자원(10000)
//		void info()
//			"통장 잔액: ㅁㅁ원" 출력
//		void pay(int money)
//			bal = bal - money
//			단, 남은 잔액 없으면 "결제 불가능!" 출력
//	
//	main()
//		Account card1 = new Account("교통");
//		Account card2 = new Account("체크");
//	
//		card2.pay(9000);
//		card1.pay(1200); // 결제 불가능
class Account {
	String cardName; // 카드명
	static int bal = 10000; // 통장금액
	
	// 잔액
	void info() {
		System.out.println("통장 잔액: " + Account.bal + "원");
	}
	
	// 결제
	void pay(int money) {
		if (Account.bal < money) {
			System.out.println(money + "원 결제 불가능!");
			this.info();
			return; // 함수 즉시 공료
		}
		Account.bal -= money;
		System.out.println(this.cardName + "카드로 " + money + "원을 결제합니다.");
	}
	
	// 생성자
	Account(String cardName) {
		this.cardName = cardName;
	}
}

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] arAccount = new Account[2];
		for (int i = 0; i < arAccount.length; i++) {
			System.out.println("용도를 입력하세요.");
			System.out.print("  : ");
			String card = sc.next();
			arAccount[i] = new Account(card);
		}

		int i = 0;
		while (true) {
			System.out.print("계산할까요? (종료 0) ");
			int money = sc.nextInt();
			
			if (money == 0) {
				break;
			}
			arAccount[i].pay(money);
			i++;
			
			if (i == arAccount.length) {
				i = 0;
			}
		}

	}
}
