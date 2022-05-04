package javaStudy.Java_util.CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		// 중복된 데이터의 저장을 허용하지 않음
		// 순서가 보장되지 않음
		HashSet<String> foodSet = new HashSet<>();
		
		foodSet.add("치킨");
		foodSet.add("떡볶이");
		foodSet.add("족발");
		foodSet.add("막국수");
		foodSet.add("계란");
		foodSet.add("포켓몬빵");
		foodSet.add("포켓몬빵");
		foodSet.add("포켓몬빵");
		
		System.out.println(foodSet.toString());
		System.out.println(foodSet.contains("치킨"));
		
		// Iterator : Collections Framework의 하위 인터페이스로 저장된 데이터를 읽어보는 표준화된 방법 중 하나
		Iterator<String> iter = foodSet.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
