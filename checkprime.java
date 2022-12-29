package assinment;

import java.util.Scanner;

public class checkprime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int div = 1;
		int numFact = 0;
		while (div <= n) {

			int rem = n % div;
			if (rem == 0) {
//				System.out.println("nacho");
				numFact = numFact + 1;
			}
			div++;
		}
//		System.out.println(numFact);
		if (numFact == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
}
}
