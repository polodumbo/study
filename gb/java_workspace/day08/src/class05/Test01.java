package class05;

class Book {
	String title;
	int price;
	void info() {
		System.out.println(this.title + "(은)는 " + this.price + "원입니다.");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();
		// 책 객체는 반드시 이름과 가격을 필요로 하는데,
		// 이름과 가격 없이도 만들 수 있도록 허용된 상태임
		Book b5 = new Book();
		
		// 지금 하는 행동은 붕어빵을 다 굽고 나서
		// 팥을 나중에 집어넣는 행동
		// -> 아무것도 없는 그냥 붕어모양빵이 나올 수도 있다...
		// => 붕어빵을 구울 때 팥을 넣으라고 안내해줘야 함!
		
		b1.info();
		
		b1.title = "해리포터";
		b1.price = 20000;
		
		b2.title = "어린 왕자";
		b2.price = 9600;
		
		b3.title = "비전공자를 위한 이해할 수 있는 IT지식";
		b3.price = 15120;
		
		b5.title = "1일 1로그 100일 완성 IT지식";
		b5.price = 9600;

		b1.info();
		b2.info();
		b3.info();
		b4.info();
		b5.info();
	}
}
