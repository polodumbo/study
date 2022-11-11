package class04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {

		// ☆ "유효성 검사" : 설정된 값이 유효범위에 있는 값인지 검사
		
		//		예제 1) 월 = 정수;
		//		3 ~ 5 봄
		//		6 ~ 8 여름
		//		9 ~ 11 가을
		//		12 ~ 2 겨울
		
		Scanner sc = new Scanner(System.in);
		String weather = "";
		
		System.out.println("몇 월인가요? ");
		int month = sc.nextInt();	// 1~12
		
		if (month >= 3 && month <=5) {	// 3 ~ 5
			weather = "봄";
		} else if (month >= 6 && month <=8) {	// 6 ~ 8
			weather = "여름";
		} else if (month >= 9 && month <=11) {	// 9 ~ 11
			weather = "가을";
		} else if (month == 12 || month == 1 || month == 2) {	// 12 ~ 2
			weather = "겨울";
		} else {	// 유효성 검사
			weather = "없습니다.";
		}
		
		System.out.println(month + "월은 " + weather);
	}
}
