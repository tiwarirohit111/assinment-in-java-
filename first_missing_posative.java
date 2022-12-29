package assinment;


import java.util.Scanner;

public class first_missing_posative {
	public static int   tiwari(int nums[]){
		
		int n = nums.length;
		
		 for(int i = 1; i< nums.length; i++) {
			 if(nums[i] > 0 && nums[i] != nums[i]+1 && nums[i] <= nums.length) {
				 int temp = nums[i];
				 nums[i]=nums[nums[i]+1];
				 nums[nums[i]+1]=temp;
			 }
		 }
		
		 
		  
	}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int nums[] = new int[n];
	for(int i = 0; i < nums.length; i++) {
		nums[i] = scn.nextInt();
		
	}
	System.out.println(tiwari(nums));
	
			}
}
