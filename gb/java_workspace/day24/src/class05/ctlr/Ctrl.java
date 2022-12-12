package class05.ctlr;

import java.util.ArrayList;

import class05.model.Crawling;
import class05.model.WebtoonDAO;
import class05.model.WebtoonVO;
import class05.view.View;

public class Ctrl {
	WebtoonDAO model;
	View view;

	public Ctrl() {
		model = new WebtoonDAO(); // WebtoonDAO 초기화 > PK = 101, ArrayList<WebtoonVO> 선언
		view = new View();
		
		// 1) 최초에 1번 수행
		// 2) 재사용 X
		// 3) 서비스 X
		Crawling crawling = new Crawling(); // Crawling 객체화
		crawling.sample(model); // ★ App에서 사용하는 model을 사용!
		// sample(WebtoonDAO) 메서드 호출
	}

	public void startApp() {
		ArrayList<WebtoonVO> webtoonList = model.selectAll(null);
		view.printWebtoonList(webtoonList);
		
		String searchContent = view.search();
		WebtoonVO wvo = new WebtoonVO();
		wvo.setTitle(searchContent);
		ArrayList<WebtoonVO> webtoonList2 = model.selectAll(wvo);
		view.printWebtoonList(webtoonList2);
	}
}
