package class05;

// 형변환(캐스팅)
public class Test02 {

	public static void main(String[] args) {

		int i = (int)1.123;	// 명시적 형변환
		double d = 1;	// 자동 형변환
		System.out.println("i = " + i + ", d = " + d);
		System.out.println();
		
		// 세 정수의 평균 구하기
		int score1 = 91;
		int score2 = 87;
		int score3 = 72;
		int sum = 0;
		double avg = 0.0;
		
		sum += score1;
		sum += score2;
		sum += score3;
		
//		avg = sum / 3;
		// 연산자 우선순위 때문에 (250 / 3)이 먼저 되어 자동 형변환으로 인해 83.333이 아닌 83이 삽입된다. 
		avg = (double)sum / 3;	// 250.0 / 3
		avg = sum * 1.0 / 3;	// 250.0 / 3, 추천추천 
		avg = sum / 3.0;		// 250 / 3.0
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}

}
