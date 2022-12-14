package jdbc;

// 테이블형 데이터를 Java의 객체 형태의 객체로
public class MemberVO {
	private int num;
	private String name;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	public MemberVO() {
		
	}

	public MemberVO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

}
