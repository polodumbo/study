package javaStudy.Java_lang.Object;

public class EqualsTest_Zoo {
	public static void main(String[] args) {
		EqualsTest_Animal cat = new EqualsTest_Animal(1, "고양이");
		System.out.println(cat.equals(new EqualsTest_Animal(1, "고양이")));
	}
	
}
