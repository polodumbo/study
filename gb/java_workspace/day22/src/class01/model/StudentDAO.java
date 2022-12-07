package class01.model;

import java.util.ArrayList;

public class StudentDAO {
	private int PK;
	ArrayList<StudentVO> students;
	
	public StudentDAO() {
		PK = 1001;
		students = new ArrayList<StudentVO>();
		
		// 샘플 데이터 : 프로그램 시작하자마자 저장되어 있는 데이터
		students.add(new StudentVO(PK++, "홍길동", 91, 20));
		students.add(new StudentVO(PK++, "임꺽정", 86, 23));
	}
	
	// CRUD
	// CUD : Ctrl로부터 데이터를 받아와서, Model에게 넘겨주는 작업, output X
	// 학생 추가 C
//	public void insert(String name, int score, int age) {
	public boolean insert(StudentVO vo) {
		try {
			students.add(new StudentVO(PK++, vo.getName(), vo.getScore(), vo.getAge()));
			System.out.println("\t로그: 학생추가 성공");
		} catch (Exception e) {
			System.out.println("\t로그: 학생추가 실패");
			return false;
		}
		return true;
	}
	// 주어가 null일 때
	// 메서드를 수행 X
	// 연산자로 확인
	// 이름 변경 & 성적 변경 U
	public boolean update(StudentVO vo) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNum() == vo.getNum()) {
//				if (vo.getName() != null) { // 변경할 이름 정보가 있니?
				if (!vo.getName().isEmpty()) {
					students.get(i).setName(vo.getName());
				}
				else {
					students.get(i).setScore(vo.getScore());
					
				}
				System.out.println("\t로그: 학생 정보 변경 성공");
				return true;
			}
		}
		System.out.println("\t로그: 학생 정보 변경 실패");
		return false;
	}

	// 성적 변경 U
//	public void updateScore(StudentVO vo) {
//		for (int i = 0; i < students.size(); i++) {
//			if (students.get(i).getNum() == vo.getNum()) {
//				students.get(i).setScore(vo.getScore());
//				System.out.println("\t로그: 성적 변경 성공");
//				return;
//			}
//		}
//		System.out.println("\t로그: 성적 변경 실패");
//	}
	
	// 학생 삭제 D
	public boolean delete(StudentVO vo) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNum() == vo.getNum()) {
				students.remove(i);
				System.out.println("\t로그: 학생 삭제 성공");
				return true;
			}
		}
		System.out.println("\t로그: 학생 삭제 실패");
		return false;
	}
	
	// Model이 Controller에게 데이터를 전달하는 작업, output O
	// 목록 보기 R
	public ArrayList<StudentVO> selectAll(StudentVO vo) {
		// students가 비어 있다면
		if (students.isEmpty()) {
			return null;
		}
		
		// 인자로 null이 넘어왔다면
		if (vo == null) {
			return students;
		}
		
		ArrayList<StudentVO> resStudents = new ArrayList<StudentVO>();
		if (vo.getName() != null) { // 이름이 설정되어 있다면
			// 이름으로 검색
			for (int i = 0; i < students.size(); i++) {
				if (students.get(i).getName().contains(vo.getName())) {
					resStudents.add(students.get(i));
				}
			}
		} else { // 이름이 설정되어 있지 않나면
			// 성적으로 검색
			for (int i = 0; i < students.size(); i++) {
				if (students.get(i).getScore() >= vo.getScore()) {
					resStudents.add(students.get(i));
				}
			}
		}
		return resStudents;
	}
	
	// 학생 보기 R
	public StudentVO selectOne(StudentVO vo) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNum() == vo.getNum()) {
				return students.get(i);
			}
		}
		return null;
	}
}