package javaStudy.InterfaceTest;

//
//public class Tiger implements Pet {
//	
//	@Override
//	public void poop() {
//		System.out.println("알아서 싼다.");
//	}
//}

public class Tiger extends PetAdapter {
	
	@Override
	public void poop() {
		System.out.println("알아서 싼다.");
	}
}