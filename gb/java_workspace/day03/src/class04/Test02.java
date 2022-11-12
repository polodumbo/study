package class04;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {

		// 사용자가 정확하게 입력할 때까지 계속
		// 종료 버튼을 누를 때까지 계속
		// => 무한하게
		
		// [무한루프, 무한반복문]
		// "종료조건"을 필요로 한다!!!
//		while (true) {
//			System.out.println("안녕!");
//		}
		
		Random rand = new Random();
		
		while (true) {
			int num = rand.nextInt(10);
			System.out.println("num : " + num);
			if (num == 5) {	// "종료조건"
				break;	// 자신과 가장 가까운 반복문의 바깥으로 즉시 이동!
			}
		}
		
	}
}
