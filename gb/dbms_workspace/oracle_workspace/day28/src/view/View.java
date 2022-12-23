package view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.board.BoardVO;

public class View {
	Scanner sc;
	int mAction;
	ArrayList<String> searchMenu;

	public View() {
		sc = new Scanner(System.in);
		mAction = 3; // 메인 메뉴 선택지
		searchMenu = new ArrayList<String>(); // 검색 메뉴
		searchMenu.add("제목");
		searchMenu.add("작가");
	}

	public int printMenu() {
		while (true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 전체 목록 출력");
			System.out.println("2. 검색");
			System.out.println("3. 종료");
			System.out.print("입력) ");
			int act = sc.nextInt();

			if (!(act >= 1 && act <= mAction)) {
				System.out.println("똑바로 입력하세요");
				continue;
			}

			return act;
		}
	}

	public void printDatas(ArrayList<BoardVO> list) {
		if (list.isEmpty()) {
			System.out.println("출력할 데이터가 없습니다.");
			return;
		}
		for (BoardVO v : list) {
			System.out.println(v);
		}
	}

	public BoardVO search() {
		System.out.println("=== 검색 ===");
		for (int i = 0; i < searchMenu.size(); i++) {
			System.out.println((i + 1) + ". " + searchMenu.get(i));
		}
		System.out.println("카테고리 번호 입력 >> ");
		int num = sc.nextInt();
		String searchCondition = searchMenu.get(num - 1);

		System.out.println("검색어 입력 >> ");
		String searchContent = sc.next();

		BoardVO bvo = new BoardVO();
		bvo.setSearchCondition(searchCondition);
		bvo.setSearchContent(searchContent);

		return bvo;
	}

}
