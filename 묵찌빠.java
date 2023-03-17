import java.util.Random;
import java.util.Scanner;
public class RockScissorPaper {
	public static void main(String[] args) {
		//변수 이름 
		//*Result : 가위바위보 결과값 관련, *history,FinalWin : 통계 관련, *Value : 묵,찌,빠 값 관련, r=random, s/ss = scanner
		int winResult = 0; 
		int looseResult = 0;
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		
		for(int a = 0; a < 99999999; a++) {	
			int result = 1;
			String history = "";
			char historyWin = 'W' ;
			char historyLoose = 'L' ;
			char FinalWinCom = 'C' ;
			char FinalWinUser = 'U' ;
					
			for (int i = 0; i < 99999999; i++) {
				
				//컴퓨터 랜덤값 추출
				Random r = new Random();
				int comValue = r.nextInt(3);				
				System.out.println("하나를 입력하세요");
				System.out.println("(묵: 0, 찌: 1, 빠:2)");
				
				//user 입력하기				
				int userValue = s.nextInt(); 
						
				//입력값보여주기
				String userResult = null;
				if(userValue == 0) {
					userResult = "묵";
					}
				else if(userValue == 1) {
					userResult = "찌";
					}
				else if(userValue == 2) {
					userResult = "빠";
					} 						
				System.out.println("당신이 입력한 값 : "+userResult );
				
				//컴퓨터 결과 보여주기
				String comResult = null;
				if(comValue == 0) {
					comResult = "묵";
					}
				else if(comValue == 1) {
					comResult = "찌";
					}
				else if(comValue == 2) {
					comResult = "빠";
					} 				
				
				//이기면 +3 지면 *3 비기면 -10
				//history남기기 L,W : 가위바위보 이긴 기록(W:user 승, L:컴퓨터 승) 묵찌빠 이긴 기록(U:user 승, C:computer승)
				System.out.println("컴퓨터 : " + comResult  );
				if (userValue == 0 && comValue == 1) {
					result = result + 3;
					}
				else if (userValue == 1 && comValue == 2) {
					result = result + 3;
					}
				else if (userValue == 2 && comValue == 0) {
					result = result + 3;
					}
				else if (userValue == comValue) {
					result = result -10;
					}
				else {result = result * 3;
					}
				
				//가위바위보 결과 보여주기, 공격권부여, history 계산
				
				//user 가위바위보 이긴경우
				if (result == 4 || result ==6 ||result ==7) {
					System.out.println("당신 공격입니다.");
					result = 4;
					history = history + historyWin;
					}
				//computer 가위바위보 이긴경우
				else if (result == 3 || result ==12 || result == 9) {
					System.out.println("컴퓨터 공격입니다.");
					result = 3;
					history = history + historyLoose; 
					}				
				
				//user가 묵찌빠 이긴경우 : user가 가위바위보 승 직후 비김			
				else if (result == -6 ) {
					System.out.println("당신이 이겼습니다.");
					winResult = winResult + 1 ;
					history = history + FinalWinUser;
					break;
					}
				
				//computer가 묵찌빠 이긴경우 : computer가 가위바위보 승 직후 비김
				else if (result ==-7 ){
					System.out.println("컴퓨터가 이겼습니다.");
					looseResult = looseResult + 1;
					history = history + FinalWinCom;
					break;
					}			
				
				//처음 가위,바위,보 비긴경우
				else {
					System.out.println("다시하세요");
					result = 1;
					}
				}
				
				System.out.println(history);
				
				//게임 그만하기 or 계속하기
					
				System.out.println("그만 할려면 알파벳 'q'를 누르세요.");
				System.out.println("계속 할려면 아무 숫자나 누르세요.");
				
				String quit = ss.nextLine();
				if (quit.equals("q"))  {
					break;
					}
				else {
					System.out.println("다시 게임을 시작합니다.");;
					}			
			}
		
		//결과 통계	
		System.out.println("결과 ( w : "+ winResult + " L : "+ looseResult + " )");
								
				
	}	
}
	
