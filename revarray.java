package assinment;

import java.util.Scanner;

public class revarray {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int [] arr = new int[n];
	for(int i = 0; i < n;i++) {
		 arr[i] = scn.nextInt();
		
	}
		 
	rev(arr,n);
	
		 
	}
	public static void  rev(int [] arr, int n) {
		 int t = 0;
		 for(int i = 0; i< n/2;i++) {
			 
			 t = arr[i];
			 arr[i] = arr[n- i-1];
			 arr[n-i-1] = t;
			 
			 
		 }
		 for(int k =0;k <n; k++) {
			 System.out.println(arr[k]);
		 }
		    }
		  
	

		
	}



