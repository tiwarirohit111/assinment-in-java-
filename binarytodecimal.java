package assinment;

import java.util.Scanner;

public class binarytodecimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int mult = 1;
		int ans = 0;
		while(num > 0) {
			int digit = num %10;
			ans = ans +digit *mult;
			num = num/10;
			mult = mult*2;
			
		}
		System.out.println(ans);
}
}
