package class02;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력: ");
//		int i = sc.nextInt();
//		sc.nextLine(); // sc.nextInt()에서 함께 입력된 줄바꿈(Enter)을 데려간다.
//		
//		System.out.print("문자열 입력: ");
//		String str = sc.nextLine(); // 공백 또는 줄바꿈 또한 값으로 취급
//		
//		System.out.println("i [" + i + "]");
//		System.out.println("str [" + str + "]");
		
		System.out.print("정수 입력: ");
		int i = sc.nextInt();
		sc.nextLine(); // sc.nextInt()에서 함께 입력된 줄바꿈(Enter)을 데려간다.
		
		System.out.print("문자열 입력: ");
		String str = sc.next(); // 공백과 줄바꿈을 값으로 취급하지 못함
		
		System.out.println("i [" + i + "]");
		System.out.println("str [" + str + "]");
		
	}

}
