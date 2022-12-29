package assinment;

import java.util.Scanner;

public class missingpositive {
	public static int tiwari(int arr []) {
		int n = arr.length;
		int N = 10000;
		 boolean[] present = new boolean[N];
		  int maxele = Integer.MIN_VALUE;
		  for (int i = 0; i < n; i++) {
			  if (arr[i] > 0 && arr[i] <= n)
	                present[arr[i]] = true;
			  maxele = Math.max(maxele, arr[i]);
			  for (int i1 = 1; i1 < N; i1++) {
		            if (!present[i1])
		                return i1;
			  }
			 
			  }		 
		return 0;
		
		
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	for(int i = 0;i<n; i++) {
		arr [i] = scn.nextInt();
		
		
	}
	tiwari(arr);
	
}
}
