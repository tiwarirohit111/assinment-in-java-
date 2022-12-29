package assinment;

import java.util.Scanner;

public class nthfebonacci {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	
		int i = 1;

		int a = 0;
		int b = 1;
		while (i <= n) {
			int c = a + b;
//			System.out.println(c);

			a = b;
			b = c;
			i++;
		}
		System.out.println(a);
	
}
}
