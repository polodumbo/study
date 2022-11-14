package class05;

// 별찍기
public class Test02 {

	public static void main(String[] args) {
		
		// ***
		// ***
		for (int i = 0; i < 2; i++) { // 줄 수
			for (int j = 0; j < 3; j++) { // 별 개수
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 0; i < 5; i++) { // 줄 수
			for (int j = 0; j <= i; j++) { // 별 개수
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * i	i < 5	j	j <= i
		 * -------------------------
		 * 0	T		0	T		i = 0, j = 0 T
		 * 				1	F		i = 0, j = 1 F
		 * 1	T		0	T		i = 1, j = 0 T
		 * 				1	T		i = 1, j = 1 T
		 * 				2	F		i = 1, j = 2 F
		 * 2	T		0	T
		 * 				1	T
		 * 				2	T
		 * 				3	F
		 * 3	T
		*/
		
		System.out.println();
		
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 0; i < 5; i++) { // 줄 수
			for (int j = 0; j < 5 - i; j++) { // 별 개수
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * i	i < 5	j	???
		 * ----------------------
		 * 0	T		0	T	i = 0, j = 0	5-i가 j보다 클 때
		 * 				.
		 * 				.
		 *  	 		4	T	i = 0, j = 4	j < 5 - i
		 *  	 		5	F	i = 0, j = 5
		 * 1	T		0	T	i = 1, j = 0
		 * 				.
		 * 				.
		 *  	 		3	T	i = 1, j = 3
		 *  	 		4	F	i = 1, j = 4
		 * 
		*/
	}

}
