package class05;

import java.util.ArrayList;
import java.util.Scanner;

//	예제)
//	1. main에 정수만 저장하는 배열리스트가 있음
//	2. 데이터를 5개 저장(0이 포함되게)
//	3. 단, 중복 허용 X
//	4. 인덱스 번호를 입력) 
//	5. 10 / [배열리스트에 저장된 값]
//	6. 다양한 예외를 처리해주세요!
//	모듈화 도전 > 예외처리 미루기

public class Test02 {
	public static ArrayList<Integer> addNum(ArrayList<Integer> numList, int size) {
		Scanner sc = new Scanner(System.in);
		while (numList.size() < size) {
			int num = 0; // arrayList에 삽입할 변수
			try {
				System.out.print(numList.size() + "번째 인덱스에 저장할 정수 입력) ");
				num = sc.nextInt();
			} catch (Exception e) {
				System.out.println("제대로 입력해주세요\n");
				sc.nextLine();
				continue;
			}
			if (numList.contains(num)) {
				System.out.println("이미 저장되어 있는 정수입니다.\n");
				continue;
			}
			numList.add(num);
			
			System.out.println(numList);
			System.out.println();
		}
		return numList;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		while (true) {
			int act = 0;
//			while (numList.size() < 5) {
//				int num = 0; // arrayList에 삽입할 변수
//				try {
//					System.out.print(numList.size() + "번째 인덱스에 저장할 정수 입력) ");
//					num = sc.nextInt();
//				} catch (Exception e) {
//					System.out.println("제대로 입력해주세요\n");
//					sc.nextLine();
//					continue;
//				}
//				numList.add(num);
//				
//				System.out.println(numList);
//				System.out.println();
//			}
			System.out.println("정수 몇 개를 입력하시겠습니까? ");
			System.out.print("입력) ");
			act = sc.nextInt();
			addNum(numList, act);
			
			int index = 0; // 인덱스 번호 입력 받을 변수
			while (true) {
				try {
					System.out.println("10을 무엇으로 나눌까요? 인덱스 번호를 입력해주세요.");
					System.out.print("입력) ");
					index = sc.nextInt();
				} catch (Exception e) { // 인덱스 범위 밖 예외
					System.out.println("0부터 " + numList.size() + " 사이의 수를 입력해주세요.");
					sc.nextLine();
				}
				if (index >= 0 && index < numList.size()) { // 0~4 종료
					break;
				}
			}
			
			try {
				System.out.println(10 / numList.get(index));
			} catch (Exception e) { // 0으로 나눌 때 예외
				System.out.println("0으로는 나눌 수 없습니다...");
				continue;
			}
			
			if(act == -1) {
				break;
			}
		}
		
		

	}
}
