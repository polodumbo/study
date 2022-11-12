package class06;

public class Test02 {

	public static void main(String[] args) {

		// 알파벳 대소문자 전환
		
		char ch = 't';
		
		if (ch >= 65 && ch <= 90) {	// ch가 대문자일 때
			ch += 32;
		} else if (ch >= 97 && ch <= 122) {	// ch가 소문자일 때
			ch -= 32;
		}
		
		System.out.println(ch);
		
	}

}
