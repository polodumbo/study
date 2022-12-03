package class01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

// [복사본 만들기]
public class Test02 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		final String PATH = "C:\\GB_0900_LSH\\java\\resource\\test.txt";
		try {
			FileInputStream fis = new FileInputStream(PATH);
			
			int data;
			while ((data = fis.read()) != -1) {
				System.out.println("확인");
				datas.add(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\t로그: " + datas);

		final String PATHCOPY = "C:\\GB_0900_LSH\\java\\resource\\test - 복사본.txt";
		try {
			FileOutputStream fos = new FileOutputStream(PATHCOPY);
			
			for (Integer v : datas) {
				fos.write(v);
			}
			
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
