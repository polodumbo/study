package class04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		int[] datas = { 0, 1, 2, 3, 4 };

		for (int i = 0; i < 10; i++) {
			try {
				int num = new Scanner(System.in).nextInt();
				System.out.println(num / datas[i]);
			} catch (ArithmeticException e) {
				System.out.println("0 나누기 xxx");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 확인해주세요!");
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다!");
			} catch (Exception e) {
				System.out.println("미확인 예외");
				e.printStackTrace();
			}
		}

	}
}
