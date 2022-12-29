package assinment;

import java.util.Scanner;

public class countdigit {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int count = scn.nextInt();
	int digit = 0;
	while(n != 0) {
		int rem = n % 10;
		n = n/ 10;
		if(digit==rem) {
			count++;
			
		}
		System.out.println(count);
	}
}
}
