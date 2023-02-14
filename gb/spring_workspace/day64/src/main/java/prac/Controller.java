package prac;

public class Controller {
	private Model model;
	private View view;

	public void setModel(Model model) {
		this.model = model;
	}

	public void setView(View view) {
		this.view = view;
	}

	public void startApp() {
		while (true) {
			int act = view.menu();
			if (act == 1) {
				model.insert(view.action01());
			} else if (act == 2) {
				view.action03(model.selectAll(view.action02()));
			} else {
				return;
			}
		}
	}
}
