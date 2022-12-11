package class01.ctrl;

import class01.model.MemberDAO;
import class01.model.MemberVO;
import class01.model.ProductDAO;
import class01.model.ProductVO;
import class01.view.View;

public class Ctrl {
	View view;
	MemberDAO mdao;
	ProductDAO pdao;
	public Ctrl() {
		view=new View();
		mdao=new MemberDAO();
		pdao=new ProductDAO();
	}
	public void startApp() {

		while(true) {
			int action=view.printStart();
			if(action==1) {
//				MemberVO mvo=view.login();
				MemberVO mvo = new MemberVO();
				System.out.println("   로그1: "+mvo);
				// mvo: 사용자가 로그인하기위해 입력한 아이디,비번 정보가 담겨있음!
				mvo=mdao.selectOne(mvo);
				// mvo: 로그인 성공시 온전한 데이터
				//           실패시 null
				System.out.println("   로그2: "+mvo);
				if(mvo==null) {
					// 로그인 실패
					view.loginFalse();
					continue;
				}
				view.loginTrue(mvo);

				while(true) {
					action=view.printMenu();
					if(action==1) {
						view.printProductMenu(pdao.selectAll(null));
					}
					else if(action==2) {
						int num=view.buyProduct(pdao.selectAll(null));

						ProductVO pvo=new ProductVO();
						pvo.setNum(num);
						pvo=pdao.selectOne(pvo);

						if(pdao.update(pvo)) {
							view.buyTrue(mvo, pvo);
						}
						else {
							view.buyFalse();
						}
					}
					else if(action==3) {
						view.logout();
						break;
					}
					else if(action==4) {
						boolean ans=view.getCheck(mvo); // 현재 로그인한 사람
						if(ans) {
							/*
							if(mdao.delete(현재 로그인한 사람)) {
								view.삭제성공();
								break;
							}
							else {
								view.삭제실패();
							}
							*/
							break;
						}
					}
					else if(action==5) {
						mvo=view.memberInfo(mvo);
						if(mdao.update(mvo)) {
							System.out.println("  로그: 성공");
						}
						else {
							System.out.println("  로그: 실패");
						}
					}
				}
			}
			else if(action==2) {
				// 회원가입
				
				// 1. 아이디입력
				String id=view.getId();
				
				// 2-1. 아이디가 중복이라면? xxx
				// 2-2. 아이디가 중복아니어야됨
				MemberVO mvo=new MemberVO();
				mvo.setId(id);
				if(mdao.checkId(mvo)) { // T: 중복발생
					view.printInfo();
					continue;
				}
				
				// 3. 비밀번호입력
				// 4. 비밀번호재입력하여 확인
				String pw=view.getPw();
				mvo.setPw(pw);
				
				String name=view.getName();
				mvo.setName(name);
				
				// 5-1. 회원가입성공
				// 5-2. 회원가입실패			
				if(mdao.insert(mvo)) {
					view.signupTrue();
				}
				else {
					view.signupFalse();
				}				
			}
			else if(action==3) {
				view.powerOff();
				return;
			}
		}



















	}
}
