package class04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 파일 내용 읽어오기
public class Test02 {

	public static void main(String[] args) {

		File file = new File("C:\\GB_0900_LSH\\java\\resource\\apple.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("  로그: 파일객체생성코드 수행완");
		}

		try {
			FileInputStream fis1 = new FileInputStream(file);
			/// FileInputStream fis2=new
			/// FileInputStream("C:\\GB_0900_LSH\\java\\resource\\banana.txt");

			int data;
			while ((data = fis1.read()) != -1) {
				// fis.read() 메서드는 파일의 끝(==EOF)을 만나면, -1을 반환
				System.out.println((char) data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("  로그: 파일읽어오는코드 수행완");
		}

	}
}