package class01;

import java.util.Random;
import java.util.Scanner;

// [로또 예제]
public class Test02 {

	public static void main(String[] args) {
		
		/*
		 * 1~15 랜덤수를 4개 생성
		 * 사용자가 랜덤수를 예측
		 * 
		 * 숫자1 : 10
		 * 숫자2 : 15
		 * 숫자3 : 7
		 * 숫자4 : 8
		 * 
		 * 4점 - A, 3~2점 - B, 1점 - C
		 * 
		 * 오름차순
		 * 중복되면 안 됨
		*/
		
		Random rand = new Random();
		int[] arLotto = new int[4];
		// 복권 랜덤수 4개 생성(중복 X)
		// 몇 번 중복될지 알 수가 없다!
		int checkIndex = 0; // 현재 값이 저장된 index
		boolean flag = false; // 플래그 변수(중복인지 아닌지를 확인)
		while (true) {
			// 1. 랜덤수 생성하기
			int rNum = rand.nextInt(15) + 1;
			flag = false; // 반복 돌 때마다 초기화
			System.out.println("rNum = " + rNum);

			// 2. 배열에 저장된 값인지 체크
			// [0]부터 끝까지 전부 검사해도 괜찮으나 만약 랜덤수 범위에 0이 포함된다면 0으로는 비교가 불가능
			for (int i = 0; i < checkIndex; i++) { // 0부터 현재 값이 저장된 index까지
				if (rNum == arLotto[i]) { // 값이 같다면
					flag = true; // 중복이 발생한 것
					break;
				}
//				else {
//					for문이 끝나야 중복 여부를 알 수 있기 때문에 for문 밖에 써야 한다.
//				}
			}
			if (!flag) { // 중복이 발생했다라는 if문에 단 한 번도 안 걸렸다면 중복 아님
				arLotto[checkIndex] = rNum; // 3-2. 새로운 값이 맞다면, 저장
				checkIndex++;
			} else {
				System.out.println("중복!");
				continue; // 3-1. 만약, 중복값이라면 다시 1번으로
			}

			if (checkIndex == arLotto.length) { // 랜덤수 4개를 모두 성공적으로 배열에 저장했을 때
				break;
			}
		}

		// 복권 랜덤수 4개 생성(중복 O)
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = rand.nextInt(15) + 1;
//		}
		
		// 복권 오름차순 정렬
		for (int i = 0; i < arLotto.length; i++) {
			for (int j = 0; j < arLotto.length - 1; j++) {
				if (arLotto[j] > arLotto[j + 1]) {
					int tmp = arLotto[j];
					arLotto[j] = arLotto[j + 1];
					arLotto[j + 1] = tmp;
				}
			}
		}

		// 콘솔에 출력
		System.out.print("[ ");
		for (int i : arLotto) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
		// 상당히 비효율적인 검색 방법
//		Scanner sc = new Scanner(System.in);
//		int score = 0;
//		for (int i = 0; i < arLotto.length; i++) {
//			System.out.print("숫자입력: ");
//			int num = sc.nextInt();
//			
//			for (int j = 0; j < arLotto.length; j++) {
//				if (num == arLotto[j]) {
//					score++;
//					break;
//				}
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int L = 0;
		int H = 0;
		int M = 0;
		int num = 0;

		for (int i = 0; i < arLotto.length; i++) {
			L = 0;
			H = arLotto.length - 1;
			System.out.print("숫자입력: ");
			num = sc.nextInt();

			while (true) {
				M = (L + H) / 2;

				if (num == arLotto[M]) {
					score++;
					System.out.println("로그 : 찾음");
					break;
				} else if (num > arLotto[M]) {
					L = M + 1;
				} else {
					H = M - 1;
				}

				if (L > H) {
					System.out.println("로그 : 못 찾음");
					break;
				}
			}
		}

		if (score >= 4) {
			System.out.println("A");
		} else if (score >= 2) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

	}

}
