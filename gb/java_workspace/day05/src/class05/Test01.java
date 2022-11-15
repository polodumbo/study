package class05;

// [배열]
public class Test01 {

	public static void main(String[] args) {

//		int stu1 = 10;
//		int stu2 = 20;
//		int stu3 = 55;
//		
//		// 그저 변수로 출력하려고 하면 반복문 사용이 어려움
//		for (int i = 0; i < 3; i++) {
//			System.out.println("학생 " + (i + 1) + "번의 성적은 " + stu1 + "점입니다.");
//		}

		int[] arScore = new int[3];
		arScore[0] = 10;
		arScore[1] = 20;
		arScore[2] = 55;
//		arScore[3] = 100; // java.lang.ArrayIndexOutOfBoundsException : 배열 크기

		// 그렇기 때문에 배열을 사용
		for (int i = 0; i < 3; i++) {
			System.out.println("학생 " + (i + 1) + "번의 성적은 " + arScore[i] + "점입니다.");
		}

	}

}
