package threeLevelInheritance;

import java.util.Random;
import java.util.Scanner;

//   ※ 유효성,경계값 검사
//   ※ 사용자 편의성 고려
//   ※ private + getter,setter public
//   ※ toString 오버라이딩
//   ※ CRUD 제공하여 보여주기
//   ※ 오버라이딩
//   ※ (오버로딩)
//   ※ (업)캐스팅
//   ※ 추상클래스 + 추상메서드

// 1) 최상위 클래스가 abstract인 삼단 구성의 클래들을 정의하세요.
// 2) abstract 최상위 클래스는 abstract 메서드를 가지고 있습니다.
// 3) 사용자 편의성 및 입력한 값에 대한 유효성을 검사합니다.
// 4) 각 클래스들을 멤버변수에 대해 getter, setter를 가집니다.
// 5) Object로 부터 toString() 메서드를 오버라이딩 합니다.
// 6) 최하위 클래스들의 객체들을 객체 배열에 저장하여 CRUD 서비스 이용합니다. (캐스팅)   
// 7) 메서드 오버라이딩을 이용합니다.

//1) 최상위 클래스가 abstract인 삼단 구성의 클래들을 정의하세요.
abstract class Device { // 최상위 클래스
	Random rand = new Random(); // 랜덤값을 위한 임포트
	Scanner sc = new Scanner(System.in); // 입력받기위한 스캐너 임포트

	private String brand; // 브랜드명
	private String name; // 기기명
	private String chargerType; // 충전기 타입
	private int deviceNum; // 기기 번호
	private int battery; // 배터리 잔량

	// getter, setter
	// 4) 각 클래스들을 멤버변수에 대해 getter, setter를 가집니다.

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChargerType() {
		return chargerType;
	}

	public void setChargerType(String chargerType) {
		this.chargerType = chargerType;
	}

	public int getDeviceNum() {
		return deviceNum;
	}

