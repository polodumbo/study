package class02;

public class Test02 {

	public static void main(String[] args) {
		
		// 소수 : 약수가 1과 자기 자신인 수
		// 1 2 3 5 7 11 13 17 19 23 ...
		// 1을 제외하고 약수가 2개인 수
		
		int num = 2;
		int cnt = 0;	// 약수의 개수
		int i = 1;
		while (i <= num) {
			if (num % i == 0) {	// i가 num의 약수라면
				cnt++;	// 약수를 찾은 것!
			}
			i++;
		}
		
		if (cnt == 2) {	// num가 소수라면
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 약수가 " + cnt + "개로 소수가 아닙니다.");
		}
		
		/*
		 * num	i	cnt	i <= num	num % i == 0	// 약수일 때만 cnt++
		 * --------------------------------------
		 * 3	1	0		T		T
		 * 		2	1		T		F
		 * 		3			T		T
		 * 		4	2
		 * 
		 * cnt == 2
		 * --------------------------------------
		 * 		T	 : 소수 O
		 */		
		
	}

}
