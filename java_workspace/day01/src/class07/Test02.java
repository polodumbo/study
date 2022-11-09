package class07;

public class Test02 {

	public static void main(String[] args) {

		// 삼항연산자
		// 조건식 ? 참 : 거짓
		int num = 10 > 20 ? 1 : 2;	// false ? 1 : 2
		System.out.println(num);	// 2
		
		int a = 100;
		int b = 50;
		int max = a > b ? a : b;
		System.out.println(max);
		
		num = 100;
		char res = num % 2 == 0 ? 'E' : 'O';
		System.out.println("num은 " + res);
		
	}

}
