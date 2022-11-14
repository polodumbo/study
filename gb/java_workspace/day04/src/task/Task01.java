package task;

public class Task01 {

	public static void main(String[] args) {
		
//		과제1)
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * i	i < 5	j	???	j	???
		 * -------------------------------------
		 * 0	T		0	T					i = 0	j = 0	T 	
		 *  	 		1	T					i = 0	j = 3	T	
		 *  	 		2	T					i = 0	j = 4	F
		 *  	 		3	T					i = 1	j = 3	F	
		 *  	 		4	F	0	T
		 *  					1	F			j가 4 - i보다 크거나 같다면 F
		 * 1	T		0	T					j는 4 - i보다 작아야 T
		 *  	 		1	T					j < 4 - i
		 *  	 		2	T		
		 *  	 		3	F	0	T			j는 i보다 1이 클 때 F
		 *  					1	T			j는 i보다 작거나 같아야 T
		 *  					2	F			j <= i
		 *  2	T
		*/
	}

}
