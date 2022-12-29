package assinment;

import java.util.Scanner;

public class gcd {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n1 = scn.nextInt();
	int n2 = scn.nextInt();
	int divisor = n1;
	int dividend = n2;
	while (divisor!=0) {

		int rem = dividend % divisor;
		dividend = divisor;
		divisor = rem;
	}
	System.out.println(dividend);
}
}
