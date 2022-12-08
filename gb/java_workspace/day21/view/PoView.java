package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.PoVO;

// ★ 사용자만 생각
// ★ 화면에 대한 고민은 이곳에서!
public class PoView {
	private Scanner sc;

	public PoView() {
		sc = new Scanner(System.in);
	}

	public int printMenu() {
		System.out.println();
		System.out.println(" === 메뉴 ===");
		System.out.println("1. 포켓몬 추가");
		System.out.println("2. 목록 출력");
		System.out.println("3. 포켓몬 출력");
		System.out.println("4. 레벨 변경");
		System.out.println("5. 포켓몬 삭제");
		System.out.println("6. 검색");
		System.out.println("7. 프로그램 종료");
		System.out.print(">>> ");
		int action = sc.nextInt();
		return action;
	}

	public String getName() {
		System.out.print("포켓몬 이름입력: ");
		String name = sc.next();
		return name;
	}

	public int getLv() {
		System.out.print("포켓몬 레벨입력: ");
		int lv = sc.nextInt();
		return lv;
	}

	public int getNum() {
		System.out.print("포켓몬 번호입력: ");
		int num = sc.nextInt();
		return num;
	}

	public void printData(ArrayList<PoVO> datas) {
		if (datas.isEmpty()) {
			System.out.println("출력할 포켓몬 데이터가 없습니다...");
			return;
		}
		System.out.println();
		System.out.println(" == 포켓몬 수첩 목록 ==");
		for (PoVO data : datas) {
			System.out.println(data);
		}
	}

	public void printData(PoVO data) {
		if (data == null) {
			System.out.println("해당 포켓몬은 없습니다...");
			return;
		}
		System.out.println();
		System.out.println("선택한 포켓몬은 [" + data.getName() + "]입니다.");
	}

	public void powerOff() {
		System.out.println("프로그램 종료...");
	}

	public void checkTrue() {
		System.out.println("성공했습니다!");
	}

	public void checkFalse() {
		System.out.println("실패했습니다...");
	}

}
