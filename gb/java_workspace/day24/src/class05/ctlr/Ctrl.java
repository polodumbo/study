package class05.ctlr;

import java.util.ArrayList;

import class05.model.Crawling;
import class05.model.WebtoonDAO;
import class05.model.WebtoonVO;

public class Ctrl {
	WebtoonDAO model;

	public Ctrl() {
		model = new WebtoonDAO(); // WebtoonDAO 초기화 > PK = 101, ArrayList<WebtoonVO> 선언
		Crawling crawling = new Crawling(); // Crawling 객체화
		crawling.sample(model); // App에서 사용하는 model을 사용!
		// sample(WebtoonDAO) 메서드 호출
	}

	public void startApp() {
		ArrayList<WebtoonVO> wdatas = model.selectAll(null);
		for (WebtoonVO v : wdatas) {
			System.out.println(v);
		}
	}
}
