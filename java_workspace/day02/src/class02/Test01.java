package class02;

public class Test01 {

	public static void main(String[] args) {

		// 가독성을 위해,
		// "주석"
		// "줄 정렬" : 전체 선택 > Ctrl + I

		// ☆ "더 나은 코드"
		// : 반복되는 로직을 제거한 코드
		int age = 11;
		int total = 0;	// 최종 금액

		// 9세 이상 20세 미만은 1000원
		if (9 <= age && age < 20) {
			total = 1000;
		}
		// 20세 이상 65세 미만은 2000원
		if (20 <= age && age < 65) {
			total = 2000;
		}
		
		// 8세 이하 65세 이상은 무료
		System.out.println(total + "원");

	}

}
