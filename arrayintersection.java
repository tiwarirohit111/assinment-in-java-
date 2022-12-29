package assinment;

import java.util.Scanner;

public class arrayintersection {
	public static void intersections(int arr[], int arr1[]) {
	int n=arr.length;
int m=arr1.length;

for(int i=0;i<n;i++){
	// int count=0;
	for(int j=0;j<m;j++){
	
		if(arr[i]==arr1[j]){
			
			System.out.print(arr1[j]+" ");
            arr1[j]=Integer.MAX_VALUE;
            break;
            
		
		
	}
		// if(count!=0){
		// count+=1;
		// }
	}
		
	}
}

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	int arr1 [] = new int[n];
	for(int i = 0; i< n;i++) {
		arr[i] = scn.nextInt();
		arr1[i]= scn.nextInt();
	}

intersections(arr,arr1);
}}
