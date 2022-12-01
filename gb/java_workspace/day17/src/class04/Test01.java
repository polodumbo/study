package class04;

import java.io.File;
import java.io.IOException;

// [File I/O]
public class Test01 {
	public static void main(String[] args) {
		File file = new File("C:\\GB_0900_LSH\\java\\resource\\test.txt");
		
		try {
			file.createNewFile();
			// 파일 명이 같다면 아무 일도 일어나지 않음
			// 파일명이 없다면 생성됨
		} catch (IOException e) {
			// TODO Auto-generated catch block
		} finally {
			System.out.println("\t로그: 파일 객체 생성 코드 수행 완료");
		}
	}
}
