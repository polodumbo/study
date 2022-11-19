package class04;

import java.util.Scanner;

// 모래성 땅따먹기
class Player {
	String name;
	static int game = 100; // 모래 총량
	
	// 게임
	boolean play(int num) {
		Player.game -= num; // 남은 모래 -= num
		if (Player.game <= 0) { // 남은 모래 <= 0
			return false; // lose
		}
		return true; // win
	}
	
	// 생성자
	Player(String name) {
		this.name = name;
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Player[] data = new Player[3];
		for (int i = 0; i < data.length; i++) {
			System.out.print("이름 입력: ");
			String name = sc.next();
			data[i] = new Player(name);
		}
		
		int i = 0;
		while (true) {
			System.out.println(data[i].name + "님, 게임시작!");
			System.out.print("가져갈 모래의 양 입력: ");
			int num = sc.nextInt();

			if (data[i].play(num)) {
				System.out.println("통과!");
			} else {
				System.out.println("실패...");
				break;
			}
			i++;
			
			if (i == data.length) {
				i = 0;
			}
		}
		
	}

}
