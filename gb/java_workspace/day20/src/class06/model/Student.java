package class06.model;

public class Student {
	// Java 외부(DMBS)에 저장되어 있을 데이터를
	// Java 내부로 가져오기 위한 전처리 작업 과정
	private int num; // PK
	private String name; // 이름
	private int score; // 점수

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
		return "Strudent [num=" + num + ", name=" + name + ", score=" + score + "]";
	}

	// 현재 DB가 없기 때문에 임의로 데이터 생성
	public void startModel() {
		this.num = 101;
		this.name = "홍길동";
		this.score = 91;
	}

	public boolean check(int num) {
		if (this.num == num) {
			return true;
		}
		return false;
	}

}
