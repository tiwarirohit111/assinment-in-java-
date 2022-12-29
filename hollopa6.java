package assinment;

import java.util.Scanner;

public class hollopa6 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n =  scn.nextInt();
	int numst = n-(n/2);
	int numso = -1;
	
	int row = 1;
	while(row < n) {
		int cst1 = 0;
		while(cst1 < numst) {
			System.out.print("*"+"\t");
			cst1++;
			
			
		}
		int cso = 0;
		while(cso< n) {
			System.out.print("\t");
			
			cso++;
			
		}
		int cst2 = 0;
		while(cst2< n) {
			System.out.print("*"+"/t");
			cst2++;
			
		}
		System.out.println();
		if(row<n-1) {
			numst--;
			numso= numso+2;
			
		}else {
			numst++;
			numso = numso-2;
		}
		row++;
		
	}
	
}
}
