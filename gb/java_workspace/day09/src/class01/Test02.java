package class01;

// this
class Person {
	// 멤버변수
	String name;
	int age;
	String gender;
	String addr;
	
	void info() {
		System.out.println(this.name);
	}
	
	Person(String name, int age, String gender, String addr) {
		// 지역변수(일반변수)
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
	}
}

public class Test02 {

	public static void main(String[] args) {

	}

}
