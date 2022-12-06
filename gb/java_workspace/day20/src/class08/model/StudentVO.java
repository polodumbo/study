package class08.model;

public class StudentVO {
	private int num;
	private String name;
	private int score;

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

	@Override
	public String toString() {
		return "StudentVO [num=" + num + ", name=" + name + ", score=" + score + "]";
	}

	public StudentVO() {

	}

	public StudentVO(int num, String name, int score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}

}
