package class04;

// [클래스]
// 클래스 선언, 정의
class Student { // class: 자바의 기본단위, 자료형의 일종
	String name; // 멤버변수, 속성(attribute), 필드
	int score;
	
	// public : 기본 공개
	// static : "객체와 무관하게" - 현재 객체와 관련이 있기 때문에 사용 X
	
	void hello() { // (멤버)함수, 메서드
		System.out.println("저는 " + this.name + "이고, " + this.score + "점입니다.");
	}
}

public class Test02 {

	public static void main(String[] args) {
		// 학생: 이름, 성적, 나이, 주소
		// 학생이라는 "자료형"이 없음!
		// => 학생이라는 "자료형"을 만들어 보자!

		// 객체화(인스턴스화)
		Student stu1 = new Student();
		stu1.name = "홍길동";
		stu1.score = 90;
		
		Student stu2 = new Student();
		stu2.name = "임꺽정";
		stu2.score = 88;
		
		System.out.println(stu1); // 주소
		System.out.println(stu2); // 주소

		stu1.hello();
		stu2.hello();
	}

}
