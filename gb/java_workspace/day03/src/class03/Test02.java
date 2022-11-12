package class03;

public class Test02 {

	public static void main(String[] args) {

//		예제 2)
//		1~1000까지의 소수인 정수들만 출력
//		ex) 2 3 5 7 11 13 17 19 23
		
		int num = 1;	// 처음 시작할 숫자
		
		while (num <= 1000) {	// num이 1000보다 작은 동안
			int cnt = 0;	// 약수 개수
			int i = 1;
			while (i <= num) {	// 1 ~ num
				if (num % i == 0) {	// i가 num의 약수라면
					cnt++;
				}
				i++;
			}
			if (cnt == 2) {
				System.out.print(num + " ");
			}
			num++;
		}
		
	}

}
