package class02;

//	예제)
//	통장을 1개(10000원) 공유함
//	가족 구성원 3명 생성
//	가1. 출금()
//		> 5000원 출금 로직
//	가2.출금()
//	가3.출금()
//
//	출금 실패하는 가족구성원 출력
class Family implements Runnable {
	Withdrawal w = new Withdrawal();

	@Override
	public void run() {
		w.withdraw();
	}
}

class Withdrawal {
	static int account = 10000;
	
	synchronized void withdraw() {
		boolean isFailed = false;
		if (account >= 5000) {
			System.out.println(Thread.currentThread().getName() + ": 5000원 인출 성공!");
			account -= 5000;
		} else {
			System.out.println(Thread.currentThread().getName() + ": 잔액 부족...");
			isFailed = true;
		}
		System.out.println("남은 예금: " + account + "원");
		System.out.println();
		
		if (isFailed) { // 인출 실패했다면
			System.out.println("푸훗! " + Thread.currentThread().getName() + "(은)는 손이 느리구나!");
		}
	}
}

public class Test03 {
	public static void main(String[] args) {
		Family f = new Family();
		Thread t1 = new Thread(f, "성훈");
		Thread t2 = new Thread(f, "계피");
		Thread t3 = new Thread(f, "우엉이");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
