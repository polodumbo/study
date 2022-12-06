package class08.controller;

import class08.model.StudentDAO;
import class08.view.View;

public class StudentCtlr {
	private StudentDAO model;
	private View view;

	public StudentCtlr() {
		model = new StudentDAO();
		view = new View();
	}

	public void startApp() {
		while (true) {
			int act = view.printMenu();

			if (act == 1) { // 1. 학생 추가
				// 이름, 성적
				// datas.add
				String name = view.getString(); // view에게 String 받아오기
				int score = view.getInt(); // view에게 int 받아오기
				model.insert(name, score);
			} else if (act == 2) { // 2. 목록 출력
				// DB야, 목록데이터 줘
				// view에게 줄게
				view.printInfo(model.selectAll());
			} else if (act == 3) { // 3. 학생 출력
				// 사용자야, PK 줘
				// DB한테 물어봐서 해당 데이터 사용자한테 줄게
				int num = view.getInt();
				view.printInfo(model.selectOne(num));
			} else if (act == 4) { // 4. 성적 변경
				// 사용자야, PK + 성적 알려주라.
				// DB한테 말해서 바꿔줄게
				int num = view.getInt();
				int score = view.getInt();
				model.updateScore(num, score);
			} else if (act == 5) { // 5.학생 삭제
				// 사용자야, PK 줘
				// DB에게 없애달라고 할게
				int num = view.getInt();
				model.delete(num);
			} else {
				break;
			}

		}
	}
}
