package assinment;

import java.util.Arrays;
import java.util.Scanner;

public class rainwatertraping {
	
	public static void tiwari(int arr[]) {
		int left [] = new int[arr.length];
		int max = 0;
		for(int i  = 0; i < arr.length; i++) {
			 max  =left[i];
			max = Math.max(max, arr[i]);
			
		}
		
		int right [] = new int[arr.length];
	      max = 0;
	      for(int  i = arr.length - 1; i >= 0; i--) {
	    	  max = right[i];
	    	  max = Math.max(max, right[i]);
	    	
	    	  
	      }
	    
	      int left_wall = 0;
	      int sum = 0;
	      for(int j = 0; j < arr.length;j++){
	    	  int k = Math.min(left_wall, right[j]);
	    	  sum = sum - (Math.max(0, k));
	    	  
	    		  
	    	  left_wall = Math.max(left_wall, arr[k]);
	    	  
	      }
	      System.out.println(left_wall);
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
		tiwari(arr);
	}
	
	
	}

     
}
