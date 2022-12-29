package assinment;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num = 12345;
		int ans = 0;
		while(num > 0) {
			int digit = num % 10;
			num = num / 10;
			ans = ans * 10 + digit;
			
		}
		System.out.println(ans);
		
	}

}
