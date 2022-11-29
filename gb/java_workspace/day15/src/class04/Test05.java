package class04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//	문제)
//	데이터를 입력
//	1~100 정수만 입력
//	1~100이 아니면 저장 X
//	
//	입력: ?
//	
//	저장된 정수가 5개면 종료
//	홀수가 몇 개인지 출력
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		int oddCnt = 0;
		
		while (true) {
			System.out.print("1~100 사이의 정수 입력: ");
			int num = sc.nextInt();
			
			if (num < 1 || num > 100) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			set.add(num);
			
			if (set.size() == 5) {
				System.out.println("\n정수 5개를 입력하셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		for (Integer v : set) {
			if (v % 2 == 1) {
				oddCnt++;
			}
		}
		
		System.out.println("홀수는 총 " + oddCnt + "개");
		
	}
}
