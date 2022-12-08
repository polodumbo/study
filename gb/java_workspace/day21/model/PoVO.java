package model;

public class PoVO {
	private int num;
	private String name;
	private int lv;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	@Override
	public String toString() {
		return "PoVO [num=" + num + ", name=" + name + ", lv=" + lv + "]";
	}

	public PoVO(int num, String name, int lv) {
		this.num = num;
		this.name = name;
		this.lv = lv;
	}
}
