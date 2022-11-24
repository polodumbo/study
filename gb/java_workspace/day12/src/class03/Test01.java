package class03;

import java.util.Random;
import java.util.Scanner;

abstract class Po {
	protected String name;
	protected int level;
	protected int exp;
	
	@Override
	public String toString() {
		return this.name + " lv." + this.level + " [" + exp + "/100]";
	}
	
	abstract void attack();

	void checkAttack() {
		int rand = new Random().nextInt(100);
		
		if (rand < 20) {
			System.out.println("공격 실패...");
		} else {
			this.exp += rand;
			if (exp >= 100) {
				level++;
				exp -= 100;
			}
			System.out.println("공격 성공! 경험치 " + rand + "(을)를 얻었습니다.");
		}
	}
	
	void change() {
		System.out.print("엇! " + this.name + "의 상태가 이상하다!\n" + this.name + "(이)가 ");
		this.changeName();
		System.out.println(this.name + "(으)로 진화하였습니다.");
	}
	
	void changeName() {
		if (this.level == 6) {
			name = "진화1";
		} else if (this.level == 8) {
			name = "진화2";
		}
	}
	
	Po() {
		this.name = "";
		this.level = 5;
		this.exp = 0;
	}
}

class Squirtle extends Po {

	@Override
	void attack() {
		System.out.println("꼬북꼬북");
	}

	@Override
	void changeName() {
		if (level == 6) {
			this.name = "어니부기";
		} else if (level == 8) {
			this.name = "거북왕";
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Squirtle) {
			System.out.println("꼬부기 알 획득");
			return true;
		}
		System.out.println("다른 종입니다.");
		return false;
	}
	
	Squirtle() {
		super();
		this.name = "꼬부기";
	}
}

class Charmander extends Po {

	@Override
	void attack() {
		System.out.println("파아~~~~");
	}

	@Override
	void changeName() {
		if (level == 6) {
			this.name = "리자드";
		} else if (level == 8) {
			this.name = "리자몽";
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Charmander) {
			System.out.println("파이리 알 획득");
			return true;
		}
		System.out.println("다른 종입니다.");
		return false;
	}
	
	Charmander() {
		super();
		this.name = "파이리";
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		Po[] datas = new Po[3];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("===========================");
			System.out.println("1. 포켓몬 잡기");
			System.out.println("2. 포켓몬 목록 보기");
			System.out.println("3. 공격!");
			System.out.println("4. 최근에 잡은 포켓몬을 놓아준다.");
			System.out.println("5. 교배");
			System.out.println("6. 게임 종료");
			System.out.println("===========================");
			System.out.print("입력) ");
			int act = sc.nextInt();
			System.out.println();
			if (act == 1) {
				if (index >= datas.length) {
					System.out.println("포켓몬을 잡을 자리가 없습니다.");
					continue;
				}
				int num = 0;
				while (true) {
					System.out.println("1. 꼬부기 2. 파이리");
					System.out.print("입력) ");
					num = sc.nextInt();
					if (num == 1 || num == 2) {
						break;
					}
					System.out.println("1 혹은 2만 입력하세요");
				}
				System.out.println();
				if (num == 1) {
					datas[index] = new Squirtle();
				} else if (num == 2) {
					datas[index] = new Charmander();
				}
				index++;
				System.out.println(datas[index - 1].name + "(을)를 잡았습니다.");
			} else if (act == 2) {
				if (index == 0) {
					System.out.println("포켓몬이 없습니다.");
					continue;
				}
				
				for (int i = 0; i < index; i++) {
					System.out.println(datas[i]);
				}
			} else if (act == 3) {
				if (index == 0) {
					System.out.println("포켓몬이 없습니다.");
					continue;
				}
				int num = 0;
				while (true) {
					System.out.println("공격할 포켓몬을 선택하세요.");
					for (int i = 0; i < index; i++) {
						System.out.println((i + 1) + ". " + datas[i]);
					}
					System.out.print("입력) ");
					num = sc.nextInt();
					if (num >= 1 && num <= index) {
						break;
					}
					System.out.println("제대로 입력하세요");
				}
				System.out.println();
				// 질문
				// 강사님 코드와 장단점이 있으니 공부하자
				// 메서드는 연산자에 비교하여 좀 오래 걸린다.
				num--;
				datas[num].attack();
				datas[num].checkAttack();
				System.out.println();
				if (datas[num].level == 6) {
					if (datas[num].name.equals("꼬부기") || datas[num].name.equals("파이리")) {
						datas[num].change();
					}
				} else if (datas[num].level == 8) {
					if (datas[num].name.equals("어니부기") || datas[num].name.equals("리자드")) {
						datas[num].change();
					}
				}
			} else if (act == 4) {
				if (index == 0) {
					System.out.println("포켓몬이 없습니다.");
					continue;
				}
				System.out.println("놓아줄 포겟몬은 " + datas[index - 1] + "입니다.");
				System.out.print("정말 놓아주시겠어요?(YES) ");
				String ans = sc.next();
				if (!ans.equals("YES")) {
					continue;
				}
				System.out.println("바이바이!");
				index--;
				datas[index] = null;
			} else if (act == 5) {
				if (index <= 1) {
					System.out.println("포켓몬이 두 마리 미만입니다...");
					continue;
				}
				datas[0].equals(datas[1]);
				// flag로 따로 빼주자
//				for (int i = 0; i < index; i++) {
//					for (int j = i + 1; j < index; j++) {
//						datas[i].equals(datas[j]);
//					}
//				}
			} else if (act == 6) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("제대로 입력하세요.");
			}
		}
	}
}
