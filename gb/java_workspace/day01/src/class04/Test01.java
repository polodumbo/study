package class04;

public class Test01 {
	// 공개범위 예약어 클래스명
	public static void main(String[] args) {
		// static : 객체와 무관하게
		
		// 단일주석 ★★★★★
		
		/*
		 * 범위주석 여러 줄 주석 처리 가능
		*/
		
		System.out.println("안녕하세요1");	// println : 줄 바꿈 포함
		System.out.print("안녕하세요2");	// print : 줄 바꿈 미포함
		System.out.println("안녕하세요3");
		
		// 변수 : 데이터를 저장하는 공간
			// 메모리
		// 1) 변수 선언
		int a;	// 변수를 선언할 때 값이 필수적이다? X 필수는 아니다.
		// 2) 변수 초기화
		a = 10;	// 값은 변수 3요소가 아니다!(필수 아님)
		System.out.println(a);
		// 3) 변수 선언 + 초기화 = 정의
		int b = 20;
		System.out.println(b);
		// 변수명 => 식별자 -> 소문자 시작
		
	}
}
