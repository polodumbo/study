package class01.ctlr;

import class01.model.MemberDAO;
import class01.model.MemberVO;
import class01.model.ProductDAO;
import class01.model.ProductVO;
import class01.view.View;

public class Ctlr {
	View view;
	MemberDAO mdao;
	ProductDAO pdao;
	
	public Ctlr() {
		view = new View();
		mdao = new MemberDAO();
		pdao = new ProductDAO();
	}
	
	public void startApp() {
		while (true) {
			int action = view.printStart();
			if (action == 1) { // [메인] 1. 회원가입
				// 1. 아이디 입력
				// 2. 아이디 중복 검사
				// 3. 비밀번호 확인
				/// 5. 회원가입 성공
				MemberVO mvo = new MemberVO();
				view.printJoin();
				mvo.setName(view.getName()); // 이름 입력
				while (true) { // 아이디 입력
					mvo.setId(view.getId());
					if (mdao.checkId(mvo)) { // 아이디 중복체크 
						view.checkIdTrue();
						break;
					}
					view.checkIdFalse();
				}
				mvo.setPw(view.getPw()); // 비밀번호 입력
				if (mdao.insert(mvo)) { // 회원가입
					view.joinTrue(mvo);
					continue;
				}
				view.joinFalse(mvo);
			} else if (action == 2) { // [메인] 2. 로그인
				// mvo: 사용자가 로그인하기 위해 입력한 id, pw 정보가 담겨 있음
				MemberVO mvo = view.login();
				mvo = mdao.selectOne(mvo);
				if (mvo == null) { // 로그인 실패
					view.loginFalse();
					continue;
				}
				view.loginTrue(mvo);
				
				if (mvo.getId().equals("admin")) { // 관리자
					while (true) {
						ProductVO pvo = new ProductVO();
						int num = 0;
						action = view.printAdminMenu();
						
						if (action == 1) { // [관리자] 1. 상품 정보 변경
							action = view.printUpdateMenu();
							if (action == 1) { // [상품 정보 변경] 1. 상품 가격 변경
								num = view.printUpdateProduct(pdao.selectAll(null));
								
							} else if (action == 2) { // [상품 정보 변경] 2. 상품 이름 변경
								num = view.printUpdateProduct(pdao.selectAll(null));
								
							} else if (action == 3) { // [상품 정보 변경] 3. 상품 재고 변경
								num = view.printUpdateProduct(pdao.selectAll(null));
								
							}
							
						} else if (action == 2) { // [관리자] 2. 로그아웃
							
						}
					}
				} else { // 일반 회원
					while (true) {
						action = view.printMenu();
						if (action == 1) { // [서비스] 1. 상품 목록 출력
							view.printProductMenu(pdao.selectAll(null));
						} else if (action == 2) { // [서비스] 2. 상품 선택 구매
							ProductVO pvo = new ProductVO();
							int num = view.buyProduct(pdao.selectAll(null));
							
							pvo.setNum(num);
							pvo = pdao.selectOne(pvo);
							
//							if(pdao.update(pvo)) {
//								view.buyTrue(mvo, pvo);
//							}
//							else {
//								view.buyFalse();
//							}
						} else if (action == 3) { // [서비스] 3. 마이페이지
							action = view.printMyPage();
							if (action == 1) { // [마이페이지] 1. 회원 정보 변경
								action = view.printUpdate();
								MemberVO upMvo = new MemberVO();
								upMvo.setId(mvo.getId());
								if (action == 1) { // [회원정보 변경] 1. 이름 변경 // 혹시 나중에 어떻게 될지 모르니까 분리
									upMvo.setName(view.getName());
									mdao.update(mvo);
								} else if (action == 2) { // [회원정보 변경] 2. 비밀번호 변경
									upMvo.setPw(view.getPw());
									mdao.update(mvo);
								}
							} else if (action == 2) { // [마이페이지] 2. 회원 탈퇴
								mdao.delete(mvo);
								break;
							}
						} else if (action == 4) { // [서비스] 4. 로그아웃
							view.logout();
							break;
						}
					}
				}
				
			} else if (action == 2) { // [메인] 2. 프로그램 종료
				view.powerOff();
				return;
			}
		}
	}
}
