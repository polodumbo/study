package javaStudy.Exception;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		//5개의 정수만 입력 받기
		//	무한 입력 상태로 구현
		//	q를 입력하면 나가기
		//	5개의 정수는 배열에 담기
		//	if문은 딱 한 번만 사용하기
		
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 입력[q:나가기]";
		int[] arData = new int[5];
		int index = 0;
		String temp = null;
		
		while(true) {
			System.out.println(++index + msg);
			temp = sc.next();
			if(temp.toLowerCase().equals("q")) {break;}
			try {
				arData[index - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력하세요.");
				index --;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개만 입력하세요.");
				for (int i = 0; i < arData.length; i++) {
					System.out.print(arData[i] + " ");
				}
				break;
			} catch (Exception e) {
				System.out.println("어떻게 하면 이것이 출력되는지...?");
				System.out.println(e);
			}
		}
	}
}
