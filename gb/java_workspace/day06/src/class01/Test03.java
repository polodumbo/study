package class01;

import java.util.Random;

// [중복없이 랜덤한 배열 생성]
public class Test03 {

	public static void main(String[] args) {

		int[] arLotto = new int[4]; // 4칸 배열
		Random rand = new Random();
		int index = 0;

		while (true) {
			boolean flag = false; // flag
			int rNum = rand.nextInt(15) + 1; // 1~15

			for (int i = 0; i < index; i++) {
				if (rNum == arLotto[i]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				arLotto[index] = rNum; // 삽입
				index++;
			}

			if (index == arLotto.length) {
				break;
			}
		}

	}

}