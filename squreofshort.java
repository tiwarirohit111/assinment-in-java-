package assinment;



import java.util.Arrays;
import java.util.Scanner;





public class squreofshort {
	
	 private static void tiwari(int[] arr) {
		  Arrays.sort(arr);
		for(int i = 0; i <arr.length; i++) {
	        
			arr[i]= arr[i] *arr[i];
			System.out.println(arr[i]);
		}
		}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int arr[] = new int[n];
	for(int i = 0; i< arr.length;i++) {
		arr[i] = scn.nextInt();
		
	}
	tiwari(arr);
	
}
}
