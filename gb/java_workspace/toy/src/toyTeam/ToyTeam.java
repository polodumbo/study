package toyTeam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

abstract class Device {
	private int num; // PK
	private String brand; // 브랜드명
	private String name; // 기기명
	private int price; // 가격
	private int inven; // 재고(inventory)
	private int sellCnt; // 판매량

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInven() {
		return inven;
	}

	public void setInven(int inven) {
		this.inven = inven;
	}

	public int getSellCnt() {
		return sellCnt;
	}

	public void setSellCnt(int sellCnt) {
		this.sellCnt = sellCnt;
	}

	@Override
	public String toString() {
		return this.num + ". [" + this.brand + "] " + this.name + " "
				+ this.price + "만 원 재고(" + this.inven + ")";
	}

	// 추상 메서드
	abstract int discount();
		// 할인 기능
		// 삼성 20%
		// 애플 10%

	void buy() {
		if (this.inven == 0) {
			System.out.println("재고가 없습니다. 관리자에게 문의하여 주십시오\n");
			return;
		}
		System.out.print("[" + this.brand + "] " + this.name + "(을)를 ");
		System.out.println(this.discount() + "만 원에 구매하셨습니다.\n"); // 동적 바인딩
		this.inven--;
		this.sellCnt++;
	}

	// 생성자 오버로딩
	Device(int num, String name, int price) {
		this(num, name, price, new Random().nextInt(3) + 1); // 재고 1~3개 랜덤
	}
	
	Device(int num, String name, int price, int inven) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.brand = "";
		this.inven = inven;
		this.sellCnt = 0;
	}
}

class Samsung extends Device {
	@Override
	int discount() { // 오버라이딩, 할인율 20퍼센트
		System.out.print("할인율 20% 적용된 ");
		return (int)(this.getPrice() * 0.8);
	}

	Samsung(int num, String name, int price) {
		super(num, name, price);
		this.setBrand("삼성");
	}

	Samsung(int num, String name, int price, int inven) {
		super(num, name, price, inven);
		this.setBrand("삼성");
	}
}

class Apple extends Device {
	@Override
	int discount() { // 오버라이딩, 할인율 10퍼센트
		System.out.print("할인율 10% 적용된 ");
		return (int)(this.getPrice() * 0.9);
	}

	Apple(int num, String name, int price) {
		this(num, name, price, new Random().nextInt(3) + 1);
		this.setBrand("애플");
	}
	
	Apple(int num, String name, int price, int inven) {
		super(num, name, price, inven);
		this.setBrand("애플");
	}
}

public class ToyTeam {
	// ArrayList 출력 모듈화
	public static void printList(ArrayList<Device> devices) {
		for (Device v : devices) {
			System.out.println(v);
		}
	}
	
	// 기기 번호 입력해야 되는 상황 모듈화
	public static Device checkDeviceNum(ArrayList<Device> devices, String qnMsg) {
		Scanner sc = new Scanner(System.in);

		printList(devices);

		boolean isNumCorrect = false; // 기기번호가 일치하는지 안 하는지 체크
		Device device = null; // 임시로 객체의 정보를 담을 객체
		while (true) {
			int act = 0;
			try {
				System.out.println(qnMsg); // 기기번호로 무엇을 할 것인지 질문
				System.out.print("입력) ");
				act = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\n정수만 입력해주세요!");
				sc.nextLine();
				continue;
			}
			for (Device v : devices) {
				if (act == v.getNum()) { // 입력한 값과 일치하는 기기번호를 찾으면
					isNumCorrect = true;
					device = v; // 해당 객체의 정보 임시 저장
					break; // for문 즉시 종료
				}
			}
			System.out.println();
			// 종료 조건
			if (isNumCorrect) { // 일치하는 번호가 있었다면
				break;
			}
			System.out.println("없는 번호입니다.");
		}
		return device; // device 반환
	}
	
