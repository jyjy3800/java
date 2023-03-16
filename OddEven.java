
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i<9999999; i++) {
			System.out.println("숫자를 입력하세요");
			System.out.println("나가고 싶으면 q를 입력하세요");
			
			String input = s.nextLine();
			if (input.equals("q")){
				break;
			}
			System.out.println(i+1+"번째 입력입니다.");
			int inputNumber = Integer.parseInt(input);
			
			if(inputNumber % 2 == 0) {
				System.out.println("짝수입니다.");
			} else if(inputNumber % 2 ==1){
				System.out.println("홀수입니다.");
			} 
		
			 
			
		}
	}
}

