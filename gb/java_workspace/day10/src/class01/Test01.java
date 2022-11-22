package class01;

import java.util.Random;
import java.util.Scanner;

class Car {
	String name; // 멤버변수, 필드, 속성
	int speed;
	static int maxSpeed = 120; // 클래스 변수, static == 객체와 무관하게

	void info() {
		System.out.println(name + "님의 차: " + speed);
	}
	Car () {
		this("미등록");
	}
	
	Car (String name) {
		// 생성자 : 멤버변수 초기화
		this.name = name;
		this.speed = 0;
	}
}

public class Test01 {

	public static void main(String[] args) {
		// 주석
		// == 코드 가독성 용이

		System.out.println(10);
		System.out.println(3.14);
		System.out.println("안녕하세요!");
		// 오버로딩

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// 객체화 == 인스턴스화

		Car car = new Car("홍길동");
		car.speed = 100;
		Car.maxSpeed = 120; // ex) Thread.sleep(1000);

		// 변수 3요소
		// 자료형 / 메모리 주소 / 변수명(식별자)
		// 값 X
		// Scope에 유의
		
		// 연산자
		// 우선순위
		// 디버깅표
		
		// 제어문
		// 조건문(if, switch)
		// 반복문(while, for)

		// 배열
		// 데이터끼리 관련되었나?
		// 자료형이 같나?
		// 개수를 알고 있나?
		int[] data = new int[5]; // 힙 메모리 영역(개발자 영역)
		for (int i = 0; i < data.length; i++) {
			// index는 [0]부터 시작함에 유의!
			// 배열의 크기 == 요소의 개수 == length
			data[i] = i + 1;
		}
		for (int v : data) {
			System.out.print(v + " ");
		}
		
		// 함수 3요소
		// input / output / 기능
		// == 메서드 시그니처
		
		// 함수의 기능이 유사하거나 동일한 것들끼리 함수명을 공유
		// 함수명 중복정의 허용
		// 오버로딩
		
		// 객체지향 프로그래밍의 4가지 특징
		// 1. 추상화
		// 2. 캡슐화(정보은닉)
		// 3. 상속
		// 4. 다형성
	}

}
