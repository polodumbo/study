package class04;

import java.util.ArrayList;

// [주제: 음료수 자판기]
class Drink {
	int pk;
	String name;
	int price;
	int cnt;
}

public class Test07 {
	public static void main(String[] args) {
		ArrayList<Drink> datas = new ArrayList<Drink>();
		final int PASSWORD = 1234;
		int num = 1234;
		
		if (num == PASSWORD) {
			System.out.println("관리자 모드 실행");
		}
	}
}
