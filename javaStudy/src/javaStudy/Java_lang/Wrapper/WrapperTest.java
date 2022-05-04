package javaStudy.Java_lang.Wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		int data_i = 10;
		
		// 수동
		// boxing
//		Integer data_I = new Integer(data_i);	// deprecated : 권장하지 않음
		Integer data_I = Integer.valueOf(data_i);
		// unboxing
		data_i = data_I.intValue();
		
		// auto
		// auto boxing
		data_I = data_i;
		
		// auto unboxing
		data_i = data_I;
		
		//1, 3.5, 12.5F, 'A', "ABC", true
		//위 6개의 다른 타입 값들을 하나의 6칸 배열에 담고 출력하기
		//up casting & auto boxing
		Object[] arData = {1, 3.5, 12.5F, 'A', "ABC", true};
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
	}
}
