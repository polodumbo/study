package task;

class Animal {
	String name;
	String type;
	String tool;

	void hello() {
		System.out.println("안녕 ㅎㅎ");
	}

	void info() {
		String msg = this.name + ", " + this.type + ", ";

		if (this.tool == null) {
			msg += "X";
		} else {
			msg += this.tool;
		}
		System.out.println(msg);
	}

	void changeTool(String newTool) {
		if (newTool.equals(this.tool)) {
			System.out.println("이미 들고 있는 도구입니다.");
			return;
		}
		this.tool = newTool;
		System.out.println("도구를 " + newTool + "(으)로 바꿔 들었습니다.");
	}

	void action() {
		if (this.tool == null) {
			// 문자열 비교 시 NULL 체크 로직을 최상단에 위치시켜야 NPE를 방지할 수 있다
			System.out.println("나무 흔들기");
		} else if (this.tool.equals("도끼")) {
			System.out.println("나무 베기");
		} else if (this.tool.equals("낚시대")) {
			System.out.println("낚시하기");
		} else if (this.tool.equals("삽")) {
			System.out.println("땅 파기");
		} else {
			System.out.println("올바르지 않은 도구를 들고 있어요!!");
		}
	}

	@Override
	public String toString() {
		if (this.tool == null) {
			return this.type + " " + this.name + "는 " + "빈 손이에요.";
		} else {
			return this.type + " " + this.name + "는 " + this.tool + "(을)를 들고 있어요!!";
		}
	}

	Animal(String name) {
		this(name, "");
	}

	Animal(String name, String tool) {
		this.name = name;
		this.tool = tool;
		this.type = "동물";
	}
}

class Hamster extends Animal {

	@Override // @ : 어노테이션
	void hello() {
		System.out.println("안녕 찍찍");
	}

	Hamster(String name) {
		this(name, null);
	}

	Hamster(String name, String tool) {
		super(name, tool);
		this.type = "햄스터";
	}
}

class Bird extends Animal {
	@Override
	void hello() {
		System.out.println("안녕 짹쨱");
	}

	Bird(String name) {
		this(name, null);
	}

	Bird(String name, String tool) {
		super(name, tool);
		this.type = "새";
	}
}

class Cat extends Animal {
	@Override
	void hello() {
		System.out.println("안녕 야옹");
	}

	Cat(String name) {
		this(name, null);
	}

	Cat(String name, String tool) {
		super(name, tool);
		this.type = "고양이";
	}
}

public class Task01 {
	public static void main(String[] args) {
		Hamster ham = new Hamster("뽀야미", "삽");
		Bird bird = new Bird("문대");
		Cat cat = new Cat("1호", "모종삽");

		System.out.println(ham);
		ham.hello();
		ham.changeTool("삽");
		ham.action();

		System.out.println("==================");

		System.out.println(bird);
		bird.hello();
		bird.action();

		System.out.println("==================");

		System.out.println(cat);
		cat.action();
		cat.changeTool("도끼");
		cat.action();
		
		System.out.println();
		
		// 캐스팅
		Animal[] arData = new Animal[3];
		arData[0] = ham;
		arData[1] = bird;
		arData[2] = cat;
		
		for (Animal v : arData) {
			v.hello(); // 각자 오버라이딩한 hello() 대로 나온다.
			// 오버라이딩한 메서드가 자동 호출되는
			// 동적바인딩 현상이 일어났기 때문
		} 
		
		
		
		
		
		
		
		
		
	}
}
