package class08;

import java.util.Random;
import java.util.Scanner;

//		예제) 가위 바위 보
public class Test02 {

	public static void main(String[] args) {
		
//		int me = 정수 입력: 1 > 가위
//							2 > 바위
//							3 > 보
//							
//		int com = 랜덤으로 1 ~ 3 중 1개 저장
//		무승부, 이겼다, 졌다
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("1 - 가위, 2 - 바위, 3 - 보");
		System.out.print("정수를 입력하세요 : ");
		int me = sc.nextInt();
		
		if (me < 1 || 3 < me) {
			System.out.println("잘못 입력해서, 랜덤 지정됩니다...");
			me = rand.nextInt(3) + 1; // 0~2 -> 1~3
		}
		
		int com = rand.nextInt(3) + 1;
		
		String meW = "";	// 내가 낸 거
		String comW = "";	// 상대가 낸 거
		String rst = "";	// 승부 결과
		
		meW = me == 1 ? "가위" : me == 2 ? "바위" : "보";
		comW = com == 1 ? "가위" : com == 2 ? "바위" : "보";
		
		// 내 코드
//		if (me == com) {
//			rst = "무승부";
//		} else if (me == 1) {	// 가위 : 바위
//			rst = com == 2 ? "내가 졌다..." : "내가 이김!";
//		}  else if (me == 2) {	// 바위 : 보
//			rst = com == 3 ? "내가 졌다..." : "내가 이김!";
//		}  else if (me == 3) {	// 보	: 가위
//			rst = com == 1 ? "내가 졌다..." : "내가 이김!";
//		} 
		
		// 강사님 코드
		if (me == com) {
			rst = "무승부";
		} else if (me % 3 + 1 == com) {
			rst = "짐...";
		} else {
			rst = "이김! :D";
		}
		
		/*
		 * 내가 지는 상황
		 * 1%3+1 -> 2
		 * 2%3+1 -> 3
		 * 3%3+1 -> 1
		*/
		
		System.out.println("나 : " + meW + ", 상대 : " + comW + "\n" + rst);
	}

}
