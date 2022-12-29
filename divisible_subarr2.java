package assinment;

import java.util.Scanner;

public class divisible_subarr2 {
	public static int tiwari(int arr[]) {
		int count = 0;
		int n = arr.length;
		for(int i = 0; i < arr.length;i++) {
			int sum = (arr[i] + arr[i+1]) % n;
			
			count++;
			return count;
		}
		return 0;
		
	}
public static void main(String[] args) {
	int arr[] = { 5,5,5,5,5};
	
	System.out.println(tiwari(arr));
	
	

	

}

}
