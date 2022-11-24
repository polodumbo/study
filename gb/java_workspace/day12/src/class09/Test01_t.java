package class09;

import java.util.Random;
import java.util.Scanner;

class Pokemon{
	protected String name;
	protected int lv;
	protected int exp;
	static int NUM=20;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	void attack() {
		System.out.println(this.name+"의 공격!");
		this.hello();
		int exp=new Random().nextInt(100);
		if(exp<20) {
			System.out.println("공격실패: "+exp);
			return;
		}
		System.out.println("공격성공: "+exp);
		this.exp+=exp;
		if(this.exp>=100) {
			System.out.println(this.name+", 레벨업");
			this.exp-=100;
			this.lv++;
			if(this.lv==10 || this.lv==20) {
				this.changeName();
			}
		}
	}
	void changeName() {} // 오버라이딩하여 사용할 메서드
	void hello() {} // 오버라이딩하여 사용할 메서드
	@Override
	public String toString() {
		return this.name+" lv."+this.lv+" ["+this.exp+"/100]";
	}
	Pokemon(String name){
		this.name=name;
		this.lv=5;
		this.exp=0;
	}
}
class Charmander extends Pokemon{
	@Override
	void changeName() {
		System.out.print(this.name+"은(는) ");
		if(this.lv==10) {
			this.name="리자드";
		}
		else if(this.lv==20) {
			this.name="리자몽";
		}
		System.out.println(this.name+"이(가) 되었다!");
	}
	@Override
	void hello() {
		System.out.println("파아~~~");
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Charmander) {
			System.out.println("알 획득!");
			return true;
		}
		System.out.println(".......");
		return false;
	}
	Charmander(){
		super("파이리");
	}
}
class Squirtle extends Pokemon{
	@Override
	void changeName() {
		System.out.print(this.name+"은(는) ");
		if(this.lv==10) {
			this.name="어니부기";
		}
		else if(this.lv==20) {
			this.name="거북왕";
		}
		System.out.println(this.name+"이(가) 되었다!");
	}
	@Override
	void hello() {
		System.out.println("꼬북꼬북");
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Squirtle) {
			System.out.println("알 획득!");
			return true;
		}
		System.out.println(".......");
		return false;
	}
	Squirtle(){
		super("꼬부기");
	}
}
public class Test01_t {
	public static void main(String[] args) {

		Pokemon[] datas=new Pokemon[3];
		int index=0;

		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("----------");
			System.out.println("1. 포켓몬 추가");
			System.out.println("2. 목록 출력");
			System.out.println("3. 공격");
			System.out.println("4. 놓아주기");
			System.out.println("5. 키우미집");
			System.out.println("6. 프로그램 종료");
			System.out.println("----------");
			System.out.print("입력) ");
			int act=sc.nextInt();
			if(act==1) {
				if(index>=datas.length) {
					System.out.println("포켓볼이 없습니다!");
					continue;
				}
				System.out.println("1. 꼬부기 2. 파이리");
				int num;
				while(true) {
					System.out.print("번호입력) ");
					num=sc.nextInt();
					if(num==1 || num==2) {
						break;
					}
					System.out.println("   다시입력하세요.");
				}
				if(num==1) {
					datas[index]=new Squirtle();
				}
				else if(num==2) {
					datas[index]=new Charmander();
				}
				index++;
			}
			else if(act==2) {
				if(index==0) {
					System.out.println("출력할 데이터가 없습니다!");
					continue;
				}
				for(int i=0;i<index;i++) {
					System.out.println(datas[i]);
				}
			}
			else if(act==3) {
				if(index==0) {
					System.out.println("포켓몬이 없습니다!");
					continue;
				}
				int num;
				while(true) {
					System.out.print("포켓몬 번호입력) ");
					num=sc.nextInt();
					if(1<=num && num<=index) {
						break;
					}
					System.out.println("   다시입력하세요.");
				}
				datas[num-1].attack();
				datas[num-1].attack();
			}
			else if(act==4) {
				if(index==0) {
					System.out.println("놓아줄 포켓몬이 없습니다!");
					continue;
				}
				index--;
				System.out.println(datas[index].name+"이(가) 떠납니다. 바이바이!");
			}
			else if(act==5) {
				if(index<2) {
					System.out.println("포켓몬이 부족합니다!");
					continue;
				}
				datas[0].equals(datas[1]);
			}
			else if(act==6) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("유효성 검사");
				System.out.println("잘못된 입력");
			}
		}

	}	
}
