package class03;

class A {
	int memA; // 멤버변수, 인스턴스변수, 공유 X
	static int memB; // 정적변수, static, 클래스변수, 공유 O
	
	void info() {
		System.out.print(this.memA);
		System.out.println(" " + A.memB);
		System.out.println();
	}
}

public class Test01 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		a1.memA += 10;
		a1.memB += 20; // A.memB += 20; 이게 옳다.
		
		a1.info();
		a2.info();
	}

}
