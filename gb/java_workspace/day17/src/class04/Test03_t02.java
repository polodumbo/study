package class04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 예제 풀이 2)
public class Test03_t02 {
	public static void main(String[] args) {

		final String path = "C:\\GB_0900_LSH\\java\\resource\\banana.txt";
		File file = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("  로그: 파일객체생성코드 수행완");
		}

		try {
			FileInputStream fis = new FileInputStream(file);

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