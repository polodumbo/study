package ctrl;

import model.BoardDAO;
import model.BoardVO;
import view.View;

public class Ctrl {
	BoardDAO model;
	View view;

	public Ctrl() {
		model = new BoardDAO();
		view = new View();
	}

	public void startApp() {
		while (true) {
			int act = view.printMenu();
			if (act == 1) {
				BoardVO bvo = view.getBoard();
				if (model.insert(bvo)) {
					System.out.println("   로그: 성공");
				} else {
					System.out.println("   로그: 실패");
				}
			} else if (act == 2) {
				view.printDatas(model.selectAll(null));
			} else if (act == 3) {
				BoardVO bvo = view.getBoardNum();
				model.update(bvo);
				view.printData(model.selectOne(bvo));
			} else if (act == 4) {
				BoardVO bvo = view.getUpdateData();
				if (model.update(bvo)) {
					System.out.println("   로그: 성공");
				} else {
					System.out.println("   로그: 실패");
				}
			} else if (act == 5) {
				BoardVO bvo = view.getDeleteData();
				if (model.delete(bvo)) {
					System.out.println("   로그: 성공");
				} else {
					System.out.println("   로그: 실패");
				}
			} else if (act == 6) {
				BoardVO bvo = view.search();
				view.printDatas(model.selectAll(bvo));
			} else {
				break;
			}

		}
	}
}
