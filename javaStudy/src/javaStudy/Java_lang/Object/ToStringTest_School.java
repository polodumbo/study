package javaStudy.Java_lang.Object;

public class ToStringTest_School {
	public static void main(String[] args) {
		ToStringTest_Student polo = new ToStringTest_Student();
		ToStringTest_Student hong = new ToStringTest_Student("홍길동");
		polo.setName("polodumbo");
		
		//.toString()
		System.out.println(polo.toString());
		System.out.println(polo);
		System.out.println(hong);
	}
}
