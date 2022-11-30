package class01;

import java.util.ArrayList;
import java.util.Scanner;

// [컬렉션 복습]
class Book {
	private int num; // PK
	private String title;
	private int price;
	private int cnt; // 재고

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
		return this.num + ". " + this.title + " " + this.price + "원 " + this.cnt + "개";
	}
	
	// 메서드화
	void buyBook() {
		if (this.cnt == 0) { // if (재고가 없다면)
			System.out.println("재고가 없습니다.");
			return;
		}
		this.cnt--;
		System.out.println("구매 완료");
	}

	Book(int num, String title) {
		this.num = num;
		this.title = title;
		this.price = 10000;
		this.cnt = 2;
	}
}

public class Test02 {
	// 모듈화
	// 1. 로직 뜯어서 옮기기
	// 2. input : 내부 로직에서 필요로 하는 정보 전달하기
	// 3. output : 이후의 로직에서 필요로 하는 정보 전달하기
	
	// 함수화
	// 같은 번호의 객체 유무 검사하는 메서드
	// 있다면 해당 객체 반환
	// 없다면 null 반환
	public static Book hasBook(ArrayList<Book> datas, int act) {
		boolean isNumExistent = true;
		Book book = null;
		for (Book v : datas) {
			if (v.getNum() == act) { // 사용자가 입력한 번호와 객체의 번호가 같다면
				isNumExistent = false;
				book = v; // 해당 객체의 정보 임시 저장
				break;
			}
		}
		
		if (isNumExistent) { // if (번호가 없다면)
			System.out.println("없는 번호입니다.");
		}
		return book;
	}
	
	public static void main(String[] args) {
		// Array(객체)				ArrayList(컬렉션 프레임워크)
		// 전체크키 사전 결졍		사전 결정 X
		// 삽입, 삭제 불리			삽입, 삭제 용이
		// Index O					Index O
		// 비교적 빠름				비교적 느림
		
		// 컬렉션 프레임워크
		// 컬렉션을 생성 시, 반드시 <> 제네릭과 함께 사용!
		// 제네릭(<>): 자료형(타입)을 강제
		ArrayList<Book> datas = new ArrayList<Book>();
		int NUM = 101;
		
//		datas.add(new Book(NUM, "어린왕자"));
//		NUM++;
		datas.add(new Book(NUM++, "어린왕자")); // 후위증감연산자이기에 객체 생성 후에 값이 증가
		datas.add(new Book(NUM++, "해리포터"));
		
		// 서비스(기능) 정의할 때, "누가" 수행하는지 생각해 볼 것!
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("============");
//			System.out.println("1. 추가"); // 관리자
			System.out.println("1. 목록 출력");
			System.out.println("2. 구매");
//			System.out.println("4. 삭제"); // 관리자
			System.out.println("3. 종료");
			System.out.println("============");
			System.out.print("입력) ");
			int act = sc.nextInt();
			
			if (act == 1234) {
				System.out.println("+++관리자 모드+++");
				while (true) {
					System.out.println("============");
					System.out.println("1. 추가"); // 관리자
					System.out.println("2. 삭제"); // 관리자
					System.out.println("3. 종료");
					System.out.println("============");
					System.out.print("입력) ");
					act = sc.nextInt();
					if (act == 1) {
						System.out.print("책 제목 입력) ");
						String title = sc.next();
						datas.add(new Book(NUM++, title));
						System.out.println("\t책 등록 완료!");
					} else if (act == 2) {
						for (Book v : datas) {
							System.out.println(v);
						}
						System.out.print("삭제할 책 번호 입력) ");
						act = sc.nextInt();
						Book book = hasBook(datas, act);
						if (book == null) {
							continue;
						}
						datas.remove(book);
						System.out.println("\t제거 완료");
						
					} else {
						break;
					}
				}
			 } else if (act == 1) {
				 for (Book v : datas) {
					System.out.println(v);
				}
			 } else if (act == 2) {
				for (Book v : datas) {
					System.out.println(v);
				}
				System.out.print("구입할 책 번호 입력) ");
				act = sc.nextInt();
				
				// 모듈화 1 : 동일 로직이 반복되는 경우
				// 함수화 : 실행 주체가 객체가 아닌 경우
//				boolean isNumExistent = true;
//				Book book = null;
//				for (Book v : datas) {
//					if (v.getNum() == act) { // 사용자가 입력한 번호와 객체의 번호가 같다면
//						isNumExistent = false;
//						book = v; // 해당 객체의 정보 임시 저장
//						break;
//					}
//				}
//				if (isNumExistent) { // if (번호가 없다면)
//					System.out.println("없는 번호입니다.");
//					continue;
//				}
				Book book = hasBook(datas, act);
				if (book == null) {
					continue;
				}
				
				// 모듈화 2 : 로직들 사이에 관계성이 있을 경우
				// 메서드화 : 실행 주체가 객체인 경우
//				if (book.getCnt() == 0) { // if (재고가 없다면)
//					System.out.println("재고가 없습니다.");
//					continue;
//				}
//				book.func();
//				System.out.println("구매 완료");
				book.buyBook();
			 } else {
				 break;
			 }
			
		}
	}
}
