package class05.model;

import java.util.ArrayList;

public class WebtoonDAO {
	int PK;
	ArrayList<WebtoonVO> wetoonList;

	public WebtoonDAO() {
		PK = 101;
		wetoonList = new ArrayList<WebtoonVO>();
	}

	// 질문질문!!
	public boolean insert(WebtoonVO wvo) {
		WebtoonVO data = new WebtoonVO();
		data.setNum(PK++);
		data.setTitle(wvo.getTitle());
		data.setWriter(wvo.getWriter());
		wetoonList.add(data);

//		wvo.setNum(PK++);
//		wetoonList.add(wvo);

		return true;
	}

	public ArrayList<WebtoonVO> selectAll(WebtoonVO wvo) {
		if (wvo == null) {
			return wetoonList; // 전체 반환
		}

		if (wvo.getTitle() != null) { // 검색어가 있다면
			ArrayList<WebtoonVO> searchedWetoonList = new ArrayList<WebtoonVO>();
			for (int i = 0; i < wetoonList.size(); i++) {
				if (wetoonList.get(i).getTitle().contains(wvo.getTitle())) {
					searchedWetoonList.add(wetoonList.get(i));
				}
			}
			return searchedWetoonList; // 검색한 데이터 반환
		}

		return null;
	}
}
