package javaStudy.Array;

public class StringTest {
	public static void main(String[] args) {
//		char[] name = {'T', 'o', 'm'};
//		String str = "Tom";	// 3칸의 문자배열로 볼 수 있어야 된다.
		
		String data = "ABC";
		String scores = "10,20,30,40";
		String[] arScore = {"50", "60", "70", "80", null};
		
		System.out.println(data.length());	// 문자열의 문자 배열 길이에 접근하는 String 클래스 안에 있는 메소드
		System.out.println(data.charAt(1));	// 문자열의 해당 문자 인덱스에 접근
		System.out.println(scores.split(",")[1]);
		System.out.println(arScore[1]);
		
		scores.split(",");	// 문자열 배열, 반되는 문자를 구분점으로 문자열을 쪼개어 배열에 담는 메소드
		// scores.split(",")는 4칸 문자열 배열의 시작 주소이다.
		// arScore라는 문자열 배열에 위 배열의 시작주소를 대입한다.
		// 자료형이 서로 같기 때문에 가능하다.
		arScore = scores.split(",");
		System.out.println(arScore.length);
	}
}
