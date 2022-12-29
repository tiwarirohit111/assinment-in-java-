package assinment;

import java.util.Scanner;

public class reversequadratingequatin {
	    public static void main(String args[]) {
	 Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = b*b - 4*a*c;
		int droot = (int)Math.sqrt(d);
		if (d>0) {
			System.out.println("Real and Distinct");
			System.out.print(((-droot-b)/(2*a))+" ");
			System.out.println((droot-b)/(2*a));
		}
		else if (d==0) 
		{
		System.out.println("Real and Equal");
		System.out.print(((-droot-b)/(2*a))+" ");
		System.out.println((droot-b)/(2*a));
		}
		else {
			System.out.println("Imaginary");
			}
	    }
}
