package model.common;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import model.board.BoardDAO;
import model.board.BoardVO;

public class Crawling {
	public static void sample(BoardDAO bdao) { // 재사용을 하지 않기 때문에 static도 좋다
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
			System.out.print("\t로그: " + i++ + ". ");
			BoardVO bvo = new BoardVO();
			
			String title = itr.next().text();
			System.out.print(title + "\t");
			bvo.setTitle(title);
			
			String writer = itr2.next().text();
			System.out.println(writer);
			bvo.setWriter(writer);
			
			bdao.insert(bvo); // ★
		}
	}

}
