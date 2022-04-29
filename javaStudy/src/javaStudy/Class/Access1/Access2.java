package javaStudy.Class.Access1;

public class Access2 {
	public static void main(String[] args) {
		Access1 a1 = new Access1();	// default : 같은 패키지에서만 접근 가능
		Access1 a2 = new Access1();	// public : 어디서든 접근 가능
	}
}
