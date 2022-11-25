package class04;

import java.util.Scanner;

class Member {
	private String id; // PK
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
	public String toString() {
		return this.id + "님은 " + this.name + "입니다. [" + this.pw + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		 // id 중복검사
		if (obj instanceof String) {
			String id = (String)obj;
			if (this.id.equals(id)) {
				return true;
			}
			return false;
		} else if (obj instanceof Member) { // 로그인 시 id와 pw를 객체로 받아오자
			Member member = (Member)obj;
			if (this.id.equals(member.id) && this.pw.equals(member.pw)) {
				System.out.println("로그인 성공");
				System.out.println(member.id + "님 어서오세요.");
				return true;
			}
			return false; 
		}
		return false;
	}

	// 로그인 확인용 객체 생성
	Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	Member(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}

class Board {
	private int num; // PK
	private String title;
	private String content;
	private String writer; // Member의 id
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "[" + this.num + "]" + this.title + " " + this.content + " - " + this.writer;
	}
	
	Board(int num, String title, String content, String writer) {
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
}

public class Test01 {

	public static void main(String[] args) {
		Member[] mdatas = new Member[3]; // 총 회원 수 
		int mIndex = 0; // 현재 회원 수
		Board[] bdatas = new Board[3]; // 총 게시글 개수
		int bIndex = 0; // 현재 게시글 수
		
		int NUM= 101;
		// ★ PK는 특수한 경우를 제외하고서는, 중복을 허용하지 않기에(유일하기에) 프로그램에서 자동으로 부여하는 것이 일반적이다!
		// ex) 특수한 경우: ID, 
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=============");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 프로그램 종료");
			System.out.println("=============");
			System.out.print("입력) ");
			int act = sc.nextInt();
			if (act == 1) { // 1. 회원가입
				if (mIndex >= mdatas.length) {
					System.out.println("회원수가 가득 찼습니다.");
					continue;
				}
				// ID 입력 받음
				// 단, ID가 중복되지 않아야 한다
				// PW, NAME 중복되어도 괜찮음
				// 회원생성 > 배열 추가
				String id = "";
				String pw = "";
				String name = "";
				while (true) {
					while (true) { // id 입력 반복
						System.out.print("id를 입력하세요) ");
						id = sc.next();
						boolean isAlreadyExist = true;
						for (int i = 0; i < mIndex; i++) {
							if (mdatas[i].getId().equals(id)) {
								isAlreadyExist = false;
							}
						}
						if (isAlreadyExist) {
							System.out.println("사용 가능한 ID입니다.");
							break;
						}
						System.out.println("이미 사용 중인 ID입니다.");
					}
					
					while (true) { // pw 검사 반복
						System.out.print("비밀번호를 입력하세요) ");
						pw = sc.next();
						System.out.print("비밀번호를 한 번 더 입력하세요) ");
						String pw2 = sc.next();
						
						if (pw.equals(pw2)) {
							break;
						}
						System.out.println("\n비밀번호가 다릅니다. 다시 입력해주세요.\n");
					}
					System.out.print("이름을 입력하세요) ");
					name = sc.next();
					break;
				}
				mdatas[mIndex] = new Member(id, pw, name); // 입력 받은 정보대로 객체 선언
				System.out.println(mdatas[mIndex].getId() + "님, 회원가입 완료!");
				mIndex++;
			} else if (act == 2) { // 2. 로그인
				// ID, PW 입력
				// 입력이 잘 되었는지 확인
				// "통과"
				// 로그인 실패...
				boolean isLeaved = true; // 회원탈퇴 여부
				System.out.print("ID 입력) ");
				String id = sc.next();
				System.out.print("PW 입력) ");
				String pw = sc.next();
				
				Member member = new Member(id, pw);
				
				boolean isCorrect = true;
				int index = 0; // 로그인 성공한 회원의 index
				for (int i = 0; i < mIndex; i++) {
//					if (mdatas[i].getId().equals(id) && mdatas[i].getPw().equals(pw)) {
//						flag = false;
//						index = i;
//					}
					if (mdatas[i].equals(member)) { // 데이터를 2개 이상 전달하고 싶은데, 메서드의 인자가 1개라서 제작한 객체
						isCorrect = false;
						index = i; // 로그인에 성공했다면 배열에서 로그인한 회원의 인덱스 저장
						break;
					}
				}
				if (isCorrect) {
					System.out.println("로그인 실패. 없는 아이디거나 비밀번호가 틀렸습니다.");
				}
				while (true) { // 로그인 성공 후
					if (!isLeaved) { // 회원 탈퇴 시
						break;
					}
					act = 0;
					System.out.println("=============");
					System.out.println("1. 마이페이지"); // 회원 탈퇴
					System.out.println("2. 게시글 작성");
					System.out.println("3. 게시글 목록"); // 게시글 선택, 게시글 변경, 게시글 삭제
					System.out.println("4. 로그아웃");
					System.out.println("=============");
					System.out.print("입력) ");
					act = sc.nextInt();
					if (act == 1) { // 1. 마이페이지
						System.out.println(mdatas[index]);
						while (true) {
							System.out.println("1. 비밀번호 변경 2. 회원탈퇴 3. 이전 페이지로");
							System.out.print("입력) ");
							int num = sc.nextInt();
							if (num == 1) { // 1. 비밀번호 변경
								while (true) { // pw 검사 반복
									System.out.print("변경할 비밀번호를 입력하세요) ");
									pw = sc.next();
									System.out.print("비밀번호를 한 번 더 입력하세요) ");
									String pw2 = sc.next();
									
									if (pw.equals(pw2)) {
										mdatas[index].setPw(pw);
										break;
									}
									System.out.println("비밀번호가 다릅니다. 다시 입력해주세요.\n");
								}
							} else if (num == 2) { // 2. 회원탈퇴
								System.out.println(mdatas[index]);
								System.out.println("정말 탈퇴하시겠어요?(\"YES 입력\") ");
								String asw = sc.next();
								if (asw.equals("YES")) {
									isLeaved = false;
									System.out.println("그동안 저희 사이트를 이용해주셔서 감사합니다.");
//									for (int i = bIndex - 1; i >= 0; i--) { // 탈퇴할 회원의 게시글 전부 삭제
//										if (bdatas[i].getWriter().equals(mdatas[index].getId())) { // 게시글의 작성자가 탈퇴할 회원의 ID와 같다면
//											for (int j = i; j < bIndex - 1; j++) {
//												bdatas[j] = bdatas[j + 1];
//												
//											}
//											bIndex--;
//										}
//									}
									for (int i = index; i < mIndex - 1; i++) { // mdatas 한 칸 씩 당기기
										mdatas[i] = mdatas[i + 1];
									}
									mIndex--;
									break;
								}
								System.out.println("회원탈퇴가 취소되었습니다.");
							} else if (num == 3) { // 3. 이전 페이지로
								break;
							} else {
								System.out.println("잘못 입력하셨습니다.");
								continue;
							}
						}
					} else if (act == 2) { // 2. 게시글 작성
						if (bIndex >= bdatas.length) {
							System.out.println("게시판이 가득 찼습니다. 관리자에게 문의하세요.");
						}
						System.out.println("작성할 글 제목 입력)");
						String title = sc.next();
						System.out.println("작성할 글 내용 입력)");
						String content = sc.next();
						
						bdatas[bIndex] = new Board(NUM, title, content, mdatas[index].getId());
						NUM++;
						bIndex++;
					} else if (act == 3) { // 3. 게시글 목록
						boolean isDeleted = true;
						if (bIndex == 0) {
							System.out.println("열람할 수 있는 게시글이 없습니다.");
							continue;
						}
						for (int i = 0; i < bIndex; i++) {
							System.out.println((i + 1) + ". " + bdatas[i]);
						}
						while (true) {
							if (isDeleted) { // 게시글 삭제 시
								break;
							}
							System.out.println("\n본인이 작성한 글은 수정 혹은 삭제할 수 있습니다.\n게시글의 번호 선택해주세요.(0. 뒤로)");
							System.out.print("입력) ");
							int num = sc.nextInt();
							if (num == 0) { // 0. 뒤로
								break;
							} else {
								if (num >= 1 && num <= bIndex) { // 1~bIndex
									if (mdatas[index].getId().equals(bdatas[num - 1].getWriter())) { // 작성자가 본인이라면
										while (true) {
											if (isDeleted) { // 게시글 삭제 시
												break;
											}
											System.out.println("1. 수정 2. 삭제 3. 뒤로");
											int choice = sc.nextInt();
											if (choice == 1) { // 1. 수정
												System.out.println("변경 전)" + bdatas[num - 1] + "\n");
												System.out.println("작성할 글 제목 입력)");
												bdatas[num - 1].setTitle(sc.next());
												System.out.println("변경할 글 내용 입력)");
												bdatas[num - 1].setContent(sc.next());
												System.out.println("\n변경 후) " + bdatas[num - 1]);
												break;
											} else if (choice == 2) { // 2. 삭제
												System.out.println(bdatas[num - 1]);
												System.out.print("정말로 삭제하시겠어요?(\"YES\"입력) ");
												String asw = sc.next();
												if (asw.equals("YES")) {
													isDeleted = true;
													for (int i = num; i < bIndex - 1; i++) {
														bdatas[i] = bdatas[i + 1];
													}
													System.out.println("게시글이 삭제되었습니다.");
													bIndex--;
													continue;
												}
												System.out.println("게시글 삭제가 취소되었습니다.");
											} else if (num == 3) { // 3. 뒤로
												break;
											} else { // 1~3 외 입력 시
												System.out.println("잘못 입력하셨습니다.");
												continue;
											}
										}
									} else { // 작성자가 아니라면
										System.out.println("\n본인이 작성한 글이 아닙니다.");
										continue;
									}
								} else { // 1~bIndex 외의 정수 입력 시
									System.out.println("잘못 입력하셨습니다.");
									continue;
								}
							}
						}
					} else if (act == 4) { // 4. 로그아웃
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
				}
			} else if (act == 3) { // 3. 프로그램 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
		
	}

}
