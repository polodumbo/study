package class04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//[FileInputStream]
public class Test03 {

	public static void main(String[] args) {
		
		final String PATH = "C:\\GB_0900_LSH\\java\\resource\\banana.txt";
		File file = new File(PATH); // 외부에 있는 파일을 코드로 불러올 때 사용하는 객체
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("  로그: 파일객체생성코드 수행완");
		}

		try {
			FileInputStream fis1 = new FileInputStream(file); // stream : 정보를 입력 받는 하나의 단위

			int data;
			while ((data = fis1.read()) != -1) { // EOF = -1 End Of File
				System.out.print((char) data);
			}
			System.out.println();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("  로그: 파일읽어오는코드 수행완");
		}

	}
}