	public void setDeviceNum(int deviceNum) {
		this.deviceNum = deviceNum;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	void charge() { // 충전 기능
		// 유효성 검사
		if (this.battery == 100) { // 배터리가 100%인 기기 선택 시
			System.out.println("이미 완전 충전된 기기입니다.");
			return; // 종료
		}
		System.out.print(this.name + " 충전 진행 중");
		try {
			for (int i = 0; i < 3; i++) {
				Thread.sleep(500); // 충전 시간 대기
				System.out.print(".");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		int energy = rand.nextInt(81) + 20; // 20~100 랜덤하게 충전
		this.battery += energy; // 현재 배터리에 충전값을 랜덤으로 받아서 더함
		if (this.battery >= 100) { // 배터리가 100% 초과라면
			this.battery = 100; // 최대 배터리량 100 고정
			System.out.println("배터리가 완전히 충전되었습니다.");
		}
		System.out.println("\n" + this); // 충전된 기기 정보 출력
	}

	void playGame() { // 게임 기능(배터리 소모)
		// 유효성 검사
		if (this.battery == 0) { // 0%라면
			System.out.println("배터리가 없습니다.");
			return; // 게임 못 함
		}
		System.out.println(this.name + "(으)로 게임 실행해줘");
		System.out.print("Gaming");
		try {
			for (int i = 0; i < 3; i++) {
				Thread.sleep(500); // 게임 실행중
				System.out.print(".");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		if (this.battery <= 20) { // 배터리가 20% 이하였는데 게임을 했을 시
			this.battery = 0; // 배터리 0%
			System.out.println("배터리 부족... 전원을 종료합니다...");
			System.out.println("\n" + this); // 게임 실행 후 기기 정보 출력
		} else { // 20% 초과였다면
			this.battery = 20; // 배터리 20%
			System.out.println("잔여 배터리 20%, 기기를 충전해주세요!");
			System.out.println("\n" + this); // 게임 실행 후 기기 정보 출력
		}
	}

	// toString 오버라이딩
	// 5) Object로 부터 toString() 메서드를 오버라이딩 합니다.
	@Override
	public String toString() { // 브랜드명 기기명 충전기타입 배터리[??/100]
		return this.getBrand() + " " + this.getName() + " " + this.getChargerType() + " 배터리[" + this.getBattery()
				+ "/100]";
	}

	// 추상메서드
	// 2) abstract 최상위 클래스는 abstract 메서드를 가지고 있습니다.
	abstract void callAI();

	Device() { // 생성자
		// 멤버변수 초기화
		this.name = "";
		this.brand = "";
		this.chargerType = "";
		this.deviceNum = 0;
		this.battery = 80;
	}
}

class Samsung extends Device {
	private String bixby;

	public String getBixby() {
		return bixby;
	}

	public void setBixby(String bixby) {
		this.bixby = bixby;
	}

	// 7) 메서드 오버라이딩을 이용합니다.
	@Override
	void callAI() { // AI부르기 기능
		System.out.println(this.bixby);
		System.out.println("1. 게임 실행해줘");
		System.out.println("2. 그냥 불러봤어");
		System.out.print("입력: ");
		int ans = sc.nextInt();

		System.out.println();
		if (ans == 1) { // 1번이라면
			playGame(); // 게임 실행 기능
		} else if (ans == 2) { // 2번이라면
			System.out.println("빅스비 종료");
		} else {
			System.out.println("잘못 알아들었어요.");
		}
	}

	Samsung() { // 생성자
		// 멤버변수 초기화
		super();
		this.setBrand("삼성");
		this.bixby = "하이 빅스비";
	}
}

class Apple extends Device {
	private String siri;

	public String getSiri() {
		return siri;
	}

	public void setSiri(String siri) {
		this.siri = siri;
	}

	// 7) 메서드 오버라이딩을 이용합니다.
	@Override
	void callAI() { // AI부르기 기능
		System.out.println(this.siri);
		System.out.println("1. Start Game!");
		System.out.println("2. Never mind");
		System.out.print("입력: ");
		int ans = sc.nextInt();

		System.out.println();
		if (ans == 1) { // 1번이라면
			playGame(); // 게임 실행 기능
		} else if (ans == 2) { // 2번이라면
			System.out.println("시리가 종료됩니다.");
		} else {
			System.out.println("잘못 알아들었어요.");
		}
	}

	Apple() { // 생성자
		// 멤버변수 초기화
		super();
		this.setBrand("애플");
		this.siri = "시리야~";
	}
}

// 최하위 클래스들 생성자 초기화
class GBook extends Samsung {
	GBook() {
		super();
		this.setName("갤럭시북");
		this.setChargerType("C타입");
		this.setDeviceNum(1);
	}

}

class GTab extends Samsung {
	GTab() {
		super();
		this.setName("갤럭시탭");
		this.setChargerType("C타입");
		this.setDeviceNum(2);
	}
}

class Galaxy extends Samsung {
	Galaxy() {
		super();
		this.setName("갤럭시");
		this.setChargerType("C타입");
		this.setDeviceNum(3);
	}
}

class MacBook extends Apple {
	MacBook() {
		super();
		this.setName("맥북");
		this.setChargerType("MagSafe");
		this.setDeviceNum(4);
	}
}

class IPad extends Apple {
	IPad() {
		super();
		this.setName("아이패드");
		this.setChargerType("C타입");
		this.setDeviceNum(5);
	}
}

class IPhone extends Apple {
	IPhone() {
		super();
		this.setName("아이폰");
		this.setChargerType("Lightning");
		this.setDeviceNum(6);
	}
}

public class TEST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력받기 위한 스캐너 임포트
		// 6) 최하위 클래스들의 객체들을 객체 배열에 저장하여 CRUD 서비스 이용합니다. (캐스팅)
		Device[] datas = new Device[4]; // 가질 수 있는 디바이스 최대 개수
		int index = 0; // 현재 배열에 저장된 객체의 개수
		while (true) { // 메인 UI
			System.out.println();
			System.out.println("=================");
			System.out.println("1. 새로운 기기 구매");
			System.out.println("2. 보유 기기 목록");
			System.out.println("3. 기기 충전하기");
			System.out.println("4. AI 부르기");
			System.out.println("5. 최근 기기 판매하기");
			System.out.println("6. 프로그램 종료");
			System.out.println("=================");
			System.out.print("입력) ");
			int act = sc.nextInt(); // 입력받은 선택지 act에 저장
			System.out.println();
			if (act == 1) { // 새로운 기기 구매
				// 유효성 검사
				if (index >= datas.length) { // 인덱스가 device배열의 길이보다 크거나 같다면
					System.out.println("새로운 기기를 살 돈이 없습니다...");
					continue; // 다시 반복문으로 돌아가기
				}
				int num = 0; // num 초기화
				while (true) { // 구매 목록
					System.out.println("1. 갤럭시북\t2. 갤럭시탭\t3. 갤럭시\n4. 맥북\t\t5. 아이패드\t6. 아이폰");
					System.out.print("입력) ");
					num = sc.nextInt();
					// 종료 조건, 경계값
					if (num >= 1 && num <= 6) { // 유효성 검사
						while (true) { // 유효하다면 while문
							boolean flag = true; // 중복인지 아닌지 검사하는 역할, 중복이 아니라면 true
							for (int i = 0; i < index; i++) { // 보유중인 객체의 수 만큼 검사
								if (datas[i].getDeviceNum() == num) { // 보유 중인 객체 중에 입력받은 값과 같은 값의 DeviceNum을 가진 객체가 있다면
									flag = false;
								}
							}
							if (!flag) { // 이미 가지고 있는 기기를 구매하려고 시도했다면
								System.out.println("\n이미 보유 중인 기기입니다. 정말 구매하시겠어요?(\"Y\")");
								System.out.println("취소하려면 아무 키나 입력하세요.");
								System.out.print("입력) ");
								String ans2 = sc.next();
								if (!ans2.equalsIgnoreCase("Y")) { // Y가 아닌 것을 입력했다면
									System.out.println("\n구매 취소");
									break;
								}
							}
							if (num == 1) { // 배열에 객체 추가(업 캐스팅)
								datas[index] = new GBook();
							} else if (num == 2) {
								datas[index] = new GTab();
							} else if (num == 3) {
								datas[index] = new Galaxy();
							} else if (num == 4) {
								datas[index] = new MacBook();
							} else if (num == 5) {
								datas[index] = new IPad();
							} else if (num == 6) {
								datas[index] = new IPhone();
							}
							index++; // index 위치 + 1
							System.out.println("\n" + datas[index - 1] + "(을)를 구매했습니다.");
							break;
						}
						break; // 구매 목록 while문 탈출
					} else {
						System.out.println("\n잘못 입력하셨습니다.");
						System.out.println("\n=================\n");
						continue;
					}
				}
			} else if (act == 2) { // 보유 기기 목록
				// 유효성 검사
				// 3) 사용자 편의성 및 입력한 값에 대한 유효성을 검사합니다.
				if (index == 0) { // 구매한 기기가 없다면
					System.out.println("보유 중인 기기가 없습니다...");
					continue;
				}
				int ssCnt = 0; // 삼성 기기 카운트
				int apCnt = 0; // 애플 기기 카운트
				for (int i = 0; i < index; i++) { // 배열의 길이 만큼이 아닌 현재 인덱스 전까지만
					if (datas[i].getBrand().equals("삼성")) { // 구매한 기기 중 브랜드명이 삼성과 같다면
						ssCnt++;
					} else if (datas[i].getBrand().equals("애플")) { // 구매한 기기 중 브랜드명이 애플과 같다면
						apCnt++;
					}
					System.out.println(datas[i]); // toString 재정의한 대로 출력
				}
				if (ssCnt >= 3) { // 삼성기기가 3개 이상이라면
					System.out.println("\n🦕 삼엽충이시군요!");
				} else if (apCnt >= 3) { // 애플기기가 3대 이상이라면
					System.out.println("\n🍎 앱등이시군요!");
				}
			} else if (act == 3) { // 기기 충전
				// 유효성 검사
				if (index == 0) {
					System.out.println("보유 중인 기기가 없습니다...");
					continue;
				}
				int num = 0; // num 초기화
				while (true) { // 충전기기 선택 반복문
					System.out.println("충전할 기기를 선택하세요");
					for (int i = 0; i < index; i++) { // 구매한 기기수만큼 for문 반복
						System.out.print((i + 1) + ". ");
						System.out.println(datas[i]); // 기기출력
					}
					System.out.print("입력) ");
					num = sc.nextInt();
					// 종료 조건, 경계값
					if (num >= 1 && num <= index) {
						break;
					}
					System.out.println("\n잘못 입력하셨습니다.");
					System.out.println("\n=================\n");
				}
				while (true) { // 케이블 선택 반복문
					System.out.println();
					System.out.println("케이블을 선택하세요");
					System.out.println("1. C타입 2. MagSafe 3. Lightning");
					System.out.print("입력) ");
					int j = sc.nextInt();
					String choosenType = "";
					if (j == 1) {
						choosenType = "C타입";
					} else if (j == 2) {
						choosenType = "MagSafe";
					} else if (j == 3) {
						choosenType = "Lightning";
					}
					if (j >= 1 && j <= 3) {
						if (datas[num - 1].getChargerType().equals(choosenType)) {
							break;
						}
						System.out.println("\n지원하지 않는 케이블입니다.");
						continue;
					}
					System.out.println("\n잘못 입력하셨습니다.");
					System.out.println("\n=================\n");

				}
				System.out.println("");
				datas[num - 1].charge(); // 선택한 기기 충전 기능 실행
			} else if (act == 4) { // AI 부르기
				if (index == 0) {
					System.out.println("보유 중인 기기가 없습니다...");
					continue;
				}
				int num = 0; // num 초기화
				while (true) { // AI를 부를 기기 선택 반복문
					System.out.println("기기를 선택하세요");
					for (int i = 0; i < index; i++) { // 구매한 기기 목록 출력 반복문
						System.out.print((i + 1) + ". ");
						System.out.println(datas[i]);
					}
					System.out.print("입력) ");
					num = sc.nextInt();
					// 종료 조건, 경계값
					if (num >= 1 && num <= index) {
						break;
					}
					System.out.println("\n잘못 입력하셨습니다.");
					System.out.println("\n=================");
				}
				System.out.println();
				datas[num - 1].callAI(); // 선택한 기기 AI 부르기
			} else if (act == 5) { // 최근 기기 판매
				// 유효성 검사
				if (index == 0) {
					System.out.println("보유 중인 기기가 없습니다...");
					continue;
				}
				System.out.println("중고 판매할 기기는 " + datas[index - 1] + "입니다.");
				// 사용자 편의성
				System.out.println("정말 판매하시겠어요?(\"Y\")");
				System.out.println("취소하려면 아무 키나 입력하세요.");
				System.out.print("입력) ");
				String ans = sc.next();
				if (!ans.equalsIgnoreCase("Y")) { // y를 입력해도 Y로 인식
					System.out.println("\n판매 취소");
					continue;
				}
				try {
					System.out.println("\n혹시... 당근이세요...?");
					Thread.sleep(1000);
					System.out.println("\n아, 네네... 혹시 그... " + datas[index - 1].getName() + "...");
					Thread.sleep(1000);
					System.out.println("\n아, 네. 맞아요. 여기...");
					Thread.sleep(1000);
					System.out.println("\n판매 완료");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				index--; // 배열에 저장된 기기 - 1
			} else if (act == 6) { // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else { // 1~6 외의 정수 입력했을 시
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}
}