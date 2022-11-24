package class06;

class Student {
	private String name;
	private int score;
	private char grade;

	// getter : 데이터를 받아오고 싶어
	public String getName() {
		return name;
	}

	// setter : 데이터를 설정해주고 싶어
	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

}

public class Test02 {
	public static void main(String[] args) {
		Student stu = new Student();
//		stu.score = 0;
//		stu.grade = 'F';
		// 1. 이렇게 정보를 바꿀 수 있는 권한이 있는지
		// 2. 개발자가 실수하기가 너무나도 쉬움
		stu.setName("홍길동");
		System.out.println(stu.getName());
	}
}
