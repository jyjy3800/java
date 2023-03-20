package codingtest;

import java.util.Arrays;

public class print_array {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		String str = Arrays.toString(a);
		//str에 조작을 가해서 원소들이 밑으로 한줄로 세우세요
		str = str.replace("]","");		
		str = str.replace("[","");	
		String strResult[] = str.split(",");
		for (int i = 0; i < strResult.length;i++) {
			strResult[i] = strResult[i].trim(); 
			System.out.println(strResult[i]);			
		}
		
	}

}
