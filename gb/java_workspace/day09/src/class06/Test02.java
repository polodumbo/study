package class06;

import java.util.Random;
import java.util.Scanner;

//	예제)
//	포켓몬 볼을 3개까지 들고 다닐 수 있음
//	포켓몬입력: 이름
//	레벨은 랜덤으로 5~~9 지정
//	
//	1. 1번 포켓몬이 game()
//	2. 2번 포켓몬이 game()
//	3. 3번 포켓몬이 game()
//	4. 포켓몬볼 3마리의 상태가 모두 출력
//	5. 종료

class Monster {
	String name;
	int level;
	int exp;
	
	void info()	{
		System.out.println(this.name + " lv." + this.level + " [" + this.exp + "/100]");
	}
	
	void game() {
		System.out.println(this.name + "(이)가 경험치 70을 얻었습니다!");
		this.exp += 70;
		if (this.exp >= 100) {
			System.out.println(this.name + " 레벨업!");
			this.level++;
			this.exp -= 100;
		}
	}
	
	Monster(String name) {
		this(name, 0);
		this.level = 5;
	}

	Monster(String name, int level) {
		this.name = name;
		this.level = level;
		this.exp = 0;
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		Monster[] arMonster = new Monster[3];
		
		for (int i = 0; i < arMonster.length; i++) {
			System.out.print("포켓몬 이름 입력: ");
			String name = sc.next();
			int level = rand.nextInt(5) + 5;
			arMonster[i] = new Monster(name, level);
		}
		
		System.out.println();
		for (Monster v : arMonster) {
			v.info();
		}
		
		while (true) {
			System.out.println("========무엇을 할까요?========");
			System.out.println("1. " + arMonster[0].name + " 선택\n"
					+ "2. " + arMonster[1].name + " 선택\n"
					+ "3. " + arMonster[2].name + " 선택\n"
					+ "4. 상태 출력\n"
					+ "5. 종료");
			System.out.print("행동 입력: ");
			int i = sc.nextInt();
			
			System.out.println("===========================");
			if (i == 5) {
				System.out.println("[게임을 종료합니다...]");
				break;
			} else if (i >= 1 && i <= 3) {
				System.out.println("[" + arMonster[i - 1].name + " 전투 시작!]");
				arMonster[i - 1].game();
			} else if (i == 4) {
				for (Monster v : arMonster) {
					v.info();
				}
			} else {
				System.out.println("똑바른 숫자를 입력해주세요.");
			}
		}
		
	}

}
