package test;

public class D_LoginBean {
	private String userId;
	private String userPw;
	private boolean isIdTrue;
	private boolean isPwTrue;
	private String msg;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public boolean isIdTrue() {
		return isIdTrue;
	}

	public void setIdTrue(boolean isIdTrue) {
		this.isIdTrue = isIdTrue;
	}

	public boolean isPwTrue() {
		return isPwTrue;
	}

	public void setPwTrue(boolean isPwTrue) {
		this.isPwTrue = isPwTrue;
	}

	public String getMsg() {
		return msg;
	}

	public void login() {
		if (this.userId.equals("timo")) {
			if (this.userPw.equals("1234")) {
				this.msg = "안녕하세요, " + this.userId + "님!";
				return;
			}
			this.msg = "비번오류!";
			return;
		}
		this.msg = "없는 아이디!";
	}

}
