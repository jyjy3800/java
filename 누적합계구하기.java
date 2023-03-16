
public class HW_quiz_0313 {
	public static void main(String[] args) {
		//1~100 누적합 구하기. 3의 배수만 누적합
		int sum1 = 0;
		for(int i =0; i<=100; i = i+3 ) {sum1 = sum1 +i;}
		System.out.println(sum1);
		
	System.out.println(".................");
		
		int sum2 = 0;
		for(int i = 0 ; i <= 100; i++) {
			if( i % 6 == 0) {sum2 = sum2 + i;}
				
		}
		System.out.println(sum2);	
			
		System.out.println(".................");	
	  
		
		//1~100 누적합 구하기. 홀수만 누적합
		
		int sum3 = 0;
		for(int i = 0 ; i <= 100; i++) {
			if( i % 2 == 1) {sum3 = sum3 + i;}				
		}
		System.out.println(sum3);	
		
		////////////////
		//1~100 누적합을 구하기. n의 배수만 누적합	
		int sum4 =0; 
		int m1 = 2;
		for(int i =0 ; i<=100/m1; i ++) {sum4 = sum4 + m1*i;}
		System.out.println(sum4);
		
		
		
		
		}

}
