package class04;

public class Test02 {
	public static void main(String[] args) {

//		예제 2) 두 자리수 정수 저장
//		10 > 10		36 > 짝짝
//		13 > 짝		91 > 짝
//		31 > 짝		33 > 짝짝
//		369게임처럼 출력
		
		int num=99;
		
		int a=num%10; // 일의 자리
		int b=num/10; // 십의 자리
		
		int cnt=0; // 박수치는 횟수
		String print="";
		
		if(a==3 || a==6 || a==9) {
			cnt++;
			print+="짝";
		}
		if(b%3 == 0 && b!=0) { // 경계값 검사
			cnt++;
			print+="짝";
		}
		
		System.out.println("총 박수: "+cnt+"번");
		System.out.println(print);
		
	}
}
