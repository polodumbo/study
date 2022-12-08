package ctrl;

import model.StudentDAO;
import view.StudentView;

public class StudentCtrl {
	private StudentDAO model;
	private StudentView view;

	public StudentCtrl() {
		model = new StudentDAO();
		view = new StudentView();
	}

	public void startApp() {
		while (true) {
			view.printMenu();
			int action = view.action;
			/*
			 * // 일반변수 int action=view.printMenu(); // private view.printMenu(); int
			 * action=view.getAction(); // public view.printMenu(); int action=view.action;
			 */

			if (action == 1) {
				String name = view.getString();
				int score = view.getInt();
				model.insert(name, score);
			} else if (action == 2) {
				view.printData(model.selectAll());
			} else if (action == 3) {
				int num = view.getInt();
				view.printData(model.selectOne(num));
			} else if (action == 4) {
				int num = view.getInt();
				String name = view.getString();
				model.updateName(num, name);
			} else if (action == 5) {
				int num = view.getInt();
				int score = view.getInt();
				model.updateScore(num, score);
			} else if (action == 6) {
				int num = view.getInt();
				model.delete(num);
			} else {
				break;
			}
		}
	}
}
