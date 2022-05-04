package javaStudy.Java_lang.Object;

public class ToStringTest {
	public static void main(String[] args) {
		//필드의 주소보다 값의 주소를 먼저 쓴다.
		String data1 = "ABC";
		String data2 = "ABC";
		//필드의 주소를 우선시한다.
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		
		System.out.println(data3);	//"ABC"
		
		System.out.println(data1 == data2);	//true
		System.out.println(data1.equals(data2));	//true
		System.out.println(data1.equalsIgnoreCase(data2));	//true
		
		System.out.println(data1 == data3);	//false
		
		System.out.println(data3 == data4);	//false
		System.out.println(data3.equals(data4));	//true
	}
}
