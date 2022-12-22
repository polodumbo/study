package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.BoardVO;

public class View {
	Scanner sc;
	ArrayList<String> menu;

	public View() {
		sc = new Scanner(System.in);
		menu = new ArrayList<String>();
		menu.add("제목");
		menu.add("내용");
		menu.add("작성자");
	}

	public BoardVO search() {
		System.out.println("=== 검색 ===");
		for (int i = 0; i < menu.size(); i++) {
			System.out.println((i + 1) + ". " + menu.get(i));
		}
		System.out.println("카테고리 번호 입력 >> ");
		int num = sc.nextInt();
		String searchCondition = menu.get(num - 1);
		System.out.println("검색어 입력 >> ");
		String searchContent = sc.next();
		BoardVO bvo = new BoardVO();
		bvo.setSearchCondition(searchCondition);
		bvo.setSearchContent(searchContent);
		return bvo;
	}

	public BoardVO getBoardNum() {
		BoardVO bvo = new BoardVO();
		System.out.println("출력할 글 번호 입력 >> ");
		bvo.setNum(sc.nextInt());
		return bvo;
	}

	public BoardVO getUpdateData() {
		BoardVO bvo = new BoardVO();
		System.out.println("변경할 글 번호 입력 >> ");
		bvo.setNum(sc.nextInt());
		System.out.println("변경할 제목 입력 >> ");
		bvo.setTitle(sc.next());
		return bvo;
	}

	public BoardVO getDeleteData() {
		BoardVO bvo = new BoardVO();
		System.out.println("삭제할 글 번호 입력 >> ");
		bvo.setNum(sc.nextInt());
		return bvo;
	}

	public void printData(BoardVO data) {
		if (data == null) {
			System.out.println("출력할 데이터가 없습니다!");
			return;
		}
		System.out.println("=== 출력할 데이터 ===");
		System.out.println(data);
	}

	public void printDatas(ArrayList<BoardVO> datas) {
		if (datas.isEmpty()) {
			System.out.println("검색결과가 없습니다!");
			return;
		}
		System.out.println("검색된 결과: [" + datas.size() + "]개");
		for (BoardVO v : datas) {
			System.out.println(v);
		}
	}

	public BoardVO getBoard() {
		BoardVO bvo = new BoardVO();
		System.out.println("작성할 글 제목 입력 >> ");
		bvo.setTitle(sc.next());
		System.out.println("글 내용 입력 >> ");
		bvo.setContent(sc.next());
		System.out.println("작성자 입력 >> ");
		bvo.setWriter(sc.next());
		return bvo;
	}

	public int printMenu() {
		System.out.println();
		System.out.println("=== 메뉴 ===");
		System.out.println("1. C");
		System.out.println("2. R");
		System.out.println("3. R");
		System.out.println("4. U");
		System.out.println("5. D");
		System.out.println("6. 검색");
		System.out.println("7. 종료");
		System.out.println("입력 >> ");
		int act = sc.nextInt();
		return act;
	}
}
