package class01.model;

import java.util.ArrayList;

public class ProductDAO {
	int PK;
	ArrayList<ProductVO> pdatas;
	public ProductDAO() {
		PK=101;
		pdatas=new ArrayList<ProductVO>();
		pdatas.add(new ProductVO(PK++,"커피",2500,1));
		pdatas.add(new ProductVO(PK++,"케이크",4700,0));
		pdatas.add(new ProductVO(PK++,"홍차",3200,2));
	}
	public ArrayList<ProductVO> selectAll(ProductVO pvo){
		return pdatas;
	}
	public ProductVO selectOne(ProductVO pvo){
		for(int i=0;i<pdatas.size();i++) {
			if(pdatas.get(i).getNum()==pvo.getNum()) {
				return pdatas.get(i);
			}
		}
		return null;
	}
	public boolean update(ProductVO pvo) {
		// 구매 로직
		for(int i=0;i<pdatas.size();i++) {
			if(pdatas.get(i).getNum()==pvo.getNum()) {
				if(pdatas.get(i).getCnt()>0) {
					pdatas.get(i).setCnt(pdatas.get(i).getCnt()-1);
					return true;
				}				
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
