package assinment;

import java.util.Scanner;

public class lcm {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n1 = scn.nextInt();
	int n2 = scn.nextInt();
	int divisor = n1;
	int divident = n2;
	
	int mult = (divisor * divident);
	while(divisor % divident != 0) {
		int rem = divident % divisor;
		divident = divisor;
		divisor = rem;
		
		
	}
	int gcd = divident;
	int lcm = mult/divident;
	System.out.println(lcm);
	
}
}
