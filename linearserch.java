package assinment;

import java.util.Scanner;

public class linearserch {
	public static void tiwari(int [] arr,int target) {
		for(int i = 0; i< arr.length  ;i++) {
			if(arr[i]==target) {
				
				System.out.println(i);	
			}
			
		}
	
		
		
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int [] arr = new int[n];
	for(int i = 0; i< n;i++) {
		arr[i] = scn.nextInt();
		
	}
	int target = scn.nextInt();
	tiwari(arr,target);
	
}
}
