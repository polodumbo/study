package javaStudy.Class;

public class MethodTest {
	
	// f(x) = 2x + 1
	// 단, x는 정수다.
	int f(int x) {
		int result = 2 * x + 1;
		return result;
	}
	
	// 1~10 println()으로 출력하는 메소드
//	void prt1To10() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1);
//		}
//	}
	
	// "홍길동"을 n번 println()으로 출력하는 메소드
//	void prtHongN(int count)	{
//		for (int i = 0; i < count; i++) {
//			System.out.println("홍길동");
//		}
//	}
	
	// 이름을 n번 println()으로 출력하는 메소드
//	void prtNameN(String name, int count)	{
//		for (int i = 0; i < count; i++) {
//			System.out.println(name);
//		}
//	}
	
	// 세 정수의 뺄셈을 해주는 메소드
//	int subThree(int num1, int num2, int num3) {
//		int result = num1 - num2 - num3;
//		return result;
//	}
	
	// 두 정수의 나눗셈을 해주는 메소드(몫과 나머지)
//	String div(int num1, int num2) {
//		int result1 = num1 / num2;
//		int result2 = num1 % num2;
//		return "몫 : " + result1 + " 나머지 : " + result2;
//	}
	
	// 1~n의 합을 구해주는 메소드
//	int totalize(int n) {
//		int total = 0;
//		for (int i = 0; i < n; i++) {
//			total += i;
//		}
//		return total;
//	}
	
	// 문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	String lowerUpper(String str) {
//		String result = "";
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if (c >= 65 && c <= 90) {
//				result += (char)(c + 32);
//			}else if (c >= 97 && c <= 122) {
//				result += (char)(c - 32);
//			}else {
//				result += c;
//			}
//		}
//		return result;
//	}
	
	// 문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//	int countLetter(String str, char c) {
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == c) {
//				++count;
//			}
//		}
//		return count;
//	}
	
	// 5개의 정수를 입력받은 후 원하는 번째 값을 구해주는 메소드
//	int getValue(int[] arNum, int index) {
//		return arNum[index - 1];
//	}
	
	// 한글을 정수로 바꿔주는 메소드
	// 입력 예) 일공이사
	// 출력 예) 1024
//	int changeHan(String str) {
//		String hangle = "공일이삼사오육칠팔구";
//		String result = "";
//		
//		for (int i = 0; i < str.length(); i++) {
//			result += hangle.indexOf(str.charAt(i));
//		}
//		return Integer.parseInt(result);
//	}
	
	// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 void형 메소드
	// 메소드 안에서 출력하지 않는다.
	// 리턴 타입은 void이다.
//	void getMaxMin(int[] arData, int[] result) {
//		result[0] = arData[0];
//		result[1] = arData[0];
//		
//		for (int i = 1; i < arData.length; i++) {
//			if (result[0] < arData[i]) {result[0] = arData[i];}
//			if (result[1] < arData[i]) {result[1] = arData[i];}
//		}
//	}
	
	// 3개의 정수를 입력 받고 세 정수의 곱셈을 구하는 메소드
//	int multiply(int[] arData) {
//		int result = 1;
//		for (int i = 0; i < arData.length; i++) {
//			result *= arData[i];
//		}
//		return result;
//	}
	
	// 3개의 정수를 입력 받고 세 정수의 곱셈을 구하는 메소드
	// 심화 : void형으로 구현(리턴 없이!)
//	void getMulti(int[] arData, int[] result) {
//		result[0] = 1;
//		for (int i = 0; i < arData.length; i++) {
//			result[0] *= arData[i];
//		}
//	}
	
}
