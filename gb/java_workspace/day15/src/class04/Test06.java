package class04;

import java.util.HashMap;
import java.util.Map;

public class Test06 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(101, "홍길동");
		map.put(102, "임꺽정");
		map.put(103, "홍길동");
		System.out.println(map.values());
		
		
		System.out.println(map); // {101=홍길동, 102=임꺽정}
		
		System.out.println(map.size()); // 2
		

	}
}
