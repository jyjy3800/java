import java.util.Scanner;

public class HW_savebox {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		// 저금통 몇개 만들기
		System.out.println("저금통을 몇개 만드시겠습니까?");
		String inputCount = scanner.nextLine();
		int inputCountNum = Integer.parseInt(inputCount);
		SaveBox[] saveArray = new SaveBox[100];
		for (int i = 0; i < inputCountNum; i++) {
			SaveBox savebox = new SaveBox();
			saveArray[i] = savebox;
		}
		System.out.println(inputCountNum + "개의 저금통을 만들었습니다.");

		// 만든 저금통 이름정하기
		for (int i = 0; i < 9999; i++) {
			System.out.println("저금통이름을 정합니다.");
			System.out.println("순서대로 정하려면 1번 번호별로 정하려면 2 그만할려면 q를 누르세요");
			System.out.println("1.순서대로  2.번호별 ");
			String naming = scanner.nextLine();
			// savebox[0]부터 순서대로 저금통 이름짓기
			if (naming.equals("1")) {
				System.out.println("순서대로 정합니다.");
				System.out.println("저금통이름을 적으세요");
				for (int j = 0; j < inputCountNum; j++) {
					String saveName = scanner.nextLine();
					saveArray[j].setName(saveName);
				}
				System.out.println("이름을 모두 정했습니다.");
				break;
			}
			// 내가 원하는 순서대로 저금통 이름짓기
			else if (naming.equals("2")) {
				for (int j = 0; j < 999; j++) {
					System.out.println("몇번째 저금통의 이름을 정할껀가요");
					int inputNameNumber = scanner1.nextInt();
					int nameNumber = inputNameNumber - 1;
					if (saveArray[nameNumber] == null) {
						System.out.println("통장이 없습니다. 다시 누르세요");
					} else {
						System.out.println(inputNameNumber + "번째 통장의 이름을 적으세요");
						//
						String inputNaming = scanner.nextLine();
						saveArray[nameNumber].setName(inputNaming);
						System.out.println(inputNameNumber + "의 통장이름은 " + saveArray[nameNumber].name + "입니다.");
					}
					System.out.println("계속 이름짓기는 enter,그만하고 다음 단계는 q를 누르세요");
					String goStop = scanner.nextLine();
					if (goStop.equals("q")) {
						break;
					}
				}
			} else if (naming.equals("q")) {
				break;
			} else {
				System.out.println("다시 누르세요.");
			}

		} // 조회 or 입금 or 출금 선택
		for (int i = 0; i < 9999; i++) {
			System.out.println("단순조회는 1번,입금은 2번,저금통깨기는 3번을 누르세요");
			System.out.println("그만할려면 q를 누르세요");
			System.out.println("1.단순조회 2.입금 3.저금통깨기");
			String selecting = scanner.nextLine();
			// 조회
			if (selecting.equals("1")) {
				for (int j = 0; j < 9999; j++) {
					System.out.println("단순조회 입니다. 조회할 저금통의 이름 혹은 번호를 적으세요.그만 할려면 q를 누르세요");
					String check = scanner.nextLine();
					String checkInput = check;
					if (check.equals("q")) {
						break;
					}
					// 저금통 번호로 조회
					else if (Character.isDigit(check.charAt(0))) {

						int checkNum = Integer.parseInt(checkInput);
						if (saveArray[checkNum - 1].isBroken) {
							System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
						} else {
							if (saveArray[checkNum - 1] != null) {
								System.out.println((checkNum) + "번 저금통에" + saveArray[checkNum - 1].coin + "원 있습니다.");
							} else {
								System.out.println("저금통이 없습니다 다시 선택해주세요");
							}
						}
					}
					// 저금통 이름으로 조회
					else {
						boolean checkName = false;
						int checkNameNum = 9999;
						for (int k = 0; k < inputCountNum; k++) {
							if (saveArray[k].name.equals(check)) {
								checkName = true;
								checkNameNum = k;
							}
						}
						if (saveArray[checkNameNum].isBroken) {
							System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
						} else {
							if (checkName == true) {
								System.out.println(saveArray[checkNameNum].name + "저금통에 " + saveArray[checkNameNum].coin
										+ "원 있습니다.");
							} else {
								System.out.println("저금통이 없습니다 다시 선택해주세요");
							}
						}
					}
				}
			}
			// 입금
			else if (selecting.equals("2")) {
				for (int j = 0; j < 9999; j++) {
					System.out.println("입금입니다. 입금할 저금통의 이름 혹은 번호를 적으세요. 그만하려면 q를 누르세요");
					String check = scanner.nextLine();
					if (check.equals("q")) {
						break;
					}
					// 번호로 입금
					else if (Character.isDigit(check.charAt(0))) {
						int checkNum = Integer.parseInt(check);
						if (saveArray[checkNum - 1] != null) {
							System.out.println((checkNum) + "번 저금통입니다.");
							saveArray[checkNum - 1].deposit();
						}

					}
					// 이름으로 입금
					else {
						boolean checkName = false;
						int checkNameNum = 9999;
						for (int k = 0; k < inputCountNum; k++) {
							if (saveArray[k].name.equals(check)) {
								checkName = true;
								checkNameNum = k;
							}
						}
						if (checkName == true) {
							System.out.println(saveArray[checkNameNum].name + "저금통입니다.");
							saveArray[checkNameNum].deposit();
						} else {
							System.out.println("저금통이 없습니다 다시 선택해주세요");
						}
					}
				}

			}
			// 저금통깨기
			else if (selecting.equals("3")) {
				for (int j = 0; j < 9999; j++) {
					System.out.println("저금통깨기입니다. 깰 저금통의 이름 혹은 번호를 적으세요.그만하려면 q를 누르세요");
					String check = scanner.nextLine();
					if (check.equals("q")) {
						break;
					}
					// 번호로 깨기
					else if (Character.isDigit(check.charAt(0))) {
						int checkNum = Integer.parseInt(check);
						if (saveArray[checkNum - 1] != null) {
							System.out.println((checkNum) + "번 저금통입니다.");
							saveArray[checkNum - 1].withdraw();
						} else {
							System.out.println("저금통이 없습니다 다시 선택해주세요");
						}
					}
					// 이름으로 깨기
					else {
						boolean checkName = false;
						int checkNameNum = 9999;
						for (int k = 0; k < inputCountNum; k++) {
							if (saveArray[k].name.equals(check)) {
								checkName = true;
								checkNameNum = k;
							}
						}
						if (checkName == true) {
							System.out.println(saveArray[checkNameNum].name + "저금통입니다.");
							saveArray[checkNameNum].withdraw();
						} else {
							System.out.println("저금통이 없습니다 다시 선택해주세요");
						}
					}
				}
			} else if (selecting.equals("q")) {
				break;
			} else {
				System.out.println("다시 누르세요.");
			}
		}
	}

}
