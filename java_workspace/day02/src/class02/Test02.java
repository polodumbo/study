package class02;

public class Test02 {

	public static void main(String[] args) {
		
		// 양자택일
		// ex) 홀짝, 양수음수, ab, ...
		int num = 10;
		if (num % 2 == 0) {
			System.out.println("짝수");
		}
		if(num % 2 == 1) {
			System.out.println("홀수");
		}
		// 9 -> 10 -> 11 -> 12 -> 13(F)
		
		int num2 = 10;
		if (num2 % 2 == 0) {
			System.out.println("짝수");
		}
		else { // "if 조건식이 아니라면"
			System.out.println("홀수");
		}
		// 18 -> 19 -> 20 -> 21
		
		
	}

}
