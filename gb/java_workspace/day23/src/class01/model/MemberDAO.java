package class01.model;

import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberVO> members;

	public MemberDAO() {
		members = new ArrayList<MemberVO>();

		// 샘플 데이터
		members.add(new MemberVO("admin", "admin", "관리자"));
		members.add(new MemberVO("timo", "1234", "티모"));
	}

	// 로그인 R
	public MemberVO selectOne(MemberVO mvo) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getId().equals(mvo.getId())) {
				System.out.println("\t로그: 아이디 존재함");
				if (members.get(i).getPw().equals(mvo.getPw())) {
					System.out.println("\t로그: 비밀번호 일치함");
					System.out.println("\t로그: 로그인 성공");
					return members.get(i);
				}
				System.out.println("\t로그: 비밀번호 불일치");
			}
		}
		System.out.println("\t로그: 로그인 실패...");
		return null;
	}

	// 회원 정보 변경 U
	public boolean update(MemberVO mvo) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getId().equals(mvo.getId())) { // 더블체크
				if (mvo.getName() != null) { // mvo의 이름이 있다면
					members.get(i).setName(mvo.getName()); // 이름 변경
					System.out.println("\t로그: 이름 변경 성공");
				} else { // 이름이 없다면 == 비밀번호가 있다면
					members.get(i).setPw(mvo.getPw()); // 비밀번호 변경
					System.out.println("\t로그: 비밀번호 변경 성공");
				}
				System.out.println("\t로그: 회원정보 변경 성공");
				return true;
			}
		}
		System.out.println("\t로그: 회원정보 변경 실패");
		return false;
	}

	// 회원 탈퇴 D
	public boolean delete(MemberVO mvo) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getId().equals(mvo.getId())) { // 더블체크
				members.remove(i);
				System.out.println("\t로그: 회원 탈퇴 성공");
				return true;
			}
		}
		System.out.println("\t로그: 회원 탈퇴 실패");
		return false;
	}

	// 회원가입 - id 중복검사 R
	public boolean checkId(MemberVO mvo) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getId().equals(mvo.getId())) { // 더블체크
				System.out.println("\t로그: 이미 있는 id");
				return false;
			}
		}
		System.out.println("\t로그: 사용 가능한 id");
		return true;
	}

	// 회원가입 C
	public boolean insert(MemberVO mvo) {
		try {
			members.add(mvo);
		} catch (Exception e) {
			System.out.println("\t로그: 회원가입 실패");
			return false;
		}
		System.out.println("\t로그: 회원가입 성공");
		return true;
	}

}
