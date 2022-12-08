package model;

import java.util.ArrayList;
import java.util.Random;

// ★★★★★
// 사용자를 절대 신경 xxx
// syso() 오직 "로그"
// 화면 출력 xxx
// ★★★★★
public class PoDAO {
	private int PK;
	private ArrayList<PoVO> datas; // "포켓몬수첩"
	private Random rand;

	public PoDAO() {
		PK = 101;

		rand = new Random();

		datas = new ArrayList<PoVO>();
		datas.add(new PoVO(PK++, "피카츄", rand.nextInt(6) + 5));
		datas.add(new PoVO(PK++, "파이리", rand.nextInt(6) + 5));
	}

	public boolean insert(String name) {
		try {
			datas.add(new PoVO(PK++, name, rand.nextInt(6) + 5));
			System.out.println("  로그: insert 성공");
		} catch (Exception e) {
			System.out.println("  로그: insert 실패");
			return false;
		}
		return true;
	}

	public boolean delete(int num) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == num) {
				datas.remove(i);
				System.out.println("  로그: delete 성공");
				return true;
			}
		}
		System.out.println("  로그: delete 실패");
		return false;
	}

	public boolean update(int num, int lv) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == num) {
				datas.get(i).setLv(lv);
				System.out.println("  로그: update 성공");
				return true;
			}
		}
		System.out.println("  로그: update 실패");
		return false;
	}

	public ArrayList<PoVO> selectAll() {
		return datas;
	}

	public PoVO selectOne(int num) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == num) {
				return datas.get(i);
			}
		}
		return null;
	}

	// "검색" 기능(서비스)은 R : selectAll
	public ArrayList<PoVO> selectAll(String name) {
		ArrayList<PoVO> preDatas = new ArrayList<PoVO>();
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getName().equals(name)) {
				preDatas.add(datas.get(i));
			}
		}
		return preDatas;
	}

}
