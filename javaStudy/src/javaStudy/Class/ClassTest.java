package javaStudy.Class;

class C {
	int data = 100;
	
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		
		System.out.println(c1);	// a의 주소값
		c1.data = 200;
		c1.printData();	// 200
		
		c2.data = 300;
		c2.printData();	// 300
	}
}
