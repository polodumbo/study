package class01;

import java.util.Random;
import java.util.Scanner;

// 1. 객체
// 2. CRUD
// 3. 유효성 및 경계값 검사
class Student {
	private String name;
	private int score;
	private char grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	// ㅁㅁ학생 ㅁㅁ점 ㅁ등급 출력
	@Override
	public String toString() {
		return this.name + "학생 " + this.score + "점 " + this.grade + "등급";
	}

	void setScore() {
		this.score = new Random().nextInt(101);
		this.grade = 'C';
		if (this.score >= 80) {
			this.grade = 'A';
		} else if (this.score >= 60) {
			this.grade = 'B';
		}
	}

	Student(String name) {
		this.name = name;
		this.setScore();
	}
}

public class Test01 {
	public static void main(String[] args) {
		Student[] datas = new Student[3];
		int index = 0; // 현재 0명 저장됨
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=====학생부=====");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 성적 변경");
			System.out.println("4. 학생 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("===============");
			System.out.print("입력) ");
			int act = sc.nextInt();
			if (act == 1) {
				if (index >= datas.length) { // 배열 크기 고려
					System.out.println("저장할 공간이 없습니다!");
					continue;
				}
				
				System.out.print("학생 이름 입력: ");
				// 학생 이름 입력)
				String name = sc.next();
				// 생성자 호출
				// 객체를 생성
				// 생성된 객체를 배열에 저장
				datas[index] = new Student(name);
				index++; // 증가
			} else if (act == 2) {
				if (index == 0) { // 정보가 없을 때
					System.out.println("출력할 정보가 없습니다...");
					continue;
				}
				System.out.println();
				System.out.println("### 학생목록 ###");
				// 내가 저장한 학생까지만 출력
				for (int i = 0; i < index; i++) {
					System.out.println(datas[i]);
				}
				
				// 배열에서는 데이터가 중간에 비게 할 시에 데이터 관리가 어려워 그렇게 하지 않는다.
//				for (Student v : datas) {
//					if (v == null) {continue;}
//					System.out.println(v.name + "학생 " + v.score + "점 " + v.grade + "등급");
//				}
				System.out.println();
			} else if (act == 3) {
				// 몇 번 학생을 변경?
				// 다시 한 번 랜덤 > 등급
				// (필요 시 메서드 추가)
				if (index == 0) {
					System.out.println("변경할 데이터가 없습니다...");
					continue;
				}
				int num = 0;
				while (true) {
					// 학생 목록 출력
					for (int i = 0; i < index; i++) {
						System.out.println("[" + (i + 1) + "]" + datas[i]);
					}
					System.out.print("몇 번째 학생의 성적을 변경할 것인가요? ");
					num = sc.nextInt();
					if (num >= 1 && num <= index) {
						break;
					}
					System.out.println("잘못된 번호입니다");
					System.out.println();
				}
				datas[num - 1].setScore();
				System.out.println("점수가 변경되었습니다.");
				System.out.println(datas[num - 1]);
				System.out.println();
				
			} else if (act == 4) {
				if (index == 0) {
					System.out.println("삭제할 데이터가 없습니다...");
					continue;
				}
				// 일반적으로 배열을 이용 X
				// 그래서 현재 삭제는 "가장 최근 데이터 삭제"
				System.out.print("정말 삭제할까요?(YES) ");
				String ans = sc.next();
				if (!ans.equals("YES")) { // 삭제 취소
					System.out.println("삭제 취소!");
					continue;
				}
				index--;
				System.out.println(datas[index].getName() + "학생. 삭제 완료!");
			} else if (act == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("제대로 입력해주세요.");
			}
				
		}
	}
}
