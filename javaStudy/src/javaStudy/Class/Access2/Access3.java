package javaStudy.Class.Access2;

import javaStudy.Class.Access1.Access1;

public class Access3 extends Access1 {
	public static void main(String[] args) {
		// default인 a1은 다른 패키지에서 사용 불가능
		Access1 a1 = new Access1();
		
		// public : 어디서든 접근 가능
		Access1 a2 = new Access1();
		
		// protected인 a3는 다른 패키지에서 사용 불가능하나 자식 클래스에서는 사용 가능
		Access3 a3 = new Access3();
		
		a1.setData4(400);
		System.out.println(a1.getData4());
	}
}
