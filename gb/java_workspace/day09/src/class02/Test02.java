package class02;

//	예제)
//	Monster
//		String name
//		int level
//		int exp
//		void info()
//		void game()	> exp + 70
//				> exp가 100이 되면, level++
//	
//	main()
//		Monster m1 = new Monster("피카츄"); // lv.5 [0/100]
//		Monster m2 = new Monster("파이리", 10); // lv.10 [0/100]

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
		Monster m1 = new Monster("피카츄");
		Monster m2 = new Monster("파이리", 10);
		
		m1.info();
		m1.game();
		m1.info();
		System.out.println("==========================");
		m2.info();
		m2.game();
		m2.game();
		m2.info();
	}

}
