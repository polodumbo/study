package ctrl;

import model.PoDAO;
import view.PoView;

public class PoCtrl {
	PoDAO model;
	PoView view;

	public PoCtrl() {
		model = new PoDAO();
		view = new PoView();
	}

	public void startApp() {
		while (true) {
			int action = view.printMenu();
			if (action == 1) {
				String name = view.getName();
				if (model.insert(name)) {
					view.checkTrue();
					continue;
				}
				view.checkFalse();
			} else if (action == 2) {
				view.printData(model.selectAll());
			} else if (action == 3) {
				int num = view.getNum();
				view.printData(model.selectOne(num));
			} else if (action == 4) {
				int num = view.getNum();
				int lv = view.getLv();
				if (model.update(num, lv)) {
					view.checkTrue();
					continue;
				}
				view.checkFalse();
			} else if (action == 5) {
				int num = view.getNum();
				if (model.delete(num)) {
					view.checkTrue();
					continue;
				}
				view.checkFalse();
			} else if (action == 6) {
				String name = view.getName();
				view.printData(model.selectAll(name));
			} else {
				view.powerOff();
				break;
			}
		}
	}
}
