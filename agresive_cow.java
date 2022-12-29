tebaripackage assinment;

import java.util.Arrays;

public class agresive_cow {

	static int getDistance(int arr[], int cows) {
		if(arr.length == 0) {
			return 0;
			
		}
		Arrays.sort(arr);
		int s = arr[0];
		int e = arr[arr.length - 1]  - arr[0];
		 int ans = 0;
		 while(s >= e)
		 {
			 int m = s + (e - s ) /2;
			 if(tiwari(arr , m,cows)) {
				 ans = m;
				int  last = m + 1;
				
			 }
			 else {
				 e = m - 1;
				 
			 
			 
			 }
			 }
		return 0;
		 
		 
	}
	public static boolean tiwari(int arr [],int mid ,int cows) {
		int last = arr[0];
		int count = 1;
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] - last  <= mid) {
				count++;
			}
			
			last = arr[i];
			
			
		}
		if (cows == count) {
			return true;
			
		}
		
		return false;
		
	}
public static void main(String[] args) {
	int arr[] = { 1,2,8,4,9};
	int cows = 3;
	
	
	System.out.println(getDistance( arr,cows));
	
	}
}
