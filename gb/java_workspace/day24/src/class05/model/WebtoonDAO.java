package class05.model;

import java.util.ArrayList;

public class WebtoonDAO {
	int PK;
	ArrayList<WebtoonVO> wdatas;

	public WebtoonDAO() {
		PK = 101;
		wdatas = new ArrayList<WebtoonVO>();
	}

	public boolean insert(WebtoonVO wvo) {
		WebtoonVO data = new WebtoonVO();
		data.setNum(PK++);
		data.setTitle(wvo.getTitle());
		data.setWriter(wvo.getWriter());
		wdatas.add(data);
		return true;
	}

	public ArrayList<WebtoonVO> selectAll(WebtoonVO wvo) {
		return wdatas;
	}
}
