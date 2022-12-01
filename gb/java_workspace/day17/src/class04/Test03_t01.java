package class04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 예제 풀이1)
public class Test03_t01 {
	public static void main(String[] args) {
		final String path = "C:\\GB_0900_LSH\\java\\resource\\banana.txt";
		try {
			FileInputStream fis = new FileInputStream(path);
			int data;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("  로그: 파일읽어오기코드 수행완");
		}
	}
}
