package class01.model;

public class MemberVO {
	private String id; // PK
	private String pw;
	private String name;
	private String npw; // 실제 데이터 xxx. 로직을 수행할때에 사용하게될 속성!
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
	public String getNpw() {
		return npw;
	}
	public void setNpw(String npw) {
		this.npw = npw;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	public MemberVO() {
		
	}
	public MemberVO(String id,String pw,String name) {
		this.id=id;
		this.pw=pw;
		this.name=name;
	}
}
