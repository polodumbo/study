package test;

import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberVO> members;
	
	public MemberDAO() {
		members = new ArrayList<MemberVO>();
		members.add(new MemberVO("timo", "timo1234", "티모"));
		members.add(new MemberVO("ari", "test", "아리"));
		members.add(new MemberVO("apple", "pie", "사과"));
	}
	
	public boolean insert(MemberVO mvo) {
		MemberVO newMember = new MemberVO();
		newMember.setId(mvo.getId());
		newMember.setPw(mvo.getPw());
		newMember.setName(mvo.getName());
		members.add(newMember);
		return true;
	}
	
	public MemberVO selectOne(MemberVO mvo) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).equals(mvo)) {
				return members.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<MemberVO> selectAll(MemberVO mvo) {
		if (mvo == null) {
			return members;
		}
		return null;
	}
}