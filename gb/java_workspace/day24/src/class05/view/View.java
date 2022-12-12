package class05.view;

import java.util.ArrayList;
import java.util.Scanner;

import class05.model.WebtoonVO;

public class View {
	Scanner sc;
	public View() {
		sc = new Scanner(System.in);
	}
	
	// 전체 목록 출력
	public void printWebtoonList(ArrayList<WebtoonVO> webtoonList) {
		for (WebtoonVO v : webtoonList) {
			System.out.println(v);
		}
	}
	
	// 검색 질문
	public String search() {
		System.out.print("검색 단어 입력) ");
		String searchContent = sc.next(); // 웹에서 "검색어 == searchContent"
		return searchContent;
	}
	
	

}
