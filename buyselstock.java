package assinment;

import java.util.Scanner;

public class buyselstock {
	public static int   tiwari(int arr []) {
		int buy = arr[0];
		int profit =0;
		for(int i = 1; i< arr.length;i++) {
			if(buy>arr[i] ){
				buy=arr[i];
			
			}
			else {
				profit=Math.max(profit, (arr[i]-buy));
			}
		}
		return profit;
		
		
			}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr [] = new int[n];
	for (int i = 0; i < n; i++) {
		arr[i] = scn.nextInt(); 
		
	}
	System.out.println(tiwari(arr));
	
}
}
