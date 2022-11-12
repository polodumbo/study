package class03;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {

//		예제 1)
//		10~99 사이의 값을 랜덤으로 생성해서 num 변수에 저장
//		num = ?? 출력
//		약수들을 모두 출력하세요
		
		Random rand = new Random();
		int num = rand.nextInt(90) + 10;
		System.out.println("num = " + num);
		
		int i = 1;	// 약수
		int cnt = 0;	// 약수의 개수
		String nums = " ";	// 약수들
		
		while (i <= num) {
			if (num % i == 0) {
				cnt++;
				nums += i + " ";
			}
			i++;
		}
		System.out.println("정수 " + num + "의 약수는 [" + nums + "]로 총 " + cnt + "개입니다.");
		
	}

}
