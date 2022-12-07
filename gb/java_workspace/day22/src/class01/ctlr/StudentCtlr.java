package class01.ctlr;

import class01.model.StudentDAO;
import class01.model.StudentVO;
import class01.view.StudentView;

public class StudentCtlr {
	private StudentDAO model;
	private StudentView view;
	
	public StudentCtlr() {
		model = new StudentDAO();
		view = new StudentView();
	}
	
	public void startApp() {
		while (true) {
			// view의 action이 지역변수여서 리턴이 있을 때
//			int action = view.printMenu();
			
			// view의 action이 멤버변수여서 데려와야 될 때
			// public
//			int action = view.action;
			// private
			view.printMenu();
			int action = view.getAction(); 
			
			if (action == 1) { // 1. 학생 추가
//				String name = view.getString();
//				int score = view.getScore();
//				int age = view.getAge();
//				StudentVO vo = new StudentVO(PK++, name, score, age);
				StudentVO vo = new StudentVO();
				vo.setName(view.getName());
				vo.setScore(view.getScore());
				vo.setAge(view.getAge());
				if (model.insert(vo)) {
					view.printSuccess();
					continue;
				}
				view.printFailure();
			} else if (action == 2) { // 2. 목록 출력
				view.printData(model.selectAll(null));
			} else if (action == 3) { // 3. 학생 출력
				StudentVO vo = new StudentVO();
				vo.setNum(view.getNum());
				view.printData(model.selectOne(vo));
			} else if (action == 4) { // 4. 학생 검색
				view.printSearchMenu();
				action = view.getAction(); 
				StudentVO vo = new StudentVO();
				if (action == 1) { // 4-1. 이름으로 검색
					vo.setName(view.getName());
				} else { // 4-2. 성적으로 검색
					vo.setScore(view.getScore());
				}
				view.printData(model.selectAll(vo));
			} else if (action == 5) { // 5. 학생 이름 변경
				StudentVO vo = new StudentVO();
				vo.setNum(view.getNum());
				vo.setName(view.getName());
				if (model.update(vo)) {
					view.printSuccess();
					continue;
				}
				view.printFailure();
			} else if (action == 6) { // 6. 학생 성적 변경
				StudentVO vo = new StudentVO();
				vo.setNum(view.getNum());
				vo.setScore(view.getScore());
				if (model.update(vo)) {
					view.printSuccess();
					continue;
				}
				view.printFailure();
			} else if (action == 7) { // 7. 학생 삭제
				StudentVO vo = new StudentVO();
				vo.setNum(view.getNum());
				if (model.delete(vo)) {
					view.printSuccess();
					continue;
				}
				view.printFailure();
			} else { // 8. 프로그램 종료
				break;
			}
		}
	}
	
}
