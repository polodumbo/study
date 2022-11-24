package class06;

// [제어자, 접근제어자]
class A {
	private int a; // 정보은닉
	protected int b;
	public int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	void func() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
}

class B extends A {
	void func() {
//		System.out.println(this.a); // private은 자식도 접근 X
		System.out.println(this.b); // proteted는 자식 접근 O
		System.out.println(this.c);
	}
}

public class Test01 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getA());
		b.setA(3);
		System.out.println(b.getA());
	}
}
