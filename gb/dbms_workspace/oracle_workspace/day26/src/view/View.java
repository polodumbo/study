package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberVO;

public class View {
	Scanner sc;

	public View() {
		sc = new Scanner(System.in);
	}

	public int getAction() {
		System.out.println();
		System.out.println("1. INSERT");
		System.out.println("2. SELECTALL");
		System.out.println("3. SELECTONE");
		System.out.println("4. UPDATE");
		System.out.println("5. DELETE");
		System.out.print("입력 >> ");
		int act = sc.nextInt();
		return act;
	}

	public MemberVO getMemberInfo() {
		MemberVO mvo = new MemberVO();
		System.out.print("추가할 이름 입력 >> ");
		String name = sc.next();
		mvo.setName(name);
		System.out.print(name + "님 나이 입력 >> ");
		int age = sc.nextInt();
		mvo.setAge(age);
		return mvo;
	}

	public int updateGetNum() {
		System.out.print("변경할 주민번호 입력 >> ");
		int num = sc.nextInt();
		return num;
	}

	public int updateGetAge() {
		System.out.print("변경할 나이 입력 >> ");
		int num = sc.nextInt();
		return num;
	}

	public int delete() {
		System.out.println("삭제할 번호 입력 >> ");
		int num = sc.nextInt();
		return num;
	}

	public void printTrue() {
		System.out.println("성공");
	}

	public void printFalse() {
		System.out.println("실패");
	}

	public void printDatas(ArrayList<MemberVO> members) {
		if (members.isEmpty()) {

		}
	}

}
