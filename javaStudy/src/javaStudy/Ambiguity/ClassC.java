package javaStudy.Ambiguity;

public class ClassC implements InterA, InterB {

	@Override
	public void printData() {
		//어느 부모인지 표시
		InterA.super.printData();
	}
	
}
