package javaStudy.Java_lang.Object;

public class EqualsTest_Animal {
	public int number;
	public String name;
	
	public EqualsTest_Animal() {;}
	
	public EqualsTest_Animal(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	@Override
	// equals() : 두 개의 객체가 가지고 있는 주소값을 비교하여 같으면 true 다르면 false를 반환하는 메소드이다.
	// 필요에 따라 원하는 필드 값의 비교를 위한 재정의 요함.
	public boolean equals(Object obj) {
		// 주소가 같다면 true
		if (this == obj) {
			return true;
		}
		
		// 만약 타입이 같고
		if (obj instanceof EqualsTest_Animal) {
			// 다운 캐스팅
			EqualsTest_Animal anotherAnimal = (EqualsTest_Animal)obj;
			// 번호를 비교
			if(this.number == anotherAnimal.number) {
				return true;
			}
		}
		return false;
		
	}
}
