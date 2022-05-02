package javaStudy.Lambda;

public class LambdaTest {
	public static void main(String[] args) {
		
//		LambdaInter inter = new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return number % 10 == 0;
//			}
//		};
//		inter.checkMultipleOf10(10);
		
		LambdaInter inter = (n) -> n % 10 == 0;
		System.out.println(inter.checkMultipleOf10(10));	// true
		
		LambdaInter lambda = (number) -> {
			System.out.println("10의 배수 검사");
			return number % 10 == 0;
		};
		System.out.println(lambda.checkMultipleOf10(15));	// false
		
	}
}
