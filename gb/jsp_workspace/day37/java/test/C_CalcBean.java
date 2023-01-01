package test;

// JSP에서 모듈화한 클래스
//  == Bean 클래스
// XxxBean
public class C_CalcBean {
	private int num1;
	private int num2;
	private String op;
	private int res;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public void calculate() {
		if (this.op.equals("+")) {
			// this == cb 이상 없음
			// this.op == cb.op	<< 얘 문제!
			this.res = this.num1 + this.num2;
		} else if (this.op.equals("-")) {
			this.res = this.num1 - this.num2;
		} else if (this.op.equals("x")) {
			this.res = this.num1 * this.num2;
		} else {
			this.res = this.num1 / this.num2;
		}
	}
}