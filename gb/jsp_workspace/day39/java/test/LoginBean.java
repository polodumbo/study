package test;

public class LoginBean {
	// Bean 클래스
	// jsp에서 활용되는 java 로직
	private String id;
	private String pw;

	final String ID = "test";
	final String PW = "1234";

	public boolean login() {
		if (id.equals(ID) && pw.equals(PW)) {
			return true;
		}
		return false;
	}

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
}