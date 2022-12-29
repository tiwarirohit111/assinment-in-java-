package assinment;

import java.util.Scanner;

public class aliserch2 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr [] = new int[n];
//	int num = scn.nextInt();
	
	for(int i = 0; i < n; i++) {
		arr[i] = scn.nextInt();
		
	}
	int num = scn.nextInt();
	System.out.println(find(arr, num));
	
	}
	public static int find(int [] arr,int n) {
		int count = 0;
	
		for(int i = 0; i< arr.length;i++) {
			if(arr[i]== n) {
				count++;
				
				
			}
		}

	return count;
	
}
}
