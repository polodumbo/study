package javaStudy.Java_util.CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		// 아이디, 비밀번호, 이름, 나이
		// Key와 Value의 한 쌍(Entry)
		HashMap<String, Object> userMap = new HashMap<>();
		
		userMap.put("id", "polo");
		userMap.put("pw", "1234");
		userMap.put("name", "polodumbo");
		userMap.put("age", 20);
		
		System.out.println(userMap);
		// userMap.entrySet().iterator();
		// userMap.entrySet() : Set 타입
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println(userMap.size());
		
	}
}