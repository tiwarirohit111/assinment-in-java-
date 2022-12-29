package assinment;

import java.util.Scanner;

public class patternnumladder {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int numst = 1;
		int rnum = 1;
		
		
		while(row <= n) {
			int ntp = rnum;
			int cst = 0;
			while( cst < numst) {
				System.out.print(ntp + "\t");
				cst++;
				ntp++;
				
				
			}
		System.out.println();
		row++;
		numst++;
		
		
		}
	}
}
