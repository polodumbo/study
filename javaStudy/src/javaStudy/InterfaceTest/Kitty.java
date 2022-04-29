package javaStudy.InterfaceTest;

public class Kitty implements Pet {

	@Override
	public void sitDown() {
		System.out.println("싫어");
	}

	@Override
	public void stop() {
		System.out.println("싫어");
	}

	@Override
	public void poop() {
		System.out.println("알아서 잘 싼다.");
	}

	@Override
	public void 빵야() {
		System.out.println("손가락을 뭅니다.");
	}
	
}
