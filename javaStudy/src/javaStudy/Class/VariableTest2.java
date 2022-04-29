package javaStudy.Class;

public class VariableTest2 {
	public static void main(String[] args) {

		// static 변수
		VariableTest1.data_s = 10;
		VariableTest1.data_s = 30;
		
		System.out.println(VariableTest1.data_s);	// 30
		
		// 아래처럼 객체 별로 접근하지 않는다.
//		v1.data_s = 10;
//		v2.data_s = 30;
//		System.out.println(v1.data_s);	// 30
//		System.out.println(v2.data_s);	// 30

		// 전역변수
		// 전역변수는 생성자 호출할 때마다 해당 필드에 하나씩 생성
		VariableTest1 v1 = new VariableTest1();
		VariableTest1 v2 = new VariableTest1();
		
		v1.data = 10;
		v1.data = 30;
		
		System.out.println(v1.data);// 30
		System.out.println(v2.data);// 10
		
//		increaseData_s();	// 소속을 밝혀주지 않아서 안 된다.
//		VariableTest1.increaseData_s();	// 클래스로 접근
		
		v1 = new VariableTest1();
		v1.increaseData();
		v1.increaseData();
		// 전역변수는 new연산자를 만나면 초기화가 된다.
		// static 변수는 new연산자를 사용하여 호출하지는 않지만
		// 그렇게 하더라도 이를 통해 생성되는 것도 아니고
		// 프로그램 종료 시 초기화되기 때문에 영향을 받지 않는다.
		v1 = new VariableTest1();
		v1.increaseData();
		v1.increaseData();
	}
	
}
