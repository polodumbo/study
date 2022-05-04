package javaStudy.Java_lang.Object;

import java.util.Random;

public class EqualsTest {
	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random();
		
		//주소값
		System.out.println(r1);
		//주소값
		System.out.println(r2);
		
		System.out.println(r1 == r2);	//false
		System.out.println(r1.equals(r2));	//false
		
		r1 = r2;
		
		System.out.println(r1 == r2);	//true
		System.out.println(r1.equals(r2));	//true
	}
}
