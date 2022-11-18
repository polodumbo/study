package class04;

import java.util.Scanner;

public class Test01 {
	public static void func() {
		System.out.println("함수()");
	}

	public static void main(String[] args) {
		func(); // 함수
		
		Scanner sc = new Scanner(System.in);
		sc.next(); // 메서드(객체가 가진 함수)
	}

}
