package prac;

import java.util.ArrayList;
import java.util.List;

public class Model {
	private List<String> datas;

	public void setDatas(List<String> datas) {
		this.datas = datas;
	}

	public boolean insert(String data) {
		try {
			datas.add(data);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<String> selectAll(String data) {
		List<String> res = new ArrayList<String>();
		for (String v : datas) {
			if (v.contains(data)) {
				res.add(v);
			}
		}
		return res;
	}
}
