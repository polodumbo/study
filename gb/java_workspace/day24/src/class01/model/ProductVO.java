package class01.model;

public class ProductVO {
	private int num; // PK
	private String name;
	private int price;
	private int cnt;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "ProductVO [num=" + num + ", name=" + name + ", price=" + price + ", cnt=" + cnt + "]";
	}
	public ProductVO() {
		
	}
	public ProductVO(int num,String name,int price,int cnt) {
		this.num=num;
		this.name=name;
		this.price=price;
		this.cnt=cnt;
	}
}
