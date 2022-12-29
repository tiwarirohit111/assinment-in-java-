package assinment;

import java.util.Arrays;
import java.util.Scanner;

public class majorityelement {
	public static int  tiwari(int arr[]) {
		int index = 1;
		int count  = 0;
		Arrays.sort(arr);
		int mid = (index + arr.length- 1)/2;
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i]  == arr[mid]) {
				return arr[mid];
				
			}
			
		}
		return -1;
		
	}

	
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr [] = new int[n];
	for(int i = 0; i < arr.length; i++) {
		arr[i] = scn.nextInt();
		
		
	}
	System.out.println(tiwari(arr));
	}
}
