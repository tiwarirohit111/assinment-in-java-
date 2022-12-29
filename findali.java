package assinment;

import java.util.Scanner;

public class findali {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr [] = new int[n];
	int num = scn.nextInt();
	
	for(int i = 0; i < n; i++) {
		arr[i] = scn.nextInt();
		
	}
	System.out.println(find(arr, n));
	
	}
	public static int find(int [] arr,int n) {
	int count = 0;
	
		for(int i = 0; i< arr.length;i++) {
			if(arr[i]== n) {
			}
			if (count == i)
				return count++;
				
				
			

		}

	
		return 0 ;
		
	}
}

