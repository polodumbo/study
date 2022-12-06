package class06.client;

import class06.controller.StudentCtrl;

public class Client {

	public static void main(String[] args) {
		StudentCtrl app = new StudentCtrl();
		app.startCtrl();

		app.startApp();
	}

}