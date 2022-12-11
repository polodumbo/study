package class05.model;

public class WebtoonVO {
	private int num;
	private String title;
	private String writer;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "WebtoonVO [num=" + num + ", title=" + title + ", writer=" + writer + "]";
	}
	public WebtoonVO() {
		
	}
}
