package class06;

// ASCII
public class Test01 {

	public static void main(String[] args) {

		int i = 10;	// 00000000 00000000 00000000 00000000
		char c = 'A';	// 문자 > 아스키 코드표 매핑 > 해당하는 정수값으로 저장
		
//		'0'	: 48
//		'A' : 65
//		'a' : 97
		
//		for (char ch = 'a'; ch <= 'z'; ch++) {
//			System.out.println(ch);
//		}
		
		c += 5;
		System.out.println(c);	// 'F'
		
		i = 'a';
		System.out.println(i);	// 97
		
		System.out.println((char)48);	// 0
	}

}
