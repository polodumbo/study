package javaStudy.Array;

import java.util.Scanner;

public class ArTest {
	public static void main(String[] args) {
		
//		int[] arData = {3, 5, 1, 9, 7};
//		System.out.println(arData);
//		// 5, 4, 3, 2, 1 넣고 출력하기
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 5 - i;
//			System.out.println(arData[i]);
//		}
		
		// 1~10 배열에 담고 출력
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			System.out.println(arData[i]);
//		}
		
		// 10~1 중 짝수만 배열에 담고 출력
//		int[] arData = new int[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5 - i) * 2;
//			System.out.println(arData[i]);
//		}
		
		// 1~100 배열에 담은 후 홀수만 출력
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			if (arData[i] %2 == 1) {
//				System.out.println(arData[i]);
//			}
//		}
		
		// 1~100 배열에 담은 후 짝수의 합 출력
//		int[] arData = new int[100];
//		int total = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			if (arData[i] %2 == 0) {
//				total += arData[i];
//			}
//		}
//		System.out.println(total);
		
		// A~F 배열에 담고 출력
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i + 65);
//			System.out.println(arData[i]);
//		}
		
		// A~F 중 C 제외하고 배열에 담은 후 출력
//		char[] arData = new char[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//			System.out.println(arData[i]);
//		}
		
		// 5개의 정수를 입력 받고 배열에 담은 후 최대값과 최소값 출력
//		int[] arData = new int[5];
//		int max = 0, min = 0;
//		String msg = "최대값 : %d, 최소값 : %d";
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(i + 1 + "번째 정수 : ");
//			arData[i] = sc.nextInt();
//		}
//		max = arData[0];
//		min = arData[0];
//		for (int i = 1; i < arData.length; i++) {
//			if (arData[i] > max) {max = arData[i];}
//			if (arData[i] < min) {min = arData[i];}
//		}
//		System.out.printf(msg, max, min);
		
		// 사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력 받고 평균 구하기
//		int[] arData = null;
//		int total = 0;
//		double avg = 0.0;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 n개의 평균 구하기\nn: ");
//		arData = new int[sc.nextInt()];
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(i + 1 + "번째 정수 : ");
//			arData[i] = sc.nextInt();
//			total += arData[i];
//		}
//		
//		// 총 합에서 전체 개수를 나누어 평균을 구한다.
//		avg = (double)total / arData.length;
//		avg = Double.parseDouble(String.format("%.2f", avg));
//		
//		for (int i = 0; i < arData.length; i++) {
//			// 사용자가 입력한 정수를 출력한다.
//			System.out.println(arData[i]);
//			// 맨 마지막 정수 전까지 정수와 정수 사이에 ", "를 출력해준다.
//			if(i != arData.length - 1) {
//				System.out.print(", ");
//			}
//		}
//		System.out.println("\n총 합 : " + total);
//		System.out.println("평균 : " + avg);
		
		// 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
		// 대문자는 모두 소문자로 변경한다.
		// 알파벳이 아닌 문자들은 그대로 유지한다.
//		// 문자열 대입
//		String str = null;
//		// 바뀐 문자열 연결
//		String result = "";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("문자열 : ");
//		str = sc.next();
//		
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			
//			if (c >= 65 && c <= 90) {
//				result += (char)(c + 32);
//			}else if (c >= 97 && c <= 122) {
//				result += (char)(c - 32);
//			}else {
//				result += c;
//			}
//		}
//		System.out.println(result);
		
		// 정수를 한글로 변경
		// 입력 예) 1024
		// 출력 예) 일공이사
//		String hangle = "공일이삼사오육칠팔구";
//					// 0123456789
//		int num = 0;
//		String result = "";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수 입력 : ");
//		num = sc.nextInt();
//		
//		while (num != 0) {
//			result = hangle.charAt(num % 10) + result;
//			num /= 10;
//		}
//		System.out.println(result);
		
	}
}
