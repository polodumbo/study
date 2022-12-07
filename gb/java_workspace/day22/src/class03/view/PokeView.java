package class03.view;

import java.util.ArrayList;
import java.util.Scanner;

import class03.model.PokeVO;

public class PokeView {
	private Scanner sc;
	private int action;
	
	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public PokeView() {
		sc = new Scanner(System.in);
	}
	
	public void printMenu() {
		System.out.println("===포켓몬 도감===");
		System.out.println("1. 포켓몬 추가");
		System.out.println("2. 수첩 전체 출력");
		System.out.println("3. 포켓몬 출력");
		System.out.println("4. 이름으로 포켓몬 검색");
		System.out.println("5. 단어로 포켓몬 검색");
		System.out.println("6. 레벨 변경");
		System.out.println("7. 포켓몬 삭제");
		System.out.println("8. 프로그램 종료");
		System.out.print("입력) ");
		this.action = sc.nextInt();
	}
	
	public String getName() {
		System.out.print("포켓몬 이름 입력) ");
		String str = sc.next();
		return str;
	}
	
	public String getWord() {
		System.out.print("검색할 단어 입력) ");
		String str = sc.next();
		return str;
	}
	
	public int getNum() {
		System.out.print("포켓몬 번호 입력) ");
		int num = sc.nextInt();
		return num;
	}
	
	public int getLevel() {
		System.out.print("포켓몬 레벨 입력) ");
		int num = sc.nextInt();
		return num;
	}
	
	public void printData(ArrayList<PokeVO> pokes) {
		if (pokes.isEmpty()) {
			System.out.println("해당 포켓몬이 없습니다.");
			return;
		}
		System.out.println("=====목록=====");
		for (PokeVO v : pokes) {
			System.out.println(v);
		}
	}
	
	public void printData(PokeVO poke) {
		if (poke == null) {
			System.out.println("해당 번호의 포켓몬은 없습니다.");
			return;
		}
		System.out.println("선택한 포켓몬은 [" + poke.getName() + "]입니다.");
	}
	
	public void powerOff() {
		System.out.println("프로그램 종료...");
	}
	
	public void checkTrue() {
		System.out.println("성공");
	}
	
	public void checkFalse() {
		System.out.println("실패");
	}
	
}
