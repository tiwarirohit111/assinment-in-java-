package assinment;

import java.util.Scanner;

public class arraylinear {



	public static void  tiwari(int arr[],int num) {
		int n = arr.length;
		
	
		
		for(int i = 0; i< arr.length; i++) {
			
			if(arr[i] == num) {
			System.out.println(arr[i]);
			
			}
		}
		
	}
	
		
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	
	for(int i = 0; i< n; i++) {
		arr[i] = scn.nextInt();
	}
	int num  = scn.nextInt();
	tiwari(arr,num);

}



}
