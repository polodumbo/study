package task;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

//		과제1)
//		정수 2개 입력
//	
//		정수1 : 2
//		정수2 : 10
//		2의 10승은 1024입니다.
//	
//		정수1 : 10
//		정수2 : 2
//		10의 2승은 100입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		// 정수 2개 입력
		while (true) {
			System.out.print("밑 : ");
			num1 = sc.nextInt();
			System.out.print("지수 : ");
			num2 = sc.nextInt();
			
			if (num1 != 0) {	// 종료조건
				break;
			}
			System.out.println("밑은 0이 아닌 수를 입력해야 합니다.");
		}
		
		int rst = 1;	// 값
		// num2번 반복 > for문이 더 어울리나 아직 배우지 않음
		String rstMsg = "";
		int i = 1;
		
		if (num2 != 0) {	// 지수가 0이 아니라면
			int tmp = 0;
			if (num2 < 0) {	// 지수가 음수라면 양수로
				tmp = num2;
				num2 *= -1;
			}
			
			while (i <= num2) {	// 지수만큼 제곱	
				rst *= num1;
				i++;
			}
			
			rstMsg = "" + rst;
			if (tmp < 0) {	// 음수였던 지수 다시 음수로
				num2 = tmp;
			}
		} else {	// 지수가 0이라면
			rst = 1;	//  값 = 1
		}
		
		if (num2 < 0) {	// 지수가 음수라면
			rstMsg = "1/" + rst;
		}
		System.out.println(num1 + "의 " + num2 + "승은 " + rstMsg + "입니다.");
	}

}
