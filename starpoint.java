import java.util.Scanner;

public class starpoint {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();		
		for (int a = 0; a < row; a++) {
			for (int i =0; i<row-a; i++) {
				System.out.print(" ");
			}
			for (int j =0; j<(1+(2*a)); j++) {
				System.out.print("*");
			}
			for (int i =0; i<row-a; i++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
	
		
	}

}
