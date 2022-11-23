package class02;

// [Java 최상위 클래스 Object]
class A {
	int a;
	int b;
	
	void f() {
		
	}
	
	// .toString() 재정의
	@Override
	public String toString() {
		 return "a = " + this.a + ", b = " + this.b;
	}

	A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
}

public class Test01 {
	public static void main(String[] args) {
		A aaa = new A(10, 20);
		System.out.println(aaa); // 주소값
		System.out.println(aaa.toString()); // 같은 결과, aaa 뒤에 .toString()이 생략된 상태

	}
}
