package model;

import java.util.ArrayList;

public class StudentDAO {
	private int PK;
	ArrayList<StudentVO> datas;

	public StudentDAO() {
		PK = 1001;

		datas = new ArrayList<StudentVO>();
		datas.add(new StudentVO(PK++, "홍길동", 91));
		datas.add(new StudentVO(PK++, "임꺽정", 86));
		// 샘플 데이터
	}

	// 학생추가 C
	// 이름변경 U
	// 성적변경 U
	// 학생삭제 D
	// C로부터 데이터를 받아와서, M에게 넘겨주는 작업
	public void insert(String name, int score) {
		datas.add(new StudentVO(PK++, name, score));
		System.out.println("  로그: 학생추가 성공");
	}

	public void updateName(int num, String name) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == num) {
				datas.get(i).setName(name);
				System.out.println("  로그: 이름변경 성공");
				return;
			}
		}
		System.out.println("  로그: 이름변경 실패");
	}

	public void updateScore(int num, int score) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == num) {
				datas.get(i).setScore(score);
				System.out.println("  로그: 성적변경 성공");
				return;
			}
		}
		System.out.println("  로그: 성적변경 실패");
	}

	public void delete(int num) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == num) {
				datas.remove(i);
				System.out.println("  로그: 학생삭제 성공");
				return;
			}
		}
		System.out.println("  로그: 학생삭제 실패");
	}

	// 목록보기 R
	// 학생보기 R
	// M이 C에게 데이터를 전달하는 작업
	public ArrayList<StudentVO> selectAll() {
		return datas;
	}

	public StudentVO selectOne(int num) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == num) {
				return datas.get(i);
			}
		}
		return null;
	}

}
