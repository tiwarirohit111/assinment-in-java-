package assinment;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long ans = 0;
		while(num != 0) {
			long digit = num%10;
			ans = ans * 10+ digit;
			num = num /10;
			
		}
		System.out.println(ans);
	}

}
