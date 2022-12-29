package assinment;

import java.util.Scanner;

public class productitself {
	public static void tiwari(int arr[]) {
		int product = 1;
		int arr1 [] = new int[arr.length];
		
		
		for(int i= 0; i< arr.length; i++) {
			for(int j = 0;j<arr.length;j++) {
				if(arr[j] != arr[i]) {
					product = product *arr[j];
				
				}
				
			}
			arr1[i] =product;
			product=1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i] +" ");
		}
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	
	int arr[] = new int[n];
	for(int i = 0; i< arr.length;i++) {
		arr[i] = scn.nextInt();
		
	}
	tiwari(arr);
	
}
}
