package assinment;

import java.util.Scanner;

public class HollowRhombusPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row =  1;
		int numst = n;
		int numso = n-1;
		
		while(row<= n) {
			int cso =0;
			while(cso < numso) {
				System.out.print("  ");
				cso++;
				
			}
			int cst = 0;
			while(cst < numst ) {
				if( row > 1&& cst<n-1 && row < n && cst > 0) {
					
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
				cst++;
				
			}
			System.out.println();
			row++;
			numso--;
			
		
			
			
			
	
		}
			
		
	}
}
