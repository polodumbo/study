package class03;

import java.util.Scanner;

//[완전수]
public class Test03 {

	public static void main(String[] args) {
		
//		예제 3)	사용자가 정확히 입력한다는 전제 하에
//		정수를 입력 : 
//		입력한 정수가 '완전수'인지 아닌지 출력
//		완전수란? 자기자신을 제외한 약수들의 합이 자기 자신인 것 ex) 6 = 1 + 2 + 3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		int total = 0;
		
		// 약수 구하기
		int i = 1;
		while (i < num) {	// 자신을 제외한
			if (num % i == 0) {
				total += i;	// 약수들의 합
			}
			i++;
		}
		
		if (num == total) {	// 완전수라면 합이 자기 자신
			System.out.println(num + "은 완전수입니다.");
		} else {
			System.out.println(num + "은 완전수가 아닙니다.");
		}
		
	}

}
