package class03.ctlr;

import class03.model.PokeDAO;
import class03.model.PokeVO;
import class03.view.PokeView;

public class PokeCtlr {
	private PokeDAO model;
	private PokeView view;
	
	public PokeCtlr() {
		model = new PokeDAO();
		view = new PokeView();
	}
	
	public void startApp() {
		while (true) {
			view.printMenu();
			int act = view.getAction();
			if (act == 1) { // 1. 포켓몬 추가
				PokeVO vo = new PokeVO();
				vo.setName(view.getName());
				if (model.insert(vo)) {
					view.checkTrue();
					continue;
				}
				view.checkFalse();
			} else if (act == 2) { // 2. 수첩 전체 출력
				view.printData(model.selectAll(null));
			} else if (act == 3) { // 3. 포켓몬 출력
				PokeVO vo = new PokeVO();
				vo.setNum(view.getNum());
				view.printData(model.selectOne(vo));
			} else if (act == 4) { // 4. 이름으로 포켓몬 검색
				PokeVO vo = new PokeVO();
				vo.setName(view.getName());
				view.printData(model.selectAll(vo));
			} else if (act == 5) { // 5. 단어로 포켓몬 검색
				PokeVO vo = new PokeVO();
				vo.setName(view.getName());
				view.printData(model.selectAllByWord(vo));
			} else if (act == 6) { // 6. 레벨 변경
				PokeVO vo = new PokeVO();
				vo.setNum(view.getNum());
				vo.setLevel(view.getLevel());
				if (model.update(vo)) {
					view.checkTrue();
					continue;
				}
				view.checkFalse();
			} else if (act == 7) { // 7. 포켓몬 삭제
				PokeVO vo = new PokeVO();
				vo.setNum(view.getNum());
				if (model.delete(vo)) {
					view.checkTrue();
					continue;
				}
				view.checkFalse();
			} else { // 8. 프로그램 종료
				return;
			}
			
		}
	}
}
