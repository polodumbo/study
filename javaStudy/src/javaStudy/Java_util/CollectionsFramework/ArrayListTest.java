package javaStudy.Java_util.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import javax.xml.crypto.Data;

public class ArrayListTest {
	public static void main(String[] args) {
		// <?> : 제네릭(이름이 없는)
		// 임시로 타입을 선언하여 임시 타입으로 설계한다.
		// 오브젝트와 달리 따로 다운 캐스팅을 할 필요가 없다.
		ArrayList<Integer> datas = new ArrayList<>();
		// add((index,) element) : 원하는 인덱스 혹은 맨 뒤에 객체 추가
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(90);
		datas.add(80);
		datas.add(70);
		datas.add(60);
		datas.add(50);
		
		// toString()이 Collections Framework에서 재정의되어 있기 때문에 출력이 가능하다.
		System.out.println(datas);
		
		// get(index) : List의 index번째 객체 반환
//		// Collection Interface는 길이(length)가 아니라 크기(size)이다.
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		
		// sort() : 오름차순 정렬, 주소를 전달
		Collections.sort(datas);
		System.out.println(datas);
		
		// reverse() : 내림차순 정렬
		Collections.reverse(datas);
		System.out.println(datas);
		
		// shuffle() : 섞기
		Collections.shuffle(datas);
		System.out.println(datas);
		
		// 50 뒤에 500 삽입
		// 단, 50이 있을 때에만 삽입한다.
		if (datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);
			System.out.println(datas);
		}
		
		// 90을 9로 수정
		if (datas.contains(90)) {
			System.out.println(datas.set(datas.indexOf(90), 9) + "이 9로 변경되었습니다.");
		}
		System.out.println(datas);
		
		// 80 삭제
		// 1. 인덱스로 삭제
//		if (datas.contains(80)) {
//			System.out.println(datas.remove(datas.indexOf(80)) + "이 삭제되었습니다.");
//		}
//		System.out.println(datas);
		// 2. 값으로 삭제
		if (datas.remove(Integer.valueOf(80))) {
			System.out.println("삭제 성공");
		}
		System.out.println(datas);
		
	}
}
