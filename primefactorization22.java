package assinment;

import java.util.Scanner;

public class primefactorization22 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int count = 0;
	
	for (int i =2; i< n;i++) {
		while(n%i ==0) {
			System.out.print(i+" ");
			n = n/i;
		
		}
	}
	if(n != 1) {
		System.out.println(n +" ");
		
	
	}
	if (n  == n*n) {
		System.out.println(n+ " ");
	}
	
	
	}

}
