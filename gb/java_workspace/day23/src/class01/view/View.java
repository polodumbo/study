package class01.view;

import java.util.ArrayList;
import java.util.Scanner;

import class01.model.MemberVO;
import class01.model.ProductVO;

public class View {
	private Scanner sc;
	
	public View() {
		sc = new Scanner(System.in);
	}
	
	// 선택지
	public int printStart() {
		// View에서 해야 될 것
		// 1. 사용자의 입력값을 검사 == 유효성 검사
		// 2. 사용자에게 상황을 안내 == 사용자 편의성 고려
		int action = 0;
		while (true) {
			try {
				System.out.println();
				System.out.println("==== 메인화면 ====");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("3. 프로그램 종료");
				System.out.println("==================");
				System.out.print("입력) ");
				action = sc.nextInt();
			} catch (Exception e) { // 문자열 입력 시
				sc.nextLine();
				System.out.println("정수로 입력해주세요!");
				continue;
			}
			// 종료 조건
			if (action >= 1 && action <= 2) { // action이 1이상 2이하라면
				break;
			}
			System.out.println("범위를 확인하고 다시 입력해주세요!");
		}
		return action;
	}
	
	// 프로그램 종료
	public void powerOff() {
		for (int i = 0; i < 5; i++) {
			System.out.println(".");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	// 회원가입
//	public MemberVO join() {
//		MemberVO vo = new MemberVO();
//		System.out.println();
//		System.out.println("=== 회원가입 ===");
//		System.out.print("아이디) ");
//		String id = sc.next();
//		String pw = null;
//		while (true) {
//			System.out.print("비밀번호) ");
//			pw = sc.next();
//			System.out.print("비밀번호 재확인) ");
//			String pw2 = sc.next();
//			if (pw.equals(pw2)) {
//				break;
//			}
//			System.out.println("비밀번호가 일치하지 않습니다.\n");
//		}
//		vo.setId(id);
//		vo.setPw(pw);
//		System.out.println("================");
//		return vo;
//	}
	
	// 회원가입 출력문구
	public void printJoin() {
		System.out.println();
		System.out.println("=== 회원가입 ===");
	}
	
	// 이름 입력
	public String getName() {
		System.out.print("이름) ");
		String name = sc.next();
		return name;
	}
	
	// 아이디 입력
	public String getId() {
		System.out.print("아이디) ");
		String id = sc.next();
		return id;
	}
	
	public void checkIdTrue() {
		System.out.println("사용 가능한 아이디입니다!");
	}

	public void checkIdFalse() {
		System.out.println("이미 사용 중인 아이디입니다...");
	}
	
	// 비밀번호 입력(+재확인)
	public String getPw() {
		String pw = null;
		while (true) {
			System.out.print("비밀번호) ");
			pw = sc.next();
			System.out.print("비밀번호 재확인) ");
			String pw2 = sc.next();
			if (pw.equals(pw2)) {
				break;
			}
			System.out.println("비밀번호가 일치하지 않습니다.\n");
		}
		return pw;
	}
	
	// 회원가입 성공
	public void joinTrue(MemberVO vo) {
		System.out.println(vo.getName() + "님, 환영합니다! :D");
	}

	// 회원가입 실패
	public void joinFalse(MemberVO vo) {
		System.out.println("회원가입이 실패했습니다...");
	}
	
	// 로그인
	public MemberVO login() {
		// 데이터를 2개 이상 전달해야 할 때,
		// VO를 사용한다!
		MemberVO vo = new MemberVO();
		System.out.println();
		System.out.println("=== 로그인 ===");
		System.out.print("아이디) ");
		String id = sc.next();
		System.out.print("비밀번호) ");
		String pw = sc.next();
		System.out.println("==============");
		
		vo.setId(id);
		vo.setPw(pw);
		return vo;
	}
	
	// 로그인 성공
	public void loginTrue(MemberVO vo) {
		System.out.println(vo.getName() + "님, 안녕하세요! :D");
	}

	// 로그인 실패
	public void loginFalse() {
		System.out.println("로그인 실패...");
		System.out.println("없는 아이디거나 비밀번호가 틀렸습니다.");
	}
	
	// 로그아웃
	public void logout() {
		System.out.println("로그아웃되었습니다.");
	}
	
	// 마이페이지 메뉴
	public int printMyPage() {
		int action = 0;
		
		while (true) {
			try {
				System.out.println();
				System.out.println("=== 마이페이지 ===");
				System.out.println("1. 회원정보 변경");
				System.out.println("2. 회원 탈퇴\n(돌이킬 수 없습니다. 신중하게 선택하세요)");
				System.out.println("==================");
				System.out.print("입력) ");
				action = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("정수로 입력해주세요!");
				continue;
			}
			// 종료 조건
			if (action >= 1 && action <= 2) { // action이 1이상 2이하라면
				break;
			}
			System.out.println("범위를 확인하고 다시 입력해주세요!");
		}
		return action;
	}
	
	// 정보 변경 메뉴
	public int printUpdate() {
		int action = 0;
		while (true) {
			try {
				System.out.println();
				System.out.println("=== 회원정보 변경 ===");
				System.out.println("1. 이름 변경");
				System.out.println("2. 비밀번호 변경");
				System.out.println("==================");
				System.out.print("입력) ");
				action = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("정수로 입력해주세요!");
				continue;
			}
			// 종료 조건
			if (action >= 1 && action <= 2) { // action이 1이상 2이하라면
				break;
			}
			System.out.println("범위를 확인하고 다시 입력해주세요!");
		}
		return action;
	}
	
	// 관리자 메뉴
	public int printAdminMenu() {
		int action = 0;
		while (true) {
			try {
				System.out.println();
				System.out.println("=== 관리자 모드 ===");
				System.out.println("1. 상품 정보 변경");
				System.out.println("2. 로그아웃");
				System.out.println("===================");
				System.out.print("입력) ");
				action = sc.nextInt();
			} catch (Exception e) { // 문자열 입력 시
				sc.nextLine();
				System.out.println("정수로 입력해주세요!");
				continue;
			}
			// 종료 조건
			if (action >= 1 && action <= 2) { // action이 1이상 2이하라면
				break;
			}
			System.out.println("범위를 확인하고 다시 입력해주세요!");
		}
		return action;
	}
	
	public int printUpdateMenu() {
		int action = 0;
		while (true) {
			try {
				System.out.println();
				System.out.println("=== 상품 정보 변경 ===");
				System.out.println("1. 상품 가격 변경");
				System.out.println("2. 상품 이름 변경");
				System.out.println("3. 상품 재고 변경");
				System.out.println("4. 뒤로 가기");
				System.out.println("======================");
				System.out.print("입력) ");
				action = sc.nextInt();
			} catch (Exception e) { // 문자열 입력 시
				sc.nextLine();
				System.out.println("정수로 입력해주세요!");
				continue;
			}
			// 종료 조건
			if (action >= 1 && action <= 4) { // action이 1이상 4이하라면
				break;
			}
			System.out.println("범위를 확인하고 다시 입력해주세요!");
		}
		return action;
	}
	
	// 상품 메뉴
	public int printMenu() {
		int action = 0;
		while (true) {
			try {
				System.out.println();
				System.out.println("===== 서비스 =====");
				System.out.println("1. 상품 목록 출력");
				System.out.println("2. 상품 선택 구매");
				System.out.println("3. 마이페이지");
				System.out.println("2. 로그아웃");
				System.out.println("==================");
				System.out.print("입력) ");
				action = sc.nextInt();
			} catch (Exception e) { // 문자열 입력 시
				sc.nextLine();
				System.out.println("정수로 입력해주세요!");
				continue;
			}
			// 종료 조건
			if (action >= 1 && action <= 4) { // action이 1이상 2이하라면
				break;
			}
			System.out.println("범위를 확인하고 다시 입력해주세요!");
		}
		return action;
	}
	
	// 상품 목록 출력
	public void printProductMenu(ArrayList<ProductVO> products) {
		System.out.println();
		System.out.println("=== 상품 목록 ===");
		for (ProductVO v : products) { // PK.상품명 0원 [2]
			System.out.println(v.getNum() + "." + v.getName() + " " + v.getPrice() + "원 [" + v.getCnt() + "]");
		}
	}
	
	// 상품 1개 선택 구매
	// 재고 0인 상품은 조회조차 안 되게
	public int buyProduct(ArrayList<ProductVO> products) {
		System.out.println();
		System.out.println("=== 상품 목록 ===");
		for (ProductVO v : products) { // [X] 상품명 0원
			if(v.getCnt() == 0) { // 재고가 없다면
				System.out.print("[X] ");
			} else { // 재고가 있다면
				System.out.print(v.getNum() + ". ");
			}
			System.out.println(v.getName() + " " + v.getPrice() + "원");
		}
		System.out.println("=================");
		System.out.print("구매할 상품 번호 입력) ");
		int num = sc.nextInt();
		return num;
	}
	
	public int printUpdateProduct(ArrayList<ProductVO> products) {
		System.out.println();
		this.printProductMenu(products);
		System.out.println("=================");
		System.out.print("관리할 상품 번호 입력) ");
		int num = sc.nextInt();
		return num;
	}
	
	// 상품 이름 입력
	public String getPName() {
		System.out.print("변경할 상품명) ");
		String name = sc.next();
		return name;
	}
	
	// 상품 가격 입력
	public int getPPrice() {
		System.out.print("변경할 가격) ");
		int price = sc.nextInt();
		return price;
	}
	
	// 상품 재고 입력
	public int getPCnt() {
		System.out.print("변경할 재고) ");
		int cnt = sc.nextInt();
		return cnt;
	}
	
	public void buyTrue(MemberVO mvo, ProductVO pvo) {
		System.out.println("");
		System.out.println("===영수증===");
		System.out.println(pvo.getName() + " " + pvo.getPrice() + "원");
		System.out.println(mvo.getName() + "님, " + pvo.getName() + "(을)를 구매환료했습니다."); // ㅁㅁㅁ님, ㅁㅁㅁ를 구매 완료했습니다.
	}
	
	public void buyFalse() {
		System.out.println("구매 실패... 잠시 후 다시 용해주세요");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
