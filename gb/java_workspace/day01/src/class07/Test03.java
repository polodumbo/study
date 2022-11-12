package class07;

public class Test03 {
	public static void main(String[] args) {

//		1)
//		a = ?
//		b = ?
//		c = ?
//		a,b,c는 각자 다 다른 정수입니다.
//		가장 작은 숫자를 min에 저장,출력!
		
		int a = 5;
		int b = 3;
		int c = 7;
		int min = a < b ? (a < c ? a : c) : (b < c ? b : c);  
		
		System.out.println("세 정수 중 가장 작은 수는 " + min + "입니다.");

//		2) num = ?
//		10의 배수이면 O,
//		10의 배수가 아니면 X를 출력!
		
		int num = 15;
		char res = num % 10 == 0 ? 'O' : 'X';
		
		System.out.println(res);
		
	}
}
