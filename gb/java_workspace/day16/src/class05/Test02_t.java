package class05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test02_t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> datas = new ArrayList<Integer>();

		Set<Integer> set = new HashSet<Integer>();
		while (true) {
			int num;
			try {
				System.out.print("정수입력) ");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("정수만 입력하세요!");
				continue;
			}
			set.add(num);
			if (set.size() == 5) {
				break;
			}
		}

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			datas.add(itr.next());
		}

		while (true) {
			int index;
			try {
				System.out.print("인덱스입력) ");
				index = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("정수만 입력하세요!");
				continue;
			}

			try {
				System.out.println(10 / datas.get(index));
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌수없습니다!");
				System.out.println("다른 인덱스를 입력하세요!");
				continue;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("0~4까지만 입력하세요!");
				continue;
			}
			break;
		}

	}
}