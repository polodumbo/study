package javaStudy.Class.AbstractTest;

public class Refrigerator extends Electronics{

	@Override
	void on() {
		intro();
		System.out.println("스위치를 올린다.");
	}

	@Override
	void off() {
		System.out.println("스위치를 내린다.");
	}
	
}
