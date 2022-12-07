package class03.model;

import java.util.ArrayList;


// ★★★★★
// 사용자를 절대 신경 X
// syso() 오직 "로그"
// ★★★★★
public class PokeDAO {
	private int PK;
	ArrayList<PokeVO> pokes; // "포켓몬 수첩"
	
	public PokeDAO() {
		PK = 101;
		pokes = new ArrayList<PokeVO>();
		
		pokes.add(new PokeVO(PK++, "파이리"));
		pokes.add(new PokeVO(PK++, "팽도리"));
	}
	
	// Create
	public boolean insert(PokeVO vo) {
//		pokes.add(new PokeVO(PK++, name));
//		System.out.println("\t로그: 포켓몬 추가 성공");
//		return true;
		try {
			pokes.add(new PokeVO(PK++, vo.getName()));
			System.out.println("\t로그: 포켓몬 추가 성공");
		} catch (Exception e) {
			System.out.println("\t로그: 포켓몬 추가 실패");
			return false;
		}
		return true;
	}
	
	// Update
	public boolean update(PokeVO vo) {
		for (int i = 0; i < pokes.size(); i++) {
			if (pokes.get(i).getNum() == vo.getNum()) {
				pokes.get(i).setLevel(vo.getLevel());
				System.out.println("\t로그: 포켓몬 레벨 변경 성공");
				return true;
			}
		}
		System.out.println("\t로그: 포켓몬 레벨 변경 실패");
		return false;
	}
	
	// Delete
	public boolean delete(PokeVO vo) {
		for (int i = 0; i < pokes.size(); i++) {
			if (pokes.get(i).getNum() == vo.getNum()) {
				pokes.remove(i);
				System.out.println("\t로그: 포켓몬 삭제 성공");
				return true;
			}
		}
		System.out.println("\t로그: 포켓몬 삭제 실패");
		return false;
	}
	
	// Read
	public ArrayList<PokeVO> selectAll() {
		return pokes;
	}
	
	// Read
	public PokeVO selectOne(PokeVO vo) {
		for (int i = 0; i < pokes.size(); i++) {
			if (pokes.get(i).getNum() == vo.getNum()) {
				return pokes.get(i);
			}
		}
		return null;
	}
	
	// Read
	// 이름 검색
	// 멤버변수로 선언하면 계속 메모리를 사용하기 때문에 비효율적
	public ArrayList<PokeVO> selectAll(PokeVO vo) {
		if (vo == null) {
			return pokes;
		}
		ArrayList<PokeVO> pokeNames = new ArrayList<PokeVO>();
		
		try {
			for (int i = 0; i < pokes.size(); i++) {
				if (pokes.get(i).getName().equals(vo.getName())) {
					pokeNames.add(pokes.get(i));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\t로그: 이름으로 포켓몬 검색 실패");
			return null;
		}
		System.out.println("\t로그: 이름으로 포켓몬 검색 성공");
		return pokeNames;
	}
	
	// Read
	// 단어 검색
	public ArrayList<PokeVO> selectAllByWord(PokeVO vo) { // 웹에서 "검색어"는 "searchContent"를 많이 쓴다.
		ArrayList<PokeVO> pokeNames = new ArrayList<PokeVO>();
		if (vo == null) {
			return pokes;
		}
		try {
			for (int i = 0; i < pokes.size(); i++) {
				if (pokes.get(i).getName().contains(vo.getName())) {
					pokeNames.add(pokes.get(i));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\t로그: 단어로 포켓몬 검색 실패");
			return null;
		}
		System.out.println("\t로그: 단어로 포켓몬 검색 성공");
		return pokeNames;
	}
	
	
}
