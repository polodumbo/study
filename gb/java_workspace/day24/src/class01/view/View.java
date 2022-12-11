package class01.view;

import java.util.ArrayList;
import java.util.Scanner;

import class01.model.MemberVO;
import class01.model.ProductVO;


public class View {
	private int mAction;
	private int sAction;
	private Scanner sc;
	public View() {
		mAction=3;
		sAction=5;
		sc=new Scanner(System.in);
	}
	public int printStart() {
		// 1. 사용자의 입력값을 검사 == 유효성 검사
		// 2. 사용자에게 상황을 안내 == 사용자 편의성 고려
		int action;
		while(true) {
			try {
				System.out.println();
				System.out.println("=== 메인화면 ===");
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("3. 프로그램 종료");
				System.out.print(">>> ");
				action=sc.nextInt();
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("정수로 다시 입력해주세요!");
				continue;
			}
			if(1<=action && action<=mAction) {
				break;
			}
			System.out.println("범위를 확인하고 다시 입력해주세요!");
		}
		return action;
	}
	public void powerOff() {
		for(int i=0;i<5;i++) {
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
	public MemberVO login() {
		// 데이터를 2개이상 전달해야할때,
		// VO를 사용한다!
		System.out.println();
		System.out.println(" === 로그인 ===");
		System.out.print("아이디 >> ");
		String id=sc.next();
		System.out.print("비밀번호 >> ");
		String pw=sc.next();
		MemberVO vo=new MemberVO();
		vo.setId(id);
		vo.setPw(pw);
		return vo;
	}
	public void loginTrue(MemberVO vo) {
		System.out.println(vo.getName()+"님, 안녕하세요! :D");
	}
	public void loginFalse() {
		System.out.println("로그인 실패...");
		System.out.println("아이디 or 비밀번호를 다시 확인해보세요!");
	}
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	public int printMenu() {
		int action;
		while(true) {
			try {
				System.out.println();
				System.out.println("=== 서비스 ===");
				System.out.println("1. 상품 목록 출력");
				System.out.println("2. 상품 선택 구매");
				System.out.println("3. 로그아웃");
				System.out.println("4. 회원탈퇴");
				System.out.println("5. 비밀번호변경");
				System.out.print(">>> ");
				action=sc.nextInt();
			} catch(Exception e){
				sc.nextLine();
				System.out.println("정수로 다시 입력해주세요!");
				continue;
			}
			if(1<=action && action<=sAction) {
				break;
			}
			System.out.println("범위를 확인하고 다시 입력해주세요!");
		}
		return action;
	}
	public void printProductMenu(ArrayList<ProductVO> datas) {
		System.out.println();
		System.out.println(" === 상품 목록 ===");
		for(ProductVO v:datas) {
			System.out.println(v.getNum()+". "+v.getName()+" "+v.getPrice()+"원 ["+v.getCnt()+"]");
		}
	}
	public int buyProduct(ArrayList<ProductVO> datas) {
		System.out.println();
		System.out.println(" === 상품 목록 ===");
		for(ProductVO v:datas) {
			if(v.getCnt()==0) {
				System.out.print("[X] ");
			}
			else {
				System.out.print(v.getNum()+". ");
			}
			System.out.println(v.getName()+" "+v.getPrice()+"원");
		}
		System.out.print("구매할 상품번호 >> ");
		int num=sc.nextInt();
		return num;
	}
	public void buyTrue(MemberVO mvo,ProductVO pvo) {
		System.out.println("");
		System.out.println(" === 영수증 ===");
		System.out.println(pvo.getName()+" "+pvo.getPrice()+"원");
		System.out.println(mvo.getName()+"님, "+pvo.getName()+"를(을) 구매완료했습니다.");
	}
	public void buyFalse() {
		System.out.println("구매실패... 잠시후 다시 이용해주세요!");
	}
	public String getId() {
		System.out.print("아이디 입력 >> ");
		String id=sc.next();
		return id;
	}
	public void printInfo() {
		System.out.println("이미 사용중인 아이디입니다. 확인후 다시 이용해주세요!");
	}
	public String getPw() {
		System.out.print("비밀번호 입력 >> ");
		String pw=sc.next();
		// 비밀번호 재입력 (유효성 검사) 추가하기
		return pw;
	}
	public String getName() {
		System.out.print("이름 입력 >> ");
		String name=sc.next();
		return name;
	}
	public void signupTrue() {
		System.out.println("회원가입 성공! :D");
	}
	public void signupFalse() {
		System.out.println("회원가입 실패...");
	}
	public boolean getCheck(MemberVO vo) {
		System.out.println(vo.getName()+"님, 정말 탈퇴하시겠습니까? [Y/N]");
		String ans=sc.next();
		if(ans.equals("Y")) {
			return true;
		}
		return false;
	}
	public MemberVO memberInfo(MemberVO mvo) {
		System.out.println(mvo.getName()+"님의 회원정보를 변경합니다.");
		System.out.println("현재 비밀번호 입력 >> ");
		String pw=sc.next();
	
		// 현재 비밀번호가 올바르게 입력되었는지 확인하는 것은
		// MODEL 파트입니다.
		//  ex) 아이디 중복확인 로직과 같습니다.
		
		System.out.println("변경할 비밀번호 입력 >> ");
		String npw=sc.next();
		mvo.setNpw(npw);
		// 비밀번호 입력 확인 (유효성 검사) 추가하기
		
		return mvo;
		// 현재 로그인한 사람의 정보 + 변경된 비번
	}
	
	
	
	
	
	
	
	
	
	
	





}
