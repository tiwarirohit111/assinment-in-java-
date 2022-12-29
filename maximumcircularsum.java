package assinment;

import java.util.Scanner;

public class maximumcircularsum {
	public static int tiwari(int arr[]) {
		 int min = Integer.MAX_VALUE; 
			int max = Integer.MIN_VALUE;
	        int sum  = 0;
	        int tsum=0;
	        int max2 = Integer.MIN_VALUE;
	        
	        for(int i=0;i<arr.length;i++) {
	        	tsum+=arr[i];
	        }
             for(int i = 0; i< arr.length;i++) {
		
				sum += i;
				if(sum < 0) {
					sum = 0;
					
				}
				if(sum > max) {
					max = sum;
					
				}
			
			
				
			}
             for(int i =0; i< arr.length; i++) {
            arr[i] = arr[i]* -1;
            
             }
             sum=0;
             for (int i = 0; i< arr.length;i++ ) {
            	 sum = +i;
            	 if(sum < 0) {
            		 sum = 0;
            		 
            	 }
            	 if(sum > max2) {
            		 max2 = sum;
            		 
            		 
            	 }
            	 
             }
             int pa1=max;
             int pa2=tsum+max2;
             return max2;
	  
	        
	        
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t = scn.nextInt();
	while(t > 0) {
	int n = scn.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i< arr.length;i++) {
		arr[i] = scn.nextInt();
	}
	t--;
      System.out.println(tiwari(arr));

	
	}
	
}
}

