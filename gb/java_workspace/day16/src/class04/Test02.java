package class04;

public class Test02 {
	public static void main(String[] args) {
		int[] datas = { -1, 0, 1 };

		int num = 10;

//		for (int i = 0; i < datas.length; i++) {
//			try {
//				System.out.println(num / datas[i]);
//			} catch (Exception e) {
//				System.out.println(num);
//			}
//		}

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(num / datas[i]);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("해당 인덱스가 없습니다.");
			}
		}

	}
}
