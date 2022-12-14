package ctrl;

import model.MemberDAO;
import model.MemberVO;
import view.View;

public class Ctrl {
	// 빠른 진도를 위해 client를 ctrl에 슉슉
	public static void main(String[] args) {
		View view = new View();
		MemberDAO model = new MemberDAO();
		
		while (true) {
			int act = view.getAction();
			
			if (act == 1) { // 1. INSERT
				// MEMBER라는 테이블에
				// MEMBER에 해당하는 칼럼들(NUM, NAME, AGE)을 넣어주어야 한다! 
				
				// 방법 1
				// view에게 객체째로 받는다.
				MemberVO mvo = view.getMemberInfo();
				if (model.insert(mvo)) {
					view.printTrue();
				} else {
					view.printFalse();
				}
				
				// 방법 2
				// view에게 요소 하나하나를 받는다.
//				MemberVO mvo = new MemberVO();
				mvo = new MemberVO();
				mvo.setNum(view.updateGetNum());
				mvo.setAge(view.updateGetAge());
				if (model.update(mvo)) {
					view.printTrue();
				} else {
					view.printFalse();
				}
			} else if (act == 2) { // 2. SELECTALL
				
			} else if (act == 3) { // 3. SELECTONE
				
			} else if (act == 4) { // 4. UPDATE
				MemberVO mvo = new MemberVO();
				mvo.setNum(view.updateGetNum());
				mvo.setAge(view.updateGetAge());
				if (model.update(mvo)) {
					view.printTrue();
				} else {
					view.printFalse();
				}
			} else if (act == 5) { // 5. DELETE
				MemberVO mvo = new MemberVO();
				mvo.setNum(view.delete());
				if (model.delete(mvo)) {
					view.printTrue();
				} else {
					view.printFalse();
				}
			} else {
				break;
			}
		}
	}
}
