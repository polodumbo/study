package javaStudy.Basic;

public class PrintTest {
	public static void main(String[] args) {
		// print() : 괄호 안에 있는 값을 그대로 출력, 마지막에 자동으로 줄바꿈 X
		System.out.print("polodumbo");
		System.out.print("20살");

//		제어 문자 : 반드시 따옴표 안에서 작성한다.
//		\n : new line, 줄 바꿈, 개행 문자
//		\t : tab
//		\" , \', \\
		
//		System.out.print("\"polodumbo\"");
//		System.out.print("\n20살");

		// println() : 괄호 안에 있는 값을 그대로 출력, 마지막에 자동으로 줄바꿈 O
		System.out.println("polodumbo");
		System.out.println("20살");
		
		// printf() : 서식문자를 사용하여 출력할 수 있으며, 마지막에 자동으로 줄바꿈 X
//		서식문자(format)
//		반드시 따옴표 안에서 작성하고 %와 함께 사용한다.
//		자칫 길게 작성될 수 있는 여러 변수의 코드를 보기 쉽게 한 줄에 표시가 가능하다.
		
//		%d : 정수(10진수)
//		%f : float(실수), double(실수)	// %.2f 등으로 소수의 자리수를 자를 때에는 반올림이 된다.
//		%c : character(문자)
//		%s : String(문자열)
		
		String name = "polodumbo";
		int age = 20;
		double weight = 25.68;
				System.out.printf("이름 : %s\n", name);
		// 나이를 서식문자를 활용해서 출력
		System.out.printf("나이 : %d살\n", age);
		// 소수점을 자를 때에는 반올림 된다.
		System.out.printf("몸무게 : %.2kg\n", weight);
	}
}
