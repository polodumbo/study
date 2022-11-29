package class04;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	int num; // PK
	String name;
	
	Student(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return this.num + "번 " + this.name;
	}
}

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NUM = 101;
		
		ArrayList<Student> datas = new ArrayList<Student>();
		// 제네릭 추가: 저장될 데이터 타입 객체
		
		while (true) {
			System.out.println("1. C 2. R. 3. U 4. D 5. 종료");
			int act = sc.nextInt();
			
			if (act == 1) {
				System.out.println("이름 입력");
				String name = sc.next();
				datas.add(new Student(NUM, name));
				NUM++;
			} else if (act == 2) {
				System.out.println(datas);
				if (datas.size() == 0) {
					System.out.println("출력할 데이터 X");
					continue;
				}
				for (Object v : datas) {
					System.out.println(v);
				}
				
			} else if (act == 3) {
				// 했다 치고
			} else if (act == 4) {
				boolean isRemoved = false;
				if (datas.isEmpty()) {
					System.out.println("삭제 X");
					continue;
				}
				// PK를 입력 받아서 삭제할 수 있도록 코딩해주세요
				for (Object v : datas) {
					System.out.println(v);
				}
				System.out.println("삭제할 번호 입력");
				int num = sc.nextInt();
				
				for (int i = 0; i < datas.size(); i++) {
					if (datas.get(i).num == num) {
						datas.remove(i);
						isRemoved = true;
						break;
					}
				}
				if (!isRemoved) {
					System.out.println("삭제할 데이터가 없습니다.");
				}
				
			} else if (act == 5) {
				break;
			} else {
				System.out.println("룰루");
			}
		}
	}
}
