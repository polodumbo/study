package class04;

import java.util.HashSet;
import java.util.Set;

// [Set, 집합]
public class Test04 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(); // 집합에게는 다양한 종류의 클래스가 존재함
		// 최상위 집합 클래스가 Set(추상 클래스)
		
		set.add(10);
		set.add(20);
		set.add(1);
		set.add(2);
		set.add(123);
		set.add(10);
		set.add(20);
		System.out.println(set);
		System.out.println(set.size());
		
	}
}
