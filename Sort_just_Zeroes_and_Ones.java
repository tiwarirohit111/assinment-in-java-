package assinment;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_just_Zeroes_and_Ones {
	public static void tiwari(int arr[]) {
		for(int i = 0; i< arr.length; i++) 
			for(int j = i+ 1;i < arr.length; i++) {
				if(arr[j] >= arr[i]) {
					arr[j] = arr[i];
					System.out.println(arr[j]);
				}
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
