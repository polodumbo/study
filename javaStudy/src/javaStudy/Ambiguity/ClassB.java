package javaStudy.Ambiguity;

public class ClassB extends ClassA implements InterA {
	public static void main(String[] args) {
		//printData()의 소속은 InterA이지만 클래스의 우선순위가 인터페이스보다 높기 때문에 ClassA의 것이 사용된다.
		new ClassB().printData();
	}
}
