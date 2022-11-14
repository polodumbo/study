package task;

public class Task04 {

	public static void main(String[] args) {
		
//		별 찍기 4)
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (5 - i) * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * i	i < 5	j	???	k	???
		 * ---------------------------------
		 * 0	T		0	F	0	T		j는 i보다 작을 때 T
		 * 						1	T		j < i
		 * 						8	T		
		 * 						9	F		k는 (5 - i) * 2 - 1 보다 작을 때 T
		 * 1	T		0	T				k < (5 - i) * 2 - 1
		 * 				1	F	0	T		
		 * 						1	T		
		 * 						6	T		
		 * 						7	F
		*/
		
		

	}

}
