package class02;

public class Test01 {

	public static void main(String[] args) {

		// 중첩
//		int i = 0;
//		while (i < 10) {
//			if (i % 2 == 1) {
//				System.out.println("i = " + i);
//			}
//			i++;
//		}

		// [약수]
		int num = 6;
		int i = 1;	// i = 6의 약수
		
		/*
		 * num	i	i <= num	num % i == 0
		 * ---------------------------------------
		 * 6	1		T		T		-> 1
		 * 		2		T		T		-> 2
		 * 		3		T		T		-> 3
		 * 		4		T		F
		 * 		5		T		F
		 * 		6		T		T		-> 6
		 * 		7		F
		*/	
		
		while (i <= num) {	// i가 6이 될 때까지
			if (num % i == 0) {
				System.out.println("i = " + i);
			}
			i++;
		}
		System.out.println("최종 i = " + i);

	}
}
