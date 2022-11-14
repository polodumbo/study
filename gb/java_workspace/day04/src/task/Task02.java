package task;

public class Task02 {

	public static void main(String[] args) {
		
//		과제2)
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * i	i < 5	j	???		j	???		
		 * --------------------------------------
		 * 0	T		0	F		0	T	j는 i와 같을 때 F, 작을 때 T
		 * 							1	T	j < i
		 * 							5	F
		 * 1	T		0	T				j는 5-i와 같을 때 F, 작을 때 T
		 * 				1	F		0	T	j < 5 - i
		 * 							4	F
		*/
	}
}
