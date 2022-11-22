package class05;

//	Book
//		String title;
//		String category;
//		void info()
//			ㅁㅁ - ㅁㅁㅁㅁ
//	
//	Cartoon
//		String title;
//		String category
//		void info()
//			ㅁㅁ - 애니메이션
//	
//	Major
//		String title;
//		String category
//		void info()
//			ㅁㅁ - 프로그래밍
//	
//	main(){
//			Book b1=new Book("","");
//			Cartoon b2=new Cartoon("스파이패밀리");
//			Major b3=new Major("Java");
//	}
class Book {
	String title;
	String category;
	
	void info() {
		System.out.println(this.title + " - " + this.category);
	}
	
	Book(String title, String category) {
		this.title = title;
		this.category = category;
	}
}

class Cartoon extends Book {
	Cartoon(String title) {
		super(title, "애니메이션");
	}
}

class Major extends Book {
	Major(String title) {
		super(title, "프로그래밍");
	}
}
	
public class Test01 {
	public static void main(String[] args) {
		
		Book b1 = new Book("태엽 감는 새", "무라카미 하루키");
		Cartoon b2 = new Cartoon("스파이 패밀리");
		Major b3 = new Major("Java");

		b1.info();
		b2.info();
		b3.info();
	}
}
