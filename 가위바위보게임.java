import java.util.Random;
import java.util.Scanner;


public class HomeworkFirst {
	public static void main(String[] args) {
		int sumDraw =0; int sumWin =0; int sumLoose =0;
		for (int i=0; i<9999; i++) {
		Random r = new Random();
		int comValue = r.nextInt(3);
		
		//게임인트로
		System.out.println("가위바위보 게임입니다.");
		System.out.println("하나를 입력하세요");
		System.out.println("(가위: 0, 바위: 1, 보:2)");
		
		Scanner s = new Scanner(System.in);
		int userValue = s.nextInt(); 
		
		//User의 입력값 보여주기
		String userResult = null;
		if(userValue == 0) {
			 userResult = "가위";}
		if(userValue == 1) {
			 userResult = "바위";}
		if(userValue == 2) {
			 userResult = "보";} 		
		
		System.out.println("당신이 입력한 값 : "+userResult);
		
		//컴퓨터 랜덤값 결과보여주기
		String comResult = null;
		if(comValue == 0) {
			 comResult = "가위";}
		if(comValue == 1) {
			 comResult = "바위";}
		if(comValue == 2) {
			 comResult = "보";} 				
		System.out.println("컴퓨터 : " + comResult +" 입니다." );
		
		//결과 보여주기
		if(comValue == userValue) {						
			System.out.println("비겼습니다.");
			sumDraw = sumDraw + 1;}
		else if (userValue == 0 && comValue == 2) {
			System.out.println("이겼습니다.");
			sumWin = sumWin + 1;}
		else if (userValue == 1 && comValue == 0) 
		{sumWin = sumWin + 1;
			System.out.println("이겼습니다.");}
		else if (userValue == 2 && comValue == 1) {
			sumWin = sumWin + 1;
			System.out.println("이겼습니다.");}
		else {
			System.out.println("졌습니다.");	
			sumLoose = sumLoose + 1;}
		
		//게임결과통계
		System.out.println(i+1+"번째 게임입니다.");
	    System.out.println("W : " + sumWin + "회, L : " + sumLoose + "회, D : " + sumDraw );
	    
	    //다음판과 구분
	    System.out.println("");
		}
	}
}


