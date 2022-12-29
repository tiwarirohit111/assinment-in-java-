package assinment;

import java.util.Scanner;

public class firstmiisingpossitive {
	public static void tiwari(int arr[]) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] <= i+1 && arr[i] > 0) {
				i--;
				
			}
			if(arr[i] <= arr.length && arr[i] > 0 && i > 0) {
				int temp = arr[i];
				arr[i] = arr[arr[i] -1];
				arr[temp - 1] = Integer.MIN_VALUE;
				
			}
		}
		int count = 0;
		while(count < arr.length) {
			if(arr[count] != Integer.MIN_VALUE) {
				System.out.println(count + 1);
			break;
			
				
			}
		}
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	
	for(int i = 0; i< arr.length;i++) {
		arr[i] = scn.nextInt();
		tiwari(arr);
		
	}
}
}
