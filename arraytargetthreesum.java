package assinment;

import java.util.Arrays;
import java.util.Scanner;

public class arraytargetthreesum {
	  public static void main(String args[]) {
	        Scanner scn=new Scanner(System.in);
	        int size=scn.nextInt();
	        int arr[] = new int[size];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=scn.nextInt();
	        }
	        
	       int sum = scn.nextInt();
	        printPairs(arr, sum);
	    }
	     static void printPairs(int arr[], int sum){
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length; i++)
	            for (int j = i+1; j < arr.length; j++)
	            for(int k=j+1;k<arr.length;k++)
	                if (arr[i] + arr[j] + arr[k] == sum)
	                    System.out.println(arr[i] + ", " + arr[j] + " and "+arr[k]);
	    }
	}
