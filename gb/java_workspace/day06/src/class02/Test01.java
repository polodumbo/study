package class02;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

//		예제)
//		1. 정수입력: 10
//			저장할 랜덤수 개수
//	
//		2. 범위입력: 20
//			1~10 랜덤범위 설정
//		★ 랜덤수 개수 <= 랜덤 범위
//	
//		3. 중복없이 랜덤값들을 저장
//		[19 20 1]
//	
//		+) 내림차순 정렬
//		[20 19 1]

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

//		1. 정수입력
		System.out.print("랜덤수 개수(정수 입력): ");
		int numOf = sc.nextInt();
//		2. 범위입력
//		★ 랜덤수 개수 <= 랜덤 범위
		int range = 0;
		while (true) {
			System.out.print("랜덤수 범위(정수 입력): ");
			range = sc.nextInt();

			if (range >= numOf) {
				break;
			}
			System.out.println("랜덤수의 범위는 개수(" + numOf + "개) 이상이어야 합니다.");
		}

//		3. 중복없이 랜덤값들을 저장
		int[] arData = new int[numOf]; // 입력한 랜덤수 개수만큼의 배열 생성
		int index = 0; // 빈 index 체크
		int rNum = 0; // 검증 안 된 램덤수 임시저장
		boolean flag = false;

		while (true) {
			flag = false;
			rNum = rand.nextInt(range) + 1; // 입력한 랜덤수 범위 내의 수 삽입

			for (int i = 0; i < index; i++) {
				if (rNum == arData[i]) { // 중복 1개라도 검색되면
					flag = true; // 중복 체크
					break; // 바로 다시 반복
				}
			}
			if (!flag) { // 중복이 아니라면 삽입
				arData[index] = rNum;
				index++;
			} else {
				continue;
			}
			
			// 종료 조건
			if (index == arData.length) { // 배열의 크기만큼 다 채워지면
				break;
			}
		}
		
		System.out.print("정렬 전: [ ");
		for (int i : arData) {
			System.out.print(i + " ");
		}
		System.out.println("]");

		// +) 내림차순 정렬(버블정렬)
		for (int i = 0; i < arData.length; i++) {
			for (int j = 0; j < arData.length - 1; j++) {
				if (arData[j] < arData[j + 1]) {
					int tmp = arData[j + 1];
					arData[j + 1] = arData[j];
					arData[j] = tmp;
				}
			}
		}
		System.out.print("정렬 후 : [ ");
		for (int i : arData) {
			System.out.print(i + " ");
		}
		System.out.println("]");

	}

}
