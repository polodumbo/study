package class02;

public class Test04 {
	// 절대값 반환
	// 1) abs() 함수 정의하기
	// input : int
	// output : int
	public static int abs(int num) {
//		if (num < 0) {
//			num *= (-1);
//		}
//		return num;
		
		return num > 0 ? num : num * (-1);
	}
	
	// 소수 확인
	public static boolean isPrime(int num) { // 메서드명이 is, has로 시작하면 리턴타입 거의 boolean
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			if (num % (i + 1) == 0) {
				cnt++;
			}
		}
//		if (cnt == 2) {
//			return true;
//		}
//		return false;
		
		return cnt == 2 ? true : false;
	}

	public static void main(String[] args) {
		int a = abs(10); // 절대값을 반환하는 함수
		int b = abs(-10);
		int c = 3;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if (isPrime(c)) {
			System.out.println(c + "는 소수입니다.");
		} else {
			System.out.println(c + "는 소수가 아닙니다.");
		}
	}

}
