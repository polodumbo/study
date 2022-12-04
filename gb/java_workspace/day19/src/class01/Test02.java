package class01;

import java.util.ArrayList;
import java.util.Scanner;

// 관계는 없지만 같은 프로그램에 등장하는 객체가 2개이상일때,
// 배열리스트<객체>가 등장하면,
// 잘 모르겠어요.....

// ★ 메서드
//  : 해당 객체가 수행할수있는 서비스(기능)를 생각해보기!
class Product {
	private int num;
	private String name;
	private int cnt;
	private int price;

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

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 오버로딩 -> 인자가 많은 메서드부터 구현
	boolean sell() {
		return this.sell(1);
	}

	boolean sell(int cnt) {
		if (this.cnt < cnt) {
			System.out.println("  로그: 재고없어서 판매불가");
			return false;
		}
		this.cnt -= cnt;
		System.out.println("  로그: 판매완료");
		return true;
	}

	int totalPrice(int cnt) {
		return this.price * cnt;
	}

	Product(int num, String name) {
		this.num = num;
		this.name = name;
		this.price = 1000;
		this.cnt = 1;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", cnt=" + cnt + ", price=" + price + "]";
	}
}

class Member {
	private int num;
	private String name;
	private int money;

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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	void buy(Product product) {
		this.buy(product, 1);
	}

	void buy(Product product, int cnt) {
		int totalPrice = product.totalPrice(cnt);
		if (totalPrice > this.money) {
			System.out.println("  로그: 잔액부족으로 구매불가");
			return;
		}
		if (!product.sell(cnt)) {
			System.out.println("  로그: 구매실패");
			return;
		}
		this.money -= totalPrice;
		System.out.println("  로그: 구매완료");
	}

	Member(int num, String name) {
		this.num = num;
		this.name = name;
		this.money = 1900;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if (this.num == member.num) {
				return true;
			}
		}
		return false;
	}
}

// ★ 배열리스트<제네릭> 등장
//  : 메서드의 수행주체(주어,대상)를 생각해보자!
//  : '누가' 이 메서드를 수행하는가???
public class Test02 {
	public static void main(String[] args) {

		int pNum = 1001;
		ArrayList<Product> pdatas = new ArrayList<Product>();
		pdatas.add(new Product(pNum++, "목도리"));
		pdatas.add(new Product(pNum++, "장갑"));
		pdatas.add(new Product(pNum++, "가방"));
		pdatas.add(new Product(pNum++, "모자"));

		int mNum = 101;
		ArrayList<Member> mdatas = new ArrayList<Member>();
		mdatas.add(new Member(mNum++, "홍길동"));
		mdatas.add(new Member(mNum++, "아무무"));

		// C: 상품추가
		// 		회원가입(회원추가)
		// R: 상품목록출력(selectAll,getAll) 상품1개출력(selectOne,getOne)
		// 		마이페이지(selectOne,getOne) 로그인(selectOne,getOne)
		// U: 멤버변수(속성,어트리뷰트,애트리뷰트,필드)가 변경
		// 		재고추가,구매가되어 재고소진,가격 변경
		// 		이름변경,구매,충전,비밀번호 변경,회원정보 변경
		// D: 상품삭제
		// 		회원탈퇴(회원삭제) 영구정지

		// 정리 1 )
		// 		상태가 변화되는 작업은 C,U,D
		// 		R 상태가 변화되지않음
		// 정리 2 )
		// 		U 멤버변수가 변화됨 : 객체
		// 		C,D 배열리스트에 변화발생 : 배열리스트

		Scanner sc = new Scanner(System.in);

		System.out.print("로그인할 PK를 입력) ");
		int preMemberPK = sc.nextInt();
		Member preMember = new Member(preMemberPK, "");
		boolean flag = true;
		for (Member v : mdatas) {
			if (preMember.equals(v)) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("  로그: 로그인 실패");
			return;
		}
		System.out.println("  로그: 로그인 성공");

		while (true) {
			System.out.println("1. C");
			System.out.println("2. R");
			System.out.println("3. U");
			System.out.println("4. D");
			System.out.print("입력) ");
			int act = sc.nextInt();
			if (act == 1) {

			} else if (act == 2) {
				for (Product v : pdatas) {
					System.out.println(v);
				}
			} else if (act == 3) {

			} else if (act == 4) {

			} else {
				break;
			}
		}

	}
}