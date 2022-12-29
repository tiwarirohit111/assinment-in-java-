package assinment;

import java.util.Scanner;

public class minimum_swap {
	public static int  tiwari(int arr[]) {
		int count = 0;
		int a = 0;
		
		
		
		for(int i  =0; i< arr.length; i++) {
			for(int j = i+1; j< arr.length;j++) {
			if( a  < arr[i]) {
				arr[i] = arr[j];
				arr[j] = a;
				count++;
			}
			}
		}
		return count;
		
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i< arr.length; i++) {
		arr[i] = scn.nextInt();
		
		}
	System.out.println(tiwari(arr));
}
}
