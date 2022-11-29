package class04;

import java.util.ArrayList;

// [ArrayList]
public class Test02 {
	public static void main(String[] args) {
		// 배열리스트는 배열과 다릴 생성 시 전체 크기를 결정하지 않는다.
		// 저장할 데이터의 타입이 동일하지 않아도 괜찮다.
		// 자바에서는 이미 배열리스트를 편리하게 사용할 수 있도록 ArrayList 클래스가 구현되어 있다.
		// .toString() 오버라이딩 완료된 상태
		ArrayList<Object> al = new ArrayList<Object>();
		
		System.out.println(al.size());
		
		al.add(10);
		al.add(3.14);
		al.add("apple");
		al.add('A');
		al.add(new B());
		al.add(new C());
		System.out.println(al.size());
		
		System.out.println(al);
		
		al.add(1, 123); // add(int, Object) : int번째 index에 Object 삽입
		System.out.println(al);
		
		System.out.println(al.get(0)); // get(int) : int번째 index의 Object 반환 
		System.out.println(al.get(3));
		
		// ArrayList는 중간에 하나가 없어져도 자동으로 빈칸을 당겨준다.
		al.remove(0);	// remove(int) : int번째 index의 Object 제거
		System.out.println(al);
		
		al.clear(); // 비우기
		System.out.println(al);
		
		System.out.println(al.isEmpty()); // isEmpty() : 비어있다면 true, 데이터가 있다면 false
	}
}
