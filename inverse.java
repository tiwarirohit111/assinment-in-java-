package assinment;

import java.util.Scanner;

public class inverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		int pos = 1;
		int ans = 0;
		while (num != 0) {
			int digit = num % 10;

			int mult = (int) Math.pow(10, digit - 1);

			ans = ans + pos * mult;
			num = num / 10;
			pos++;
		}
		System.out.println(ans);

	}
}
