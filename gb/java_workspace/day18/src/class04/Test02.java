package class04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		final String P1 = "C:\\GB_0900_LSH\\java\\resource\\text.txt";
		final String P2 = "C:\\GB_0900_LSH\\java\\resource\\text - 복사본.txt";
		
		try {
			FileInputStream fis = new FileInputStream(P1);
			FileOutputStream fos = new FileOutputStream(P2);
			
			byte[] buff = new byte[5000]; // 임시로 파일의 정보를 담을 버퍼
			int length;
			int cnt = 0;
			while ((length = fis.read(buff)) != -1) {
				fos.write(buff, 0, length); // buff에 존재하는 데이터를 length만큼 write()
				cnt++;
			}
			System.out.println("cnt : " + cnt);
			fis.close();
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("\t로그: 로렘 입숨 복사 실습 코드 수행 완료");
		}
	}
}
