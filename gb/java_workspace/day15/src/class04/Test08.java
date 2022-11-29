package class04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// [이터레이터(복사체)]
public class Test08 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(3);
		
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		for (Integer v : al) {
			System.out.println(v);
		}
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(set);
		for (Integer v : set) {
			System.out.println(v);
		}
	}
}
