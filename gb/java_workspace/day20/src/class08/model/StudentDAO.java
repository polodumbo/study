package class08.model;

import java.util.ArrayList;

public class StudentDAO {
	private int PK;
	private ArrayList<StudentVO> students;

	public StudentDAO() {
		PK = 1001;
		students = new ArrayList<StudentVO>();
		students.add(new StudentVO(PK++, "홍길동", 90));
		students.add(new StudentVO(PK++, "임꺽정", 72));
	}

	// C : 학생부에 학생을 추가
	public void insert(String name, int score) { // 이름과 성적을 파라미터로 받는다.
		students.add(new StudentVO(PK++, name, score));
		System.out.println("\t로그: insert 수행 완료");
	}

	// R : selectAll, getAll 학생부 목록 출력
	public ArrayList<StudentVO> selectAll() {
		return students;
	}

	// R : selectOne, getOne 학생 1명 출력
	public StudentVO selectOne(int num) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNum() == num) {
				System.out.println("\t로그: selectOne 성공");
				return students.get(i);
			}
		}
		System.out.println("\t로그: selectOne 실패");
		return null;
	}

	// U : 이름 변경, 성적 변경 // PK가 아닌 속성 변경
	public void updateScore(int num, int score) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNum() == num) {
				students.get(i).setScore(score);
				System.out.println("\t로그: updateScore 성공");
				return;
			}
		}
		System.out.println("\t로그: updateScore 실패");
	}

	// D : 학생부에서 학생을 삭제
	public void delete(int num) { // 정확한 객체를 파악하기 위해 파라미터로 PK를 받는다.
//		students.remove(학생정보);
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNum() == num) {
				students.remove(i);
				System.out.println("\t로그: delete 성공");
				return;
			}
		}
		System.out.println("\t로그: delete 실패");
	}

}
