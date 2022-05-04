package javaStudy.Java_lang.Object;

public class ToStringTest_Student {
	private static int seq;
	private int num;
	private String name;
	
	//static 필드
	//단 한 번만 실행
	static {
		System.out.println("[학생 관리 프로그램]");
	}
	
	//초기화 필드
	//생성자가 호출될 때마다 실행
	{
		System.out.println("학생이 한 명 추가되었습니다.");
		this.num = ++seq;
	}
	
	public ToStringTest_Student() {;}
	
	public ToStringTest_Student(String name) {
		super();
		this.name = name;
	}

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
	
	@Override
	public String toString() {
		String str = this.num + ". " + this.name;
		return str;
	}
	
}
