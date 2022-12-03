package class01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// [FileOutputStream]
public class Test01 {
	public static void main(String[] args) {
		
		// 파일이 존재할 때, 덮어쓰기가 진행됨
		// 파일이 없을 때, 생성 후 코드 수행
		// fos 생성자가 오버로딩: 매개변수에 true 인자 추가 시 "이어쓰기" 실행
		final String PATH = "C:\\GB_0900_LSH\\java\\resource\\test.txt";
		try {
//			FileOutputStream fos = new FileOutputStream(PATH);
			FileOutputStream fos = new FileOutputStream(PATH, true); // 이어쓰기
			
			fos.write(65);
			fos.write(97);
			
			fos.flush(); // 비우고
			fos.close(); // 버리고
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\t로그: 파일 작성 코드 수행 완료");
		}
		
	}
}
