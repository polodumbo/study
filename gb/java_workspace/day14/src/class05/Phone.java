package class05;

public interface Phone {
	// public : 공개범위 오픈
	// static : "객체와 무관하게"
	// final : "상수화" (값이 고정됨)
	public static final int MAX = 100;
	int MIN = 0;

	public abstract void powerOn();

	void powerOff();

	void soundUp();

	void soundDown();
}
