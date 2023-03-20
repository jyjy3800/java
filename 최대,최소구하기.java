import java.util.Arrays;
import java.util.Scanner;

public class HW_maxmin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = 5;
		int[] list = new int[num];
		for(int i=0; i < num; i++) {
			int input = s.nextInt();
			list[i] = input; 			
		}
		int start = list[0];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		
		for(int i =0; i<list.length; i++) {
					
					if (max < list[i]) {
						max = list[i];
					}
					if (min > list[i]) {
						min = list[i];
					}
		}
		
		System.out.println("최대값 : " + max + " 최소값 : " + min);
				
				
	}

}
