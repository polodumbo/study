package javaStudy.Basic;

public class CastingTest {
	public static void main(String[] args) {
		// CastingTest01
		// 자동 형변환
		System.out.println(11 / 9);
		System.out.println(11 / 9.0);
		
		// 강제 형변환
		System.out.println(11 / (double)9);
		System.out.println((int)8.43 + 2.59);
		System.out.println(8.43 + (int)2.59);
		System.out.println((int)(8.43 + 2.59));
		
		// 8.43 + 2.59 = 10
		System.out.println((int)8.43 + (int)2.59);

		// CastingTest02
		// ASCII
		char dataA = 65;	// A
		char dataB = 97;	// a
		char dataC = 48;	// 0
		System.out.println(dataA);
		System.out.println(dataB);
		System.out.println(dataC);
		System.out.println((char)(dataA + 5));	// (char)(65 + 5)
		
		// CastingTest03
		System.out.println(1 + "3");	// 연결
		System.out.println(1 + "" + 9);
		System.out.println(1 + 9 + "");
		
		// 두 정수를 더하여 결과가 정수로 나오게 하기
		String data1 = "1";
		String data2 = "3";
		System.out.println(data1 + data2);
//		System.out.println((int)data1 + (int)data2);
		System.out.println(Integer.parseInt(data1) + Integer.parseInt(data2));
	}
}
