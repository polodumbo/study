package class06.controller;

import class06.model.Student;
import class06.view.StudentView;

public class StudentCtrl {
	private Student model;
	private StudentView view;
	public void startCtrl() {
		model=new Student();
		view=new StudentView();
		
		model.startModel();
	}
	public void startApp() {
		while(true) {
			view.startView();
			if(view.action==1) {
				System.out.println(model);
			}
			else if(view.action==2) {
				// 1. 사용자에게 누구를 바꿀건지 물어보기
				view.func1();
				// 2. 걔가 있는지 체크
				if(model.check(view.action)) {
					// 3-1. 있으면 성적바꾸고
					view.func2();
					model.setScore(view.action);
				}
				// 3-2. 없으면 x
				System.out.println("   로그: 해당데이터없음");
			}
			else {
				break;
			}			
		}
	}
}
