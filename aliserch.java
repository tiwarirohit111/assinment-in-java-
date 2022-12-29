package assinment;

import java.util.Scanner;

public class aliserch {
public static void main(String[] args) {
	
	
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int[] arr = new int[n];
	for(int  i = 0; i<n; i++) {
		arr[i] = scn.nextInt();
		
	}
	
	tiwari(arr);
	System.out.println(tiwari(arr));
	}
	public static int tiwari(int[] arr) {
		int min = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num > min) {
				min = num;
				
			}
			
			
		}
		return min;
		
	}
	

}
