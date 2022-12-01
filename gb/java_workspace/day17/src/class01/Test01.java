package class01;

import java.util.InputMismatchException;
import java.util.Scanner;

// [예외처리 복습]
public class Test01 {
	public static void main(String[] args) {
		// 예외 : 컴파일 시에는 문제 X
		//			실행 시 문제가 발생하는 현상
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		try {
			System.out.print("정수 입력) ");
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요 d^~^b");
		} catch (Exception e) { // 최상위 Exception은 마지막에 작성
			e.printStackTrace(); // 로그 출력
		} finally {
			System.out.println("예외 발생 셔부와 무관하게 항상 수행되는 문장");
		}
		
		System.out.println("num: " + num);
		
		
	}
}
