package class01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\GB_0900_LSH\\java\\resource\\num.txt");
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		int num = 0;
		String sNum = "";
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			int data;
			while ((data = fis.read()) != -1) {
//				System.out.println((char)data);
//				String s = String.valueOf((char)data); // s = '1' > "1"
//				num = Integer.parseInt(s); // num = "1" > 1
//				nums.add(num); // 1 추가
				sNum += String.valueOf((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\t로그: " + nums);
		}
		
//		String s = "";
//		for (Integer v : nums) {
//			s += v; // "1" + "9"
//		}
		num = Integer.parseInt(sNum); // "19" > 19
		
		// 이진탐색
		int L = 0; // Low, Left, Start
		int H = 100; // High, Right, End
		int M = 0;
		
		while (true) {
			M = (L + H) / 2;
			System.out.println("L : " + L);
			System.out.println("H : " + H);
			System.out.println("M : " + M);
			if (M == num) { // 찾으면
				System.out.print("찾았습니다! 정답은 " + M);
				break;
			} else if (num > M) { // 입력한 숫자가 더 작은 경우
				L = M + 1;
				System.out.println("업!");
			} else { // 입력한 숫자가 더 큰 경우
				H = M - 1;
				System.out.println("다운!");
			}
			System.out.println();
			if (L > H) { // cross(교차)
				System.out.println(num + "은 없습니다...");
				break;				
			}
		}
		
		
		
	}
}
