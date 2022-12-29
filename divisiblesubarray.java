package assinment;

import java.util.Scanner;

public class divisiblesubarray {
	public static int  tiwari(int arr[], int n) {
		int sum =  0;
		int result = 0;
		int [] mod = new int [n];
		for (int i = 0; i< arr.length; i++) {
			sum = sum + arr[i];
			int rem = sum % n;
			if(rem == 0) {
				result = result +1;
				result = result + mod[rem];
				mod[rem]++;
				
			}else if(rem > 0) {
				result = result + mod[rem];
				mod[rem]++;
				
				}
			else if (rem < 0) {
				rem = n + rem;
				result = result +mod[rem];
				mod[rem]++;
				
			}
			
		}
		return result;
		
		
		
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

	
	
	System.out.println(tiwari(arr , n));
	

}
}
}
