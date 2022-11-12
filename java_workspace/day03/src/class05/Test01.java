package class05;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		// 숫자 맞추기 게임
		// 1 ~ 100 랜덤으로 값 저장
		// 사람이 맞출 거임
		// 몇 번 만에 맞추는지 / UP DOWN
		
		// 사용자 편의성 > 좁아지는 범위 알림
		// 유효성 검사 > 범위 내 값 입력
		
		Random rand = new Random();
		
		int com = rand.nextInt(100) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;	// 횟수 카운트, scope
		int ans = 0;	// 사용자의 답
		int L = 1, H = 100;	// 사용자의 편의성 고려
		
		while (true) {
			while (true) {	// 유효성 검사	
				System.out.print(L + "~" + H + " 중 정답은? ");
				ans = sc.nextInt();
				if (L <= ans && ans <= H) {
					break;
				}
				System.out.println("똑바로 입력하세용");
			}
			cnt++;	// 카운트
			
			if (com == ans) {	// 종료조건
				System.out.println("정답입니다! :D");
				break;
			}
			// 좁혀지는 범위
			if (ans < com) {	// UP
				System.out.println("UP...");
				L = ans + 1;
			} else {	// DOWN
				System.out.println("DOWN...");
				H = ans - 1;
			}
		}
		System.out.println("당신은 " + cnt + "번만에 맞추셨습니다.");
		
	}

}
