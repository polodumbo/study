package class01.model;

import java.util.ArrayList;

public class ProductDAO {
	ArrayList<ProductVO> products;
	private int PK;

	public ProductDAO() {
		PK = 101;

		products = new ArrayList<ProductVO>();
		products.add(new ProductVO(PK++, "커피", 2500, 3));
		products.add(new ProductVO(PK++, "케이크", 4700, 0));
		products.add(new ProductVO(PK++, "홍차", 3200, 2));
	}

	// 상품 전체 출력
	public ArrayList<ProductVO> selectAll(ProductVO pvo) {
		return products;
	}

	// 상품 하나 출력
	public ProductVO selectOne(ProductVO pvo) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getNum() == pvo.getNum()) {
				return products.get(i);
			}
		}
		return null;
	}

	// 구매
	public boolean updateBuy(ProductVO pvo) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getNum() == pvo.getNum()) {
				products.get(i).setCnt(products.get(i).getCnt() - 1);
				return true;
			}
		}
		return false;
	}

	// 정보 변경
//	public boolean update(ProductVO pvo) {
//		for (int i = 0; i < products.size(); i++) {
//			if (products.get(i).getNum() == pvo.getNum()) {
//				if () { 
//					
//				} else if () {
//					
//				} else {
//					
//				}
//				
//			}
//		}
//	}

	// 회원 정보 변경
//	public boolean update(MemberVO mvo) {
//		for (int i = 0; i < members.size(); i++) {
//			if (members.get(i).getId().equals(mvo.getId())) { // 더블체크
//				if (mvo.getName() != null) { // mvo의 이름이 있다면
//					members.get(i).setName(mvo.getName()); // 이름 변경
//					System.out.println("\t로그: 이름 변경 성공");
//				} else { // 이름이 없다면 == 비밀번호가 있다면
//					members.get(i).setPw(mvo.getPw()); // 비밀번호 변경
//					System.out.println("\t로그: 비밀번호 변경 성공");
//				}
//				System.out.println("\t로그: 회원정보 변경 성공");
//				return true;
//			}
//		}
//		System.out.println("\t로그: 회원정보 변경 실패");
//		return false;
//	}

}
