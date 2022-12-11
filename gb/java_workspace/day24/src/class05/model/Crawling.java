package class05.model;

import java.io.IOException;
import java.util.Iterator;
// java.xxx.xxxxx
// 기본 라이브러리

// org.xxx.xxxxx
// 외부에서 라이브러리를 import해와야함
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
	public void sample(WebtoonDAO wdao) { // wdao: App에서 사용하는 model
		final String url = "https://comic.naver.com/index";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i = 1;
		Elements eles = doc.select("h6 > a > span");
		Iterator<Element> itr = eles.iterator();
		Elements eles2 = doc.select("div.genreRecomInfo2 > span > a");
		Iterator<Element> itr2 = eles2.iterator();
		while (itr.hasNext()) {
//			System.out.print(i++ + "\t");
			WebtoonVO wvo = new WebtoonVO();
			String title = itr.next().text();
//			System.out.print(title + "\t");
			wvo.setTitle(title);
			String writer = itr2.next().text();
//			System.out.println(writer);
			wvo.setWriter(writer);
			wdao.insert(wvo);
			// insert() App에서 사용하는 model의 DB에 넣으려고!
		}
	}

	public static void main(String[] args) {
		// 타겟 사이트
		final String url = "https://comic.naver.com/index";

		// <!DOCTYPE html>
		// 1개의 화면 == 1개의 웹 페이지 == 1개의 Document
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		///// System.out.println(doc);

		// => Jsoup 라이브러리를 통해
		// HTML 웹 페이지 문서를 읽어왔다.

		// [HTML 문서의 구조]
		// 요소 Element
		// 요소들이 계층구조로 이루어져있음
		Elements eles = doc.select("h6 > a > span");
		Iterator<Element> itr = eles.iterator();
		while (itr.hasNext()) {
			/// System.out.println(itr.next());
			String str = itr.next().text();
			System.out.println(str);
		}

		System.out.println();

		// ★ 데이터 "가공"

		Elements eles2 = doc.select("div.genreRecomInfo2 > span > a");
		Iterator<Element> itr2 = eles2.iterator();
		while (itr2.hasNext()) {
			/// System.out.println(itr.next());
			String str = itr2.next().text();
			System.out.println(str);
		}
		// ※ 첫번째 데이터는 유효한 데이터가 아님!
		// -> 베스트도전 작가 데이터
	}

}
