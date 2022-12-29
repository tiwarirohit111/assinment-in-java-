package assinment;

import java.util.Scanner;

public class array {
	public static void sum(int [] arr) {
		int n = arr.length;
		int sum = 0;
		
		for(int i= 0; i < n; i++) {
			sum = sum + arr[i];
			System.out.println(sum);
		}
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int [] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i]= scn.nextInt();
				
			}
	for(int i= 0; i < n; i++) {
		System.out.println(arr[i]);
	}
	sum(arr);
	 
}


}
