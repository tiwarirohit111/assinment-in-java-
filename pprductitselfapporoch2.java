package assinment;

import java.util.Scanner;

public class pprductitselfapporoch2 {
	public static void tiwari(int arr[]) {
		long value = 1;
		
		long arr1[] = new long[arr.length];
		arr1[0]=arr[0];
		for(int i = 1; i< arr.length;i++) {
			arr1[i] = arr1[i-1] * arr[i];
			
		}
		long right=1;
		long ans[]=new long[arr.length];
		for(int i=arr.length-1;i>0;i--) {
			ans[i]=arr1[i-1]*right;
			right=right*arr[i];
		}
		ans[0]=right;
	
		for(int i = 0; i<arr.length;i++){
           System.out.print(ans[i]+" ");
        }
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i< arr.length;i++) {
		arr[i]= scn.nextInt();
		
	}
	tiwari(arr);
}
}