package test;

public class MemberVO {
	private String id;
	private String pw;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		MemberVO vo = (MemberVO)obj;
		if (this.id.equals(vo.getId())) {
			if (this.pw.equals(vo.getPw())) {
				System.out.println("\t로그: 로그인 성공");
				return true;
			}
			System.out.println("\t로그: 로그인 실패 - 비밀번호 불일치");
		}
		System.out.println("\t로그: 로그인 실패 - 아이디 없음");
		return false;
	}
	
	
	public String toString() {
		return "아이디: " + id + ", 비밀번호: " + pw + ", 이름: " + name + "]";
	}

	public MemberVO() {
		this(null, null, null);
	}

	public MemberVO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

}