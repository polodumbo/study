package ctrl;

import java.util.ArrayList;

import model.board.BoardDAO;
import model.board.BoardVO;
import model.common.Crawling;
import view.View;

public class Ctrl {
	BoardDAO model;
	View view;

	public Ctrl() {
		model = new BoardDAO();
		view = new View();
	}

	public void startApp() {
		ArrayList<BoardVO> boardList = model.selectAll(null);
		if (boardList.size() <= 5) { // SELECTALL했을 때, 데이터가 5개 이하면
			Crawling.sample(model);
		}

		// 한 번만 수행하기 때문에 기본 생성자에 넣을 이유가 딱히 없다!
		// 같은 이유로 static으로 써도 무방
		while (true) {
			int act = view.printMenu();
			if (act == 1) { // [메뉴] 전체 목록 출력
				view.printDatas(model.selectAll(null));
			} else if (act == 2) { // [메뉴] 검색
				BoardVO bvo = view.search();
				view.printDatas(model.selectAll(bvo));
			} else { // [메뉴] 종료
				break;
			}
		}

	}

}
