import java.util.Scanner;

public class ScoreKorean {
	public static void main(String[] args) {
		System.out.println("국어점수를 입력해주세요");
		
		Scanner s = new Scanner(System.in);
		int scoreKorean = s.nextInt();
		
		if(scoreKorean < 0|| scoreKorean > 100) {
			System.out.println("0~100에서 100의 값을 입력해주세요");
			return;//if문 전으로 돌아간다.
		}
		System.out.println("국어점수는 " + scoreKorean +"점 입니다.");
		if(scoreKorean  >= 90) {System.out.println("A");
		} else if(scoreKorean  >=80) {
			System.out.println("B");}
		 else if(scoreKorean  >=70) {
			System.out.println("C");}
		 else if(scoreKorean  >=60) {
			System.out.println("D");}
		 else 
			{System.out.println("F");}
		
		
				
	}

}
