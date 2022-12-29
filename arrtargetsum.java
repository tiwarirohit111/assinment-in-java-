package assinment;

import java.util.Scanner;

public class arrtargetsum {
	public static void tiwari(int [] arr ) {
		int n = arr.length;
		int sum = 0;
		int num = 0;
		
		
		for(int i = 0; i< n;i++) {
			sum = sum + arr[i];
			if(num ==sum ) {
				System.out.println();
			}
			
		}
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int [] arr = new int[n];
	for(int i = 0; i < n; i++) {
		arr[i]= scn.nextInt();
		int num = scn.nextInt();
	}
}
}
