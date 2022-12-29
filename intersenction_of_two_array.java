package assinment;

import java.util.Arrays;
import java.util.Scanner;

public class intersenction_of_two_array {
	public static int[] tiwari(int[] arr) {
		Arrays.sort(arr);
		int first[] = new int[arr.length];
		
		for(int i = 0; i< first.length; i++) {
			
			
		}
		
	return first;
	
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in) ;
	int t = scn.nextInt();
	while(t > 0) {
		int n = scn.nextInt();
		int arr[] =  new int[n];
		for(int i = 0; i< arr.length;i++) {
			arr[i] = scn.nextInt();
			
		}
		
		t--;
	
	System.out.println(tiwari(arr));	
}
}
}