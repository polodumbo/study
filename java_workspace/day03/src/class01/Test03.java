package class01;

public class Test03 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 10;
		
		while (a < b) {
			a += 5;
			b++;
		}
		
		/*
		 * a	b	a < b
		 * -------------
		 * 0	10	T
		 * 5	11	T
		 * 10	12	T
		 * 15	13	F	>	a = 15, b = 13
		*/
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
