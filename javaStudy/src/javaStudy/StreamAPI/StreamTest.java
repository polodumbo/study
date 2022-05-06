package javaStudy.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		// stream() : Stream 타입으로 변경(stream에 정의된 기능들을 사용할 수 있는 상태로 변경)
		// map() : 기존의 데이터를 다른 데이터로 변경
		// filter() : 조건식을 전달하여 true인 값만 추출
		// collect() : 결과를 원하는 타입으로 변경
		// forEach() : 향상된 for문과 같이 앞의 반복자의 요소를 각각 가져온 후 로직 작성 가능
		// sorted() : 오름차순 정렬
		// IntSteam.range(start, end) : 특정 범위의 여러 개의 값을 생성할 때 사용한다. end는 포함시키지 않는다.
		
		// 여러 개를 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
		// forEach 메소드에는 Consumer 인터페이스 타입의 값을 전달해야 한다.
		// Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
		// 매개변수에는 컬렉션 객체 안에 들어있는 값들이 순서대로 담기고,
		// 화살표 뒤에서는 구현하고 싶은 문장을 작성한다.
		
		// 1~100 ArrayList에 담기
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.range(0, 100).forEach(i -> datas.add(i + 1));
//		datas.forEach(System.out::println);
		
		// 100~1 ArrayList에 담기
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.range(0, 100).forEach(i -> datas.add(100 - i));
//		datas.forEach(System.out::println);
		
		// ABCDEF를 각 문자 별로 출력하기
		// 문자열에 chars()라는 메소드가 stream 타입니다.
//		String data = "ABCDEF";
//		// data.chars().forEach(i -> System.out.println(i));
//		data.chars().forEach(i -> System.out.println((char)i));
		
		// BCDEFG
//		data.chars().map(c -> c + 1).forEach(c -> System.out.println((char)c));
		
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// C 제외하고 출력하기
		// filter(c -> 조건식) : 조건식이 true인 애들만!
//		data.chars().filter(c -> c != 67).forEach(i -> System.out.println((char)i));
		// data.chars().filter(c -> (char)c != 'C').forEach(i -> System.out.println((char)i));	//불필요한 연산을 하지 말자
		
		// 정렬
		// ::는 void 메소드일 경우 참조형 사용이 가능하다.
//		ArrayList<Integer> datas = new ArrayList<>(Arrays.asList(10, 40, 20, 30));
		
		// 오름차순
//		datas.stream().sorted().forEach(System.out::println);
//		ArrayList<Integer> sortedAscDatas =
//				(ArrayList<Integer>)datas.stream().sorted().collect(Collectors.toList());
		
		// 내림차순
//		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		ArrayList<String> datas = new ArrayList<>(Arrays.asList("black", "while", "red", "yellow"));
		
		// 1. 전체 대문자로 변경 후 출력(BLACK, WHITE, RED, YELLOW)
		// "".toUpperCase()
//		datas.stream().map(c -> c.toUpperCase()).forEach(System.out::println);
//		datas.stream().map(String::toUpperCase).forEach(System.out::println);
		
		// 2. 첫 글자만 대문자로 변경 후 출력(Black, White, Red, Yellow)
//		datas.stream()
//			.map(c -> c.charAt(0) >= 97 && c.charAt(0) <= 122
//				? c.replace(c.charAt(0), (char)(c.charAt(0) - 32)) : c)
//			.forEach(System.out::println);
		
		// joining : 각 요소를 원하는 구분점으로 연결하여 문자열로 리턴한다.
//		System.out.println(datas.stream().collect(Collectors.joining(" ")));
		
		// 1~10 ArrayList에 담고 출력(IntStream)
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.range(0, 10).forEach(i -> datas.add(i + 1));
////		IntStream.rangeClosed(1, 10).forEach(i -> datas.add(i));
//		datas.forEach(System.out::println);
		
		// 1~100 중 짝수만 ArrayList에 담고 출력(filter)
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.rangeClosed(1, 100).filter(c -> c % 2 == 0).forEach(i -> datas.add(i));
//		datas.forEach(System.out::println);
		
		// A~F ArrayList에 담고 출력(IntStream.range(), map)
//		ArrayList<Character> datas = new ArrayList<>();
////	IntStream.range(0, 6).forEach(i -> datas.add((char)(i + 65)));
//		IntStream.range(0, 6).map(data -> data + 65).forEach(i -> datas.add((char)i));
//		datas.forEach(System.out::println);
		
		// A~F 중 D 제외하고 ArrayList에 담은 후 출력(IntStream, map, 삼항 연산자)
//		ArrayList<Character> datas = new ArrayList<>();
//		IntStream.range(0, 5).map(data -> data > 2 ? data + 1 : data).forEach(i -> datas.add((char)(i + 65)));
//		datas.forEach(System.out::println);
		
		// 5개의 정수를 입력받은 후 ArrayList에 담고 최대값과 최소값 출력(구글링)(sorted 또는 mapToInt)
//		ArrayList<Integer> datas = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i + 1 + "번째 정수 입력 : ");
//			datas.add(sc.nextInt());
//		}
//		datas.stream().sorted(Comparator.reverseOrder());
//		System.out.println("최대값 : " + datas.get(0) + "\n최소값 : " + datas.get(4));
		
		// 문자열을 5개 입력받고 모두 소문자로 변경(IntStream, map)
//		ArrayList<String> datas = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i + 1 + "번째 영문자열 입력 : ");
//			datas.add(sc.next());
//		}
//		
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
		// Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력(Arrays.asList(), filter, collect)
//		ArrayList<String> datas = new ArrayList<>(Arrays.asList("Apple", "banana", "Melon"));
//		
//		datas.stream().filter(c -> c.charAt(0) >= 65 && c.charAt(0) <= 90).forEach(System.out::println);
		
		// 한글을 정수로 변경(map)
		// 입력 예 : 일공이사
		// 출력 예 : 1024
//		Scanner sc = new Scanner(System.in);
//		String data= null;
//		String hangle = "공일이삼사오육칠팔구";
//		
//		System.out.print("입력 : ");
//		data = sc.next();
//		
//		data.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
		
		// 정수를 한글로 변경
		// 입력 예 : 1024
		// 출력 예 : 일공이사
//		Scanner sc = new Scanner(System.in);
//		String hangle = "공일이삼사오육칠팔구";
//		String data= null;
//		
//		System.out.print("입력 : ");
//		data = sc.next();
//		
//		data.chars().map(c -> c - 48).forEach(c -> System.out.print(hangle.charAt(c)));
	}
}
