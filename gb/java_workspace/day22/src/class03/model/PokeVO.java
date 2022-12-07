package class03.model;

import java.util.Random;

public class PokeVO {
	private int num;
	private String name;
	private int level;
	
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "PokeVO [num=" + num + ", name=" + name + ", level=" + level + "]";
	}
	
	public PokeVO() {
		
	}
	
	public PokeVO(int num, String name) {
		this.num = num;
		this.name = name;
		this.level = new Random().nextInt(6) + 5; // 레벨 랜덤하게 5~10
	}
}
