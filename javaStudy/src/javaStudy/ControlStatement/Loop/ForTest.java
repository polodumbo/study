package javaStudy.ControlStatement.Loop;

import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
		// 이름 10번 출력
		for (int i = 0; i < 10; i++) {
			System.out.println("polodumbo");
		}
		
		// 이름 10번 출력하되, 이름 앞에 1~10 번호를 붙여서 출력한다.
		// 초기값은 0으로 하고 1씩 증가한다.
		for (int i = 0; i < 10; i += 1) {	// i += 1 : i++
			System.out.println(i + 1 + ".polodumbo");
			
		}
		
		// 이름 10번 출력하되, 이름 앞에 10~1 번호를 붙여서 출력한다.
		// 초기값은 0으로 하고 1씩 증가한다.
		for (int i = 0; i < 10; i++) {
			System.out.println(10 - i + ".polodumbo");
		}
		
		// 1~10 중 4까지만 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
			if (i == 3) {break;} 
//			if (i == 3) break;	// {}를 생략할 수는 있지만 하지 말자
//			if (i == 3) {	// 한 줄 짜리 코드는 한 줄로 쓰도록 하자
//				break;
//			}
		}
		
		// 1~100 출력
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1);
		}
		
		// 100~1 출력
		for (int i = 0; i < 100; i++) {
			System.out.println(100 - i);
		}
		
		// 1~100 중 짝수만 출력
		for (int i = 0; i < 50; i++) {
			System.out.println((i + 1) * 2);
		}
		
		// 1~10 합 출력
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += i + 1;
		}
		System.out.println(total);
		
		// 1~n 합 출력
		Scanner sc = new Scanner(System.in);
		String msg = "1~n의 합 출력\nn : ";
		int end = 0;
		total = 0;
		
		System.out.print(msg);
		end = sc.nextInt();
		for (int i = 0; i < end; i++) {
			total += i + 1;
		}
		System.out.println(total);
		
		// A~F 출력
		for (int i = 0; i < 6; i++) {
			System.out.print((char)(i + 65));
		}
		
		// A~F 중 C 제외하고 출력하기
		for (char i = 'A'; i < 'G'; i++) {
			if(i == 'C') {continue;}
			System.out.print(i);
		}
		
			// 위 문제 형변환을 사용해서
		for (int i = 0; i < 6; i++) {
			if (i != 2) {
				System.out.print((char)(i + 65));
			}
		}
		
			// 위 문제 삼항 연산자로
		for (int i = 0; i < 5; i++) {
			System.out.print((char)(i > 1 ? i + 66 : i + 65));
		}
		
		// 0 1 2 3 0 1 2 3 0 1 2 3 출력
		for (int i = 0; i < 12; i++) {
			System.out.print(i % 4 + " ");
		}
		
		// aBcDeFg...Z 출력
		for (int i = 0; i < 26; i++) {
			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
		}
	}
}