	// 객체가 없을 때의 처리 로직 모듈화
	public static boolean isArrayEmpty(ArrayList<Device> devices, int act) {
		// 유효성 검사
		if (devices.isEmpty()) { // ArrayList에 저장된 데이터가 없다면
			if (act == 2) { // [관리자] 2. 매출 내역
				System.out.println("데이터가 없습니다.\n");
			} else if (act == 3) { // [관리자] 3. 재고 관리
				System.out.println("관리할 기기가 없습니다.\n");
			} else if (act == 4) { // [관리자] 4. 삭제(단종시키기)
				System.out.println("단종시킬 기기가 없습니다.\n");
			} else if (act == 1) { // [구매자] 1. 구매
				System.out.println("판매 중인 기기가 없습니다. 관리자에게 문의해주세요\n");
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Device> devices = new ArrayList<Device>(); // 디바이스 관리
		HashMap<String, String> login = new HashMap<String, String>(); // 회원 관리

		int sNum = 101; // 삼성 PK
		int aNum = 201; // 애플 PK
		
		devices.add(new Samsung(sNum++, "갤럭시 S22", 20)); 
		devices.add(new Samsung(sNum++, "갤럭시탭 S8", 70));
		devices.add(new Apple(aNum++, "아이폰 14", 100));
		devices.add(new Apple(aNum++, "아이패드 프로", 130));
		login.put("admin", "admin"); // 관리자 계정
		
		int act = 0;
		
		String id; // Key
		String pw; // Value

		while (true) {
			try {
				System.out.println("===================");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("3. 프로그램 종료");
				System.out.println("===================");
				System.out.print("입력) ");
				act = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\n정수만 입력해주세요!\n");
				sc.nextLine();
				continue;
			}
			System.out.println();
			if (act == 1) { // [프로그램] 1. 회원가입
				System.out.println("회원가입을 위해 다음을 입력해주세요!\n");
				while (true) {
					// ID
					System.out.print("사용할 아이디를 입력하세요) ");
					id = sc.next();
					if (login.containsKey(id)) {  // ID 중복 검사
						System.out.println("\n이미 사용 중인 ID입니다.\n");
						continue;
					}
					
					// PW
					while (true) {
						System.out.print("비밀번호를 입력하세요) ");
						pw = sc.next();
						System.out.print("비밀번호를 한 번 더 입력하세요) ");
						String checkPw = sc.next();
						if (pw.equals(checkPw)) { // PW 재확인 검사
							login.put(id, pw); // 회원가입 성공
							System.out.println("\n회원가입 성공!\n");
							break;
						} else {
							System.out.println("\n잘못 입력하셨습니다. 다시 입력해주세요!\n");
							continue;
						}
					}
					break;
				}
			} else if (act == 2) { // [프로그램] 2. 로그인
				System.out.println("로그인을 위해 다음을 입력해주세요!\n");
				while (true) {
					System.out.print("아이디 입력) ");
					id = sc.next();
					System.out.print("비밀번호 입력) ");
					pw = sc.next();
					
					// 종료 조건
					if (login.containsKey(id)) { // 있는 id이고
						if (login.get(id).equals(pw)) { // key인 id의 value와 입력한 pw가 일치한다면
							System.out.println("\n로그인 성공!");
							break;
						}
					}
					System.out.println("\n없는 아이디거나 비밀번호가 일치하지 않습니다.\n");
				}

				if (id.equals("admin")) {
					System.out.println("\n관리자 모드를 실행합니다.\n");
					while (true) { // [관리자 모드]
						try {
							System.out.println("===================");
							System.out.println("1. 새로운 기기 추가");
							System.out.println("2. 매출 내역 조회");
							System.out.println("3. 재고 관리(입고/출고)");
							System.out.println("4. 삭제(단종시키기)");
							System.out.println("5. 관리자 모드 종료");
							System.out.println("===================");
							System.out.print("입력) ");
							act = sc.nextInt();
						} catch (InputMismatchException e) {
							sc.nextLine();
							System.out.println("\n정수만 입력해주세요!\n");
							continue;
						}
						System.out.println();
						if (act == 1) { // [관리자] 1. 새로운 기기 추가
							String name = null; // 기기명
							int brandNum = 0; // 삼성 or 애플
							int price = 0; // 가격
							int inven = 0; // 재고

							// 삼성 or 애플
							while (true) {
								try {
									System.out.println("브랜드를 선택하세요");
									System.out.println("1. 삼성 2. 애플");
									System.out.print("입력) ");
									brandNum = sc.nextInt();
								} catch (InputMismatchException e) {
									sc.nextLine();
									System.out.println("\n정수만 입력해주세요!\n");
									continue;
								}
								// 종료 조건
								if (brandNum == 1 || brandNum == 2) { // brandNum이 1이나 2라면
									break;
								}
								System.out.println("\n잘못 입력하셨습니다.\n");
							}
							sc.nextLine(); // 버퍼에 남아있는 개행문자 비우기

							// 기기명 입력
							while (true) {
								System.out.print("\n기기명 입력) ");
								name = sc.nextLine();
								boolean isExisting = false; // 기기명 중복인지 체크
								for (Device v : devices) {
									if (v.getName().equals(name)) { // 객체의 기기명과 입력한 기기명이 같다면
										isExisting = true;
										break;
									}
								}
								// 종료 조건
								if (isExisting) { // 같은 이름의 기기가 있다면
									System.out.println("\n이미 사용 중인 기기명입니다.");
									System.out.println("다른 기기명을 입력해주세요\n");
								} else { // 없다면
									break;
								}
							}

							// 가격 입력
							while (true) {
								try {
									System.out.println("\n가격을 입력하세요(만 원 단위)");
									System.out.print("입력) ");
									price = sc.nextInt();
								} catch (InputMismatchException e) {
									sc.nextLine();
									System.out.println("\n정수만 입력해주세요!\n");
									continue;
								}
								break;
							}
							
							// 수량 입력
							while (true) {
								try {
									System.out.println("\n수량을 입력하세요");
									System.out.print("입력) ");
									inven = sc.nextInt();
								} catch (InputMismatchException e) {
									sc.nextLine();
									System.out.println("\n정수만 입력해주세요!\n");
									continue;
								}
								// 종료 조건
								if (inven > 0) {
									break;
								}
								System.out.println("0 이상의 수를 입력해주세요");
							}

							// 기기 추가(기기번호순으로)
							if (brandNum == 1) { // 브랜드가 삼성이라면
								int index = 0;
								for (Device v : devices) {
									if (v.getNum() > 200) { // ArrayList의 가장 빠른 애플 객체
										index = devices.indexOf(v); // 가장 빠른 애플의 인덱스 번호
										break;
									} else { // 애플기기(200번대)가 없다면
										index = devices.size(); // 배열리스트의 마지막에 저장
									}
								}
								if (sNum < 200) {
									devices.add(index, new Samsung(sNum++, name, price, inven)); // add(index, element)
									 // devices.get(위에서 대입한 index) = 가장 최근에 객체화한 삼성 기기
									System.out.println("\n" + devices.get(index) + "(이)가 추가되었습니다.\n");
								} else {
									System.out.println("더 이상 삼성 기기를 추가할 수 없습니다.\n");
								}
							} else { // 애플이라면
								devices.add(new Apple(aNum++, name, price, inven)); // add(element)
								 // 맨 마지막에 있는 데이터 = 가장 최근에 객체화한 애플 기기
								System.out.println("\n" + devices.get(devices.size() - 1) + "(이)가 추가되었습니다.\n");
							}
						} else if (act == 2) { // [관리자] 2. 매출 내역
							// 유효성 검사
//							if (devices.size() == 0) { // ArrayList에 저장된 데이터가 없다면
//								System.out.println("데이터가 없습니다.\n");
//								continue;
//							}
							if (isArrayEmpty(devices, act)) continue;
							
							double dscnt = 0.0; // 할인율
							System.out.println("▶ 매출 내역");
							for (Device v : devices) {
								System.out.print(v);
								if (v.getBrand().equals("삼성")) { // 객체의 브랜드명이 "삼성"이라면
									dscnt = 0.8;
								} else { // 그 외, 객체의 브랜드명이 "애플"이라면
									dscnt = 0.9;
								}
								System.out.println(" | 매출액: " + (int)(v.getPrice() * dscnt * v.getSellCnt()) + "만 원");
								// 매출액: 기기값 * 할인율 * 판매량
							}
							System.out.println();
						} else if (act == 3) { // [관리자] 3. 재고 관리
							// 유효성 검사
//							if (devices.size() == 0) { // ArrayList에 저장된 데이터가 없다면
//								System.out.println("관리할 기기가 없습니다.\n");
//								continue;
//							}
							if (isArrayEmpty(devices, act)) continue;
							
							
							String qnMsg = "\n재고를 관리할 기기의 번호를 입력해주세요";
							Device device = checkDeviceNum(devices, qnMsg);

							System.out.println("현재 선택한 기기는 " + device + "입니다.");
							System.out.println();

							int invenResult = 0;
							while (true) {
								while (true) { // 입고할지 출고할지 선택
									try {
										System.out.println("1. 입고 2. 출고");
										System.out.print("입력) ");
										act = sc.nextInt();
									} catch (InputMismatchException e) {
										sc.nextLine();
										System.out.println("\n정수만 입력해주세요!\n");
										continue;
									}
									// 종료 조건
									if (act == 1 || act == 2) {
										break;
									}
									System.out.println("\n다시 입력해주세요\n");
								}
								System.out.println();
								int num = 0;
								if (act == 1) { // 1. 입고
									while (true) {
										try { // 수량 입력
											System.out.println("입고할 수량을 입력하세요(취소: 0)");
											System.out.print("입력) ");
											num = sc.nextInt();
										} catch (InputMismatchException e) {
											sc.nextLine();
											System.out.println("\n정수만 입력해주세요!\n");
											continue;
										}
										// 종료 조건
										if (num >= 0) { // 입력한 수가 0 이상이라면
											invenResult = device.getInven() + num; // 현재 수량 + 입력한 수
											break;
										}
										System.out.println("\n양수를 입력하세요\n");
									}
								} else if (act == 2) { // 2. 출고
									while (true) {
										try { // 수량 입력
											System.out.println("출고할 수량을 입력하세요(취소: 0)");
											System.out.print("입력) ");
											num = sc.nextInt();
										} catch (InputMismatchException e) {
											sc.nextLine();
											System.out.println("\n정수만 입력해주세요!\n");
											continue;
										}
										// 종료 조건
										if (num >= 0) { // 입력한 수가 0 이상이고
											if (device.getInven() - num >= 0) { // 현재 재고에서 차감한 수가 0 이상이라면
												invenResult = device.getInven() - num; // 현재 수량 - 입력한 수
												break;
											}
											System.out.println("\n재고는 0 미만이 될 수 없어요...\n");
											continue;
										}
										System.out.println("\n양수를 입력하세요\n");
									}
								}
								device.setInven(invenResult); // 객체에 입고/출고한 수량을 대입
								break;
							}
							System.out.println("\n" + device + " 재고 관리 완료\n");
						} else if (act == 4) { // [관리자] 4. 삭제(단종시키기)
							// 유효성 검사
//							if (devices.size() == 0) { // ArrayList에 저장된 데이터가 없다면
//								System.out.println("단종시킬 기기가 없습니다.\n");
//								continue;
//							}
							if (isArrayEmpty(devices, act)) continue;
							
							String qnMsg = "\n단종시킬 기기의 번호를 입력해주세요.\n"
									+ "삭제 시 해당 기기의 매출 기록 또한 삭제됩니다.";
							Device device = checkDeviceNum(devices, qnMsg);

							devices.remove(device);
							System.out.println("[" + device.getBrand() + "] " + device.getName() + "(을)를 삭제했습니다.\n");
						} else if (act == 5) { // [관리자] 5. 관리자 로그아웃
							System.out.println("관리자 모드를 종료합니다.\n");
							break;
						} else { // [관리자] act 유효성 검사
							System.out.println("다시 입력해주세요.\n");
							continue;
						}
					}
				} else {
					System.out.println("\n환영합니다. " + id + "님 ^~^\n");
					while (true) { // [구매자 모드]
						try {
							System.out.println("================");
							System.out.println("1. 구매");
							System.out.println("2. 로그아웃");
							System.out.println("================");
							System.out.print("입력) ");
							act = sc.nextInt(); 
						} catch (InputMismatchException e) {
							sc.nextLine();
							System.out.println("\n정수만 입력해주세요!\n");
							continue;
						}
						System.out.println();
						
						if (act == 1) { // [구매자] 1. 구매
							// 유효성 검사
//							if (devices.size() == 0) { // ArrayList에 저장된 데이터가 없다면
//								System.out.println("판매 중인 기기가 없습니다. 관리자에게 문의해주세요\n");
//								continue;
//							}
							if (isArrayEmpty(devices, act)) continue;

							boolean isNotSoldOut = false; // 재고 있는지 없는지 체크
							for (Device v : devices) {
								if (v.getInven() > 0) { // 재고가 하나라도 있다면
									isNotSoldOut = true;
									break;
								}
							}

							System.out.println("★★★★★삼성 20%, 애플 10% 상시 할인 중★★★★★\n");
							if (isNotSoldOut) {
								String qnMsg = "\n구매할 기기의 번호를 입력해주세요";
								Device device = checkDeviceNum(devices, qnMsg);
								device.buy();
							} else {
								printList(devices);
								System.out.println("\n죄송합니다. 현재 모든 기기의 재고가 없습니다.\n다음에 이용해주세요\n");
							}
						} else if (act == 2) { // [구매자] 2. 로그아웃
							System.out.println("이용해주셔서 감사합니다.\n");
							break;
						} else { // [구매자] act 유효성 검사
							System.out.println("다시 입력해주세요.\n");
							continue;
						}
					}
				}
			} else if (act == 3) { // [프로그램] 3. 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			} else { // [프로그램] act 유효성 검사
				System.out.println("잘못 입력하셨습니다.\n");
				continue;
			}
		}
	}
}