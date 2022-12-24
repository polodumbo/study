package diceGame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
//		[주사위 게임]
//		돈을 넣습니다. 500원에 1판
//		주사위x2	> [1][6] : 7점
//				> [1][1] : 2점 x2(더블, 한 번 더) = 4점
//				> [1][1] : 2점 x2(더블) > 2연속 더블 = 0점 [종료]
//
//		ex)
//		1000원	[1][5]
//				[2][3]
//				총 11점
//
//		1000원	[1][1]
//				[2][3]
//				[2][4]
//				총 15점
//
//		1000원	[2][2]
//				[2][2]
//				총 0점
		
		// 1. 필요한 변수
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int money = 0; // 투입액
		int round = 0; // 판수
		int change = 0; // 잔돈
		int dice1, dice2;
		int cnt = 0; // 더블 카운트
		int score = 0; // 판 점수
		int total = 0; // 총점
		String msg = "";

		System.out.println("🎲🎲주사위게임🎲🎲");
		System.out.println("더블이 나올 때마다 한 판 더 진행되고");
		System.out.println("두 번 연속으로 나오면 0점으로 게임이 끝납니다.");

		// 2. 입력값 유효성 검사
		while (true) {
			System.out.print("1판에 500원\n돈을 넣어주세요(원) : ");
			money = sc.nextInt();

			if (money >= 500) { // 종료 조건
				break;
			}
			System.out.println("500원 이상을 넣어주세요.\n");
		}

		round = money / 500;
		change = money % 500;

		System.out.print(money + "원을 넣으셨습니다. " + round + "판의 게임이 진행됩니다.");
		if (change != 0) {
			System.out.print(" 잔돈 " + change + "원이 반환되었습니다.");
		}
		System.out.println();

		// 3. 돈 넣은 만큼 주사위 굴리기 반복
		for (int i = 0; i < round; i++) { // 몇 판 진행할지 아니까 for문
			msg = ""; // 한 판 끝날 때마다 초기화
			dice1 = rand.nextInt(6) + 1;
			dice2 = rand.nextInt(6) + 1;
			score = dice1 + dice2; // 해당 판 점수

			// 4. 더블 나오면 한 번 더 , 점수 2배
			if (dice1 == dice2) { // 두 주사위의 눈이 같다면
				round++; // 더블이니까 한 판 더
				cnt++; // 더블 카운트 + 1
				score *= 2; // 점수 더블
				if (cnt == 2) { // 더블 문구
					msg = " 앗 이런! 2연속 더블입니다. 게임을 종료합니다...";
				} else {
					msg = " 더블! 한 판 더!";
				}
			} else {
				cnt = 0; // 더블이 아니라면 카운트 0
			}
			
			total += score; // 총점 누적
			
			msg = "[" + dice1 + "] [" + dice2 + "] : " + score + "점" + msg; // 점수 뒤에 더블 여부 추가
			System.out.println(msg);

			if (cnt == 2) { // 5. 연속 더블 == 점수 0 , 바로 종료
				total = 0;
				System.out.println();
				break;
			}
			System.out.println("남은 횟수 : " + (round - i - 1) + "번\n");
		}
		System.out.println("총 " + total + "점");
		
	}

}
