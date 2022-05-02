package javaStudy.Exception;

public class ExceptionTest {
	public static void main(String[] args) {
		
		//반드시 실행해야 하는 문장이 출력되도록 try catch를 사용한다.
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("반드시 실행해야 하는 문장");
		
	}
}
