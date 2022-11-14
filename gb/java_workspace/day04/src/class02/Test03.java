package class02;

//for문을 활용한 약수, 소수, 완전수 구하기
public class Test03 {

	public static void main(String[] args) {
		
		// 약수
		int num = 6;
		
		for (int i = 1; i <= num; i++) { // 조건식 1 <= num : 자신 포함
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		
		// 소수
		int cnt = 0;
		for (int i = 1; i <= num; i++) { // 조건식 1 <= num : 자신 포함
			if (num % i == 0) {
				cnt++;
			}
		}
		if (cnt == 2) { // num이 소수라면
			System.out.println(num + "는 소수입니다.");
		} else {
			System.out.println(num + "는 소수가 아닙니다.");
		}

		// 완전수
		int sum = 0;
		for (int i = 1; i < num; i++) { // 조건식 i < num : 자신 제외
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) { // 약수들의 합 == num
			System.out.println(num + "는 완전수입니다.");
		} else {
			System.out.println(num + "는 완전수가 아닙니다.");
		}
		
	}
}
