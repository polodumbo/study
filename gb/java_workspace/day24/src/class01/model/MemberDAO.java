package class01.model;

import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberVO> mdatas;
	public MemberDAO() {
		mdatas=new ArrayList<MemberVO>();
		
		// 샘플 데이터
		mdatas.add(new MemberVO("timo","1234","티모"));
		mdatas.add(new MemberVO("admin","1234","관리자"));
	}
	public MemberVO selectOne(MemberVO mvo) {
		// 로그인 로직
		for(int i=0;i<mdatas.size();i++) {
			if(mdatas.get(i).getId().equals(mvo.getId())) {
				System.out.println("   로그: 아이디 존재함");
				if(mdatas.get(i).getPw().equals(mvo.getPw())) {
					System.out.println("   로그: 비밀번호 일치함");
					System.out.println("   로그: 로그인 성공");
					return mdatas.get(i);
				}
			}
		}
		System.out.println("   로그: 로그인 실패");
		return null;
	}
	public boolean checkId(MemberVO mvo) {
		for(int i=0;i<mdatas.size();i++) {
			if(mdatas.get(i).getId().equals(mvo.getId())) {
				System.out.println("  로그: 아이디 중복");
				return true;
			}
		}
		System.out.println("  로그: 아이디 중복아님");
		return false;
	}
	public boolean insert(MemberVO mvo) {
		MemberVO data=new MemberVO();
		data.setId(mvo.getId());
		data.setName(mvo.getName());
		data.setPw(mvo.getPw());
		mdatas.add(data);
		return true;		
	}
	public boolean update(MemberVO mvo) {
		for(int i=0;i<mdatas.size();i++) {
			if(mdatas.get(i).getId().equals(mvo.getId())) {
				if(mdatas.get(i).getPw().equals(mvo.getPw())){
					mdatas.get(i).setPw(mvo.getNpw());
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
	
}
