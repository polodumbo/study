package class07;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test02 {
	public static void main(String[] args) {
		// 타겟 사이트 상수화
		final String URL = "https://iba-world.com/category/iba-cocktails/";
		
		// <!DOCTYPE html>
		// 웹 페이지, 웹 문서
		// 1개의 화면 == 1개의 웹 페이지 == 1개의 Document
		Document doc = null;
		try {
			// Jsoup : 웹 연결
			doc = Jsoup.connect(URL).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println(doc); // Jsoup 라이브러리를 통해 HTML 웹 페이지 문서를 읽어 옴
		
		// 그 동안의 자동 import는 이미 제공된 라이브러리(JRE System Library)를 사용했기에 가능했던 것
		// 없는 라이브러리(Jsoup)를 사용해야 하니 추가하여 사용
		// 라이브러리 파일 확장자: .jar
		
		// [HTML 문서의 구조]
		// 요소 Element
		// 요소들이 계층구조로 이루어져 있음
		
		Elements eles = doc.select("article > h3 > a");
		Iterator<Element> itr = eles.iterator();
		while (itr.hasNext()) {
			// 태그 째로 출력
//			Element element = (Element)itr.next();
//			System.out.println(element);
			// 문자만 출력
			String str = itr.next().text();
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
