package class01.model;

public class StudentVO {
	private int num;
	private String name;
	private int score;
	private int age;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentVO [num=" + num + ", name=" + name + ", score=" + score + ", age=" + age + "]";
	}
	
	// 웹에서 주로 사용하게 될 "기본 생성자"
	// + setter x N
	public StudentVO() {
		
	}

	// 자바에서 샘플 데이터를 만들 때 주로 사용하게 될 생성자
	public StudentVO(int num, String name, int score, int age) {
		this.num = num;
		this.name = name;
		this.score = score;
		this.age = age;
	}

}
