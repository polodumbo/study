package prac;

import java.util.List;
import java.util.Scanner;

public class View {
	private Scanner sc;

	public View() {
		sc = new Scanner(System.in);
	}

	public int menu() {
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 조회");
		System.out.println("3. 프로그램 종료");
		return sc.nextInt();
	}

	public String action01() {
		System.out.println("데이터를 입력하세요.");
		return sc.next();
	}

	public String action02() {
		System.out.println("조회할 데이터를 입력하세요.");
		return sc.next();
	}

	public void action03(List<String> datas) {
		if (datas.size() == 0) {
			System.out.println("조회할 데이터가 없습니다.");
			return;
		}
		System.out.println("===조회 결과===");
		for (String v : datas) {
			System.out.println(v);
		}
	}
}
