package class06;

import java.util.Random;

// 학생: 이름, 성적, 등급, 인사()
class Student {
	String name;
	int score;
	char grade;
	
	void hello() {
		System.out.println("학생이름: " + this.name);
		System.out.println("성적: " + this.score + "점");
		System.out.println("등급: " + this.grade);
		System.out.println();
	}
	
	void setScore() {
		Random rand = new Random();
		System.out.println("점수를 랜덤으로 생성합니다...");
		this.score = rand.nextInt(101);
		System.out.println(this.score + "점입니다.");
	
		if (this.score >= 80) {
			this.grade = 'A';
		} else if (this.score >= 60) {
			this.grade = 'B';
		} else {
			this.grade = 'C';
		}
		System.out.println(this.grade + "등급입니다.");
		System.out.println();
	}
	
	Student() {
		// System.out.println("기본 생성자가 기본 제공되는 중...");
		System.out.println("기본 생성자-생성자 오버로딩 중으로, 더 이상 기본 제공 X");
	}
	
	Student(String name, int score, char grade) {
		this.name = name;
		this.score = score;
		this.grade = grade;
		System.out.println("내가 정의한 생성자");
	}
	
}

public class Test01 {

	public static void main(String[] args) {

		// 객체화(인스턴스화)
		Student s1 = new Student();
		
		Student s2 = new Student();
		s2.name = "임꺽정";
		s2.score = 79;
		s2.grade = 'B';
		
		Student s3 = new Student("홍길동", 100, 'A');
		
		s1.hello();
		s2.hello();
		s3.hello();
		
		s2.setScore();
		s3.setScore();
		
		s2.hello();
		s3.hello();
	}

}
