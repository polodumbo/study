package class06;

class Book {
	String title;
	String author;
	void info() {
		System.out.println(this.title + " : " + this.author);
	}
	// 제목, 작가
	// 제목
	Book(String title) {
		this(title, "작자미상"); // ☆
	}
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class Test02 {

	public static void main(String[] args) {
		Book b1 = new Book("해리포터", "JK 롤링");
		Book b2 = new Book("어린왕자", "생텍쥐페리");
		Book b3 = new Book("가시리");
		
		b1.info();
		b2.info();
		b3.info();
	}

}